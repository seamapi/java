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
@JsonDeserialize(builder = ActionAttemptTwentyOne.Builder.class)
public final class ActionAttemptTwentyOne {
    private final String actionAttemptId;

    private final Optional<String> result;

    private final Optional<String> error;

    private final Map<String, Object> additionalProperties;

    private ActionAttemptTwentyOne(
            String actionAttemptId,
            Optional<String> result,
            Optional<String> error,
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
        return "pending";
    }

    @JsonProperty("result")
    public Optional<String> getResult() {
        return result;
    }

    @JsonProperty("error")
    public Optional<String> getError() {
        return error;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return "SET_THERMOSTAT_OFF";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptTwentyOne && equalTo((ActionAttemptTwentyOne) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptTwentyOne other) {
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
        _FinalStage actionAttemptId(String actionAttemptId);

        Builder from(ActionAttemptTwentyOne other);
    }

    public interface _FinalStage {
        ActionAttemptTwentyOne build();

        _FinalStage result(Optional<String> result);

        _FinalStage result(String result);

        _FinalStage error(Optional<String> error);

        _FinalStage error(String error);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptIdStage, _FinalStage {
        private String actionAttemptId;

        private Optional<String> error = Optional.empty();

        private Optional<String> result = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ActionAttemptTwentyOne other) {
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
        public _FinalStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @Override
        public _FinalStage error(String error) {
            this.error = Optional.of(error);
            return this;
        }

        @Override
        @JsonSetter(value = "error", nulls = Nulls.SKIP)
        public _FinalStage error(Optional<String> error) {
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
        public ActionAttemptTwentyOne build() {
            return new ActionAttemptTwentyOne(actionAttemptId, result, error, additionalProperties);
        }
    }
}
