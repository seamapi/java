package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = ActionAttemptsGetResponse.Builder.class)
public final class ActionAttemptsGetResponse {
    private final ActionAttemptsGetResponseActionAttempt actionAttempt;

    private final boolean ok;

    private int _cachedHashCode;

    ActionAttemptsGetResponse(ActionAttemptsGetResponseActionAttempt actionAttempt, boolean ok) {
        this.actionAttempt = actionAttempt;
        this.ok = ok;
    }

    @JsonProperty("action_attempt")
    public ActionAttemptsGetResponseActionAttempt getActionAttempt() {
        return actionAttempt;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptsGetResponse && equalTo((ActionAttemptsGetResponse) other);
    }

    private boolean equalTo(ActionAttemptsGetResponse other) {
        return actionAttempt.equals(other.actionAttempt) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        if (_cachedHashCode == 0) {
            _cachedHashCode = Objects.hash(this.actionAttempt, this.ok);
        }
        return _cachedHashCode;
    }

    @Override
    public String toString() {
        return "ActionAttemptsGetResponse{" + "actionAttempt: " + actionAttempt + ", ok: " + ok + "}";
    }

    public static ActionAttemptStage builder() {
        return new Builder();
    }

    public interface ActionAttemptStage {
        OkStage actionAttempt(ActionAttemptsGetResponseActionAttempt actionAttempt);

        Builder from(ActionAttemptsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ActionAttemptsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptStage, OkStage, _FinalStage {
        private ActionAttemptsGetResponseActionAttempt actionAttempt;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ActionAttemptsGetResponse other) {
            actionAttempt(other.getActionAttempt());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("action_attempt")
        public OkStage actionAttempt(ActionAttemptsGetResponseActionAttempt actionAttempt) {
            this.actionAttempt = actionAttempt;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public ActionAttemptsGetResponse build() {
            return new ActionAttemptsGetResponse(actionAttempt, ok);
        }
    }
}
