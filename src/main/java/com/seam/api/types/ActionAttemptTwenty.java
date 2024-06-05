/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptTwenty.Builder.class)
public final class ActionAttemptTwenty {
    private final String actionAttemptId;

    private final Optional<String> result;

    private final ActionAttemptTwentyError error;

    private final Map<String, Object> additionalProperties;

    private ActionAttemptTwenty(
            String actionAttemptId,
            Optional<String> result,
            ActionAttemptTwentyError error,
            Map<String, Object> additionalProperties) {
        this.actionAttemptId = actionAttemptId;
        this.result = result;
        this.error = error;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return <hr />
     * <pre><code>title: Action Attempt ID
     * ---
     * The ID of the action attempt.
     * </code></pre>
     */
    @JsonProperty("action_attempt_id")
    public String getActionAttemptId() {
        return actionAttemptId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return "error";
    }

    @JsonProperty("result")
    public Optional<String> getResult() {
        return result;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return "SET_FAN_MODE";
    }

    @JsonProperty("error")
    public ActionAttemptTwentyError getError() {
        return error;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptTwenty && equalTo((ActionAttemptTwenty) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptTwenty other) {
        return actionAttemptId.equals(other.actionAttemptId)
                && result.equals(other.result)
                && error.equals(other.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.actionAttemptId, this.result, this.error);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActionAttemptIdStage builder() {
        return new Builder();
    }

    public interface ActionAttemptIdStage {
        ErrorStage actionAttemptId(String actionAttemptId);

        Builder from(ActionAttemptTwenty other);
    }

    public interface ErrorStage {
        _FinalStage error(ActionAttemptTwentyError error);
    }

    public interface _FinalStage {
        ActionAttemptTwenty build();

        _FinalStage result(Optional<String> result);

        _FinalStage result(String result);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptIdStage, ErrorStage, _FinalStage {
        private String actionAttemptId;

        private ActionAttemptTwentyError error;

        private Optional<String> result = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ActionAttemptTwenty other) {
            actionAttemptId(other.getActionAttemptId());
            result(other.getResult());
            error(other.getError());
            return this;
        }

        /**
         * <hr />
         * <pre><code>title: Action Attempt ID
         * ---
         * The ID of the action attempt.
         * </code></pre>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("action_attempt_id")
        public ErrorStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @Override
        @JsonSetter("error")
        public _FinalStage error(ActionAttemptTwentyError error) {
            this.error = error;
            return this;
        }

        @Override
        public _FinalStage result(String result) {
            this.result = Optional.of(result);
            return this;
        }

        @Override
        @JsonSetter(value = "result", nulls = Nulls.SKIP)
        public _FinalStage result(Optional<String> result) {
            this.result = result;
            return this;
        }

        @Override
        public ActionAttemptTwenty build() {
            return new ActionAttemptTwenty(actionAttemptId, result, error, additionalProperties);
        }
    }
}
