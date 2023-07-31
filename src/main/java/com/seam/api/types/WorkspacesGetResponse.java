package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = WorkspacesGetResponse.Builder.class)
public final class WorkspacesGetResponse {
    private final Optional<Workspace> workspace;

    private final boolean ok;

    private WorkspacesGetResponse(Optional<Workspace> workspace, boolean ok) {
        this.workspace = workspace;
        this.ok = ok;
    }

    @JsonProperty("workspace")
    public Optional<Workspace> getWorkspace() {
        return workspace;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WorkspacesGetResponse && equalTo((WorkspacesGetResponse) other);
    }

    private boolean equalTo(WorkspacesGetResponse other) {
        return workspace.equals(other.workspace) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.workspace, this.ok);
    }

    @Override
    public String toString() {
        return "WorkspacesGetResponse{" + "workspace: " + workspace + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(WorkspacesGetResponse other);
    }

    public interface _FinalStage {
        WorkspacesGetResponse build();

        _FinalStage workspace(Optional<Workspace> workspace);

        _FinalStage workspace(Workspace workspace);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Optional<Workspace> workspace = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(WorkspacesGetResponse other) {
            workspace(other.getWorkspace());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage workspace(Workspace workspace) {
            this.workspace = Optional.of(workspace);
            return this;
        }

        @Override
        @JsonSetter(value = "workspace", nulls = Nulls.SKIP)
        public _FinalStage workspace(Optional<Workspace> workspace) {
            this.workspace = workspace;
            return this;
        }

        @Override
        public WorkspacesGetResponse build() {
            return new WorkspacesGetResponse(workspace, ok);
        }
    }
}
