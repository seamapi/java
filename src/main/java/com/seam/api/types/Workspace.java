package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = Workspace.Builder.class)
public final class Workspace {
    private final String workspaceId;

    private final String name;

    private final boolean isSandbox;

    private final Optional<String> connectPartnerName;

    private Workspace(String workspaceId, String name, boolean isSandbox, Optional<String> connectPartnerName) {
        this.workspaceId = workspaceId;
        this.name = name;
        this.isSandbox = isSandbox;
        this.connectPartnerName = connectPartnerName;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("is_sandbox")
    public boolean getIsSandbox() {
        return isSandbox;
    }

    @JsonProperty("connect_partner_name")
    public Optional<String> getConnectPartnerName() {
        return connectPartnerName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Workspace && equalTo((Workspace) other);
    }

    private boolean equalTo(Workspace other) {
        return workspaceId.equals(other.workspaceId)
                && name.equals(other.name)
                && isSandbox == other.isSandbox
                && connectPartnerName.equals(other.connectPartnerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.workspaceId, this.name, this.isSandbox, this.connectPartnerName);
    }

    @Override
    public String toString() {
        return "Workspace{" + "workspaceId: " + workspaceId + ", name: " + name + ", isSandbox: " + isSandbox
                + ", connectPartnerName: " + connectPartnerName + "}";
    }

    public static WorkspaceIdStage builder() {
        return new Builder();
    }

    public interface WorkspaceIdStage {
        NameStage workspaceId(String workspaceId);

        Builder from(Workspace other);
    }

    public interface NameStage {
        IsSandboxStage name(String name);
    }

    public interface IsSandboxStage {
        _FinalStage isSandbox(boolean isSandbox);
    }

    public interface _FinalStage {
        Workspace build();

        _FinalStage connectPartnerName(Optional<String> connectPartnerName);

        _FinalStage connectPartnerName(String connectPartnerName);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WorkspaceIdStage, NameStage, IsSandboxStage, _FinalStage {
        private String workspaceId;

        private String name;

        private boolean isSandbox;

        private Optional<String> connectPartnerName = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Workspace other) {
            workspaceId(other.getWorkspaceId());
            name(other.getName());
            isSandbox(other.getIsSandbox());
            connectPartnerName(other.getConnectPartnerName());
            return this;
        }

        @Override
        @JsonSetter("workspace_id")
        public NameStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        @JsonSetter("name")
        public IsSandboxStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("is_sandbox")
        public _FinalStage isSandbox(boolean isSandbox) {
            this.isSandbox = isSandbox;
            return this;
        }

        @Override
        public _FinalStage connectPartnerName(String connectPartnerName) {
            this.connectPartnerName = Optional.of(connectPartnerName);
            return this;
        }

        @Override
        @JsonSetter(value = "connect_partner_name", nulls = Nulls.SKIP)
        public _FinalStage connectPartnerName(Optional<String> connectPartnerName) {
            this.connectPartnerName = connectPartnerName;
            return this;
        }

        @Override
        public Workspace build() {
            return new Workspace(workspaceId, name, isSandbox, connectPartnerName);
        }
    }
}
