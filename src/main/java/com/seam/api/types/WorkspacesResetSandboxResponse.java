package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = WorkspacesResetSandboxResponse.Builder.class)
public final class WorkspacesResetSandboxResponse {
    private final String message;

    private final boolean ok;

    private WorkspacesResetSandboxResponse(String message, boolean ok) {
        this.message = message;
        this.ok = ok;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WorkspacesResetSandboxResponse && equalTo((WorkspacesResetSandboxResponse) other);
    }

    private boolean equalTo(WorkspacesResetSandboxResponse other) {
        return message.equals(other.message) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.message, this.ok);
    }

    @Override
    public String toString() {
        return "WorkspacesResetSandboxResponse{" + "message: " + message + ", ok: " + ok + "}";
    }

    public static MessageStage builder() {
        return new Builder();
    }

    public interface MessageStage {
        OkStage message(String message);

        Builder from(WorkspacesResetSandboxResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        WorkspacesResetSandboxResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MessageStage, OkStage, _FinalStage {
        private String message;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(WorkspacesResetSandboxResponse other) {
            message(other.getMessage());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("message")
        public OkStage message(String message) {
            this.message = message;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public WorkspacesResetSandboxResponse build() {
            return new WorkspacesResetSandboxResponse(message, ok);
        }
    }
}
