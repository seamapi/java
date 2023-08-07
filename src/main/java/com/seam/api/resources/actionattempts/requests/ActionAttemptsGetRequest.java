package com.seam.api.resources.actionattempts.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptsGetRequest.Builder.class)
public final class ActionAttemptsGetRequest {
    private final String actionAttemptId;

    private ActionAttemptsGetRequest(String actionAttemptId) {
        this.actionAttemptId = actionAttemptId;
    }

    @JsonProperty("action_attempt_id")
    public String getActionAttemptId() {
        return actionAttemptId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptsGetRequest && equalTo((ActionAttemptsGetRequest) other);
    }

    private boolean equalTo(ActionAttemptsGetRequest other) {
        return actionAttemptId.equals(other.actionAttemptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.actionAttemptId);
    }

    @Override
    public String toString() {
        return "ActionAttemptsGetRequest{" + "actionAttemptId: " + actionAttemptId + "}";
    }

    public static ActionAttemptIdStage builder() {
        return new Builder();
    }

    public interface ActionAttemptIdStage {
        _FinalStage actionAttemptId(String actionAttemptId);

        Builder from(ActionAttemptsGetRequest other);
    }

    public interface _FinalStage {
        ActionAttemptsGetRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptIdStage, _FinalStage {
        private String actionAttemptId;

        private Builder() {}

        @Override
        public Builder from(ActionAttemptsGetRequest other) {
            actionAttemptId(other.getActionAttemptId());
            return this;
        }

        @Override
        @JsonSetter("action_attempt_id")
        public _FinalStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @Override
        public ActionAttemptsGetRequest build() {
            return new ActionAttemptsGetRequest(actionAttemptId);
        }
    }
}
