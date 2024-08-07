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
@JsonDeserialize(builder = ActionAttemptTwentyFive.Builder.class)
public final class ActionAttemptTwentyFive {
    private final String actionAttemptId;

    private final Object error;

    private final Optional<Object> result;

    private final Map<String, Object> additionalProperties;

    private ActionAttemptTwentyFive(
            String actionAttemptId, Object error, Optional<Object> result, Map<String, Object> additionalProperties) {
        this.actionAttemptId = actionAttemptId;
        this.error = error;
        this.result = result;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the action attempt.
     */
    @JsonProperty("action_attempt_id")
    public String getActionAttemptId() {
        return actionAttemptId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return "success";
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return "SYNC_ACCESS_CODES";
    }

    @JsonProperty("result")
    public Optional<Object> getResult() {
        return result;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptTwentyFive && equalTo((ActionAttemptTwentyFive) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptTwentyFive other) {
        return actionAttemptId.equals(other.actionAttemptId)
                && error.equals(other.error)
                && result.equals(other.result);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.actionAttemptId, this.error, this.result);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActionAttemptIdStage builder() {
        return new Builder();
    }

    public interface ActionAttemptIdStage {
        ErrorStage actionAttemptId(String actionAttemptId);

        Builder from(ActionAttemptTwentyFive other);
    }

    public interface ErrorStage {
        _FinalStage error(Object error);
    }

    public interface _FinalStage {
        ActionAttemptTwentyFive build();

        _FinalStage result(Optional<Object> result);

        _FinalStage result(Object result);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptIdStage, ErrorStage, _FinalStage {
        private String actionAttemptId;

        private Object error;

        private Optional<Object> result = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActionAttemptTwentyFive other) {
            actionAttemptId(other.getActionAttemptId());
            error(other.getError());
            result(other.getResult());
            return this;
        }

        /**
         * <p>The ID of the action attempt.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("action_attempt_id")
        public ErrorStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("error")
        public _FinalStage error(Object error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        public _FinalStage result(Object result) {
            this.result = Optional.of(result);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "result", nulls = Nulls.SKIP)
        public _FinalStage result(Optional<Object> result) {
            this.result = result;
            return this;
        }

        @java.lang.Override
        public ActionAttemptTwentyFive build() {
            return new ActionAttemptTwentyFive(actionAttemptId, error, result, additionalProperties);
        }
    }
}
