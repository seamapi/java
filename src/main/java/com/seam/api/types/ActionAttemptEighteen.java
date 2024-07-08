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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptEighteen.Builder.class)
public final class ActionAttemptEighteen {
    private final String actionAttemptId;

    private final Object result;

    private final Object error;

    private final Map<String, Object> additionalProperties;

    private ActionAttemptEighteen(
            String actionAttemptId, Object result, Object error, Map<String, Object> additionalProperties) {
        this.actionAttemptId = actionAttemptId;
        this.result = result;
        this.error = error;
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
        return "pending";
    }

    @JsonProperty("result")
    public Object getResult() {
        return result;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return "SET_FAN_MODE";
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptEighteen && equalTo((ActionAttemptEighteen) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptEighteen other) {
        return actionAttemptId.equals(other.actionAttemptId)
                && result.equals(other.result)
                && error.equals(other.error);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.actionAttemptId, this.result, this.error);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActionAttemptIdStage builder() {
        return new Builder();
    }

    public interface ActionAttemptIdStage {
        ResultStage actionAttemptId(String actionAttemptId);

        Builder from(ActionAttemptEighteen other);
    }

    public interface ResultStage {
        ErrorStage result(Object result);
    }

    public interface ErrorStage {
        _FinalStage error(Object error);
    }

    public interface _FinalStage {
        ActionAttemptEighteen build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptIdStage, ResultStage, ErrorStage, _FinalStage {
        private String actionAttemptId;

        private Object result;

        private Object error;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActionAttemptEighteen other) {
            actionAttemptId(other.getActionAttemptId());
            result(other.getResult());
            error(other.getError());
            return this;
        }

        /**
         * <p>The ID of the action attempt.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("action_attempt_id")
        public ResultStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("result")
        public ErrorStage result(Object result) {
            this.result = result;
            return this;
        }

        @java.lang.Override
        @JsonSetter("error")
        public _FinalStage error(Object error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        public ActionAttemptEighteen build() {
            return new ActionAttemptEighteen(actionAttemptId, result, error, additionalProperties);
        }
    }
}
