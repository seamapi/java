package com.seam.api.resources.actionattempts.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptsListRequest.Builder.class)
public final class ActionAttemptsListRequest {
    private final List<String> actionAttemptIds;

    private ActionAttemptsListRequest(List<String> actionAttemptIds) {
        this.actionAttemptIds = actionAttemptIds;
    }

    @JsonProperty("action_attempt_ids")
    public List<String> getActionAttemptIds() {
        return actionAttemptIds;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptsListRequest && equalTo((ActionAttemptsListRequest) other);
    }

    private boolean equalTo(ActionAttemptsListRequest other) {
        return actionAttemptIds.equals(other.actionAttemptIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.actionAttemptIds);
    }

    @Override
    public String toString() {
        return "ActionAttemptsListRequest{" + "actionAttemptIds: " + actionAttemptIds + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<String> actionAttemptIds = new ArrayList<>();

        private Builder() {}

        public Builder from(ActionAttemptsListRequest other) {
            actionAttemptIds(other.getActionAttemptIds());
            return this;
        }

        @JsonSetter(value = "action_attempt_ids", nulls = Nulls.SKIP)
        public Builder actionAttemptIds(List<String> actionAttemptIds) {
            this.actionAttemptIds.clear();
            this.actionAttemptIds.addAll(actionAttemptIds);
            return this;
        }

        public Builder addActionAttemptIds(String actionAttemptIds) {
            this.actionAttemptIds.add(actionAttemptIds);
            return this;
        }

        public Builder addAllActionAttemptIds(List<String> actionAttemptIds) {
            this.actionAttemptIds.addAll(actionAttemptIds);
            return this;
        }

        public ActionAttemptsListRequest build() {
            return new ActionAttemptsListRequest(actionAttemptIds);
        }
    }
}
