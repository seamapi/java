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
@JsonDeserialize(builder = ActionAttemptThirteen.Builder.class)
public final class ActionAttemptThirteen {
    private final String actionAttemptId;

    private final Optional<String> error;

    private final ActionAttemptThirteenResult result;

    private final Map<String, Object> additionalProperties;

    private ActionAttemptThirteen(
            String actionAttemptId,
            Optional<String> error,
            ActionAttemptThirteenResult result,
            Map<String, Object> additionalProperties) {
        this.actionAttemptId = actionAttemptId;
        this.error = error;
        this.result = result;
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
        return "success";
    }

    @JsonProperty("error")
    public Optional<String> getError() {
        return error;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return "SET_HEAT";
    }

    @JsonProperty("result")
    public ActionAttemptThirteenResult getResult() {
        return result;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptThirteen && equalTo((ActionAttemptThirteen) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptThirteen other) {
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
        ResultStage actionAttemptId(String actionAttemptId);

        Builder from(ActionAttemptThirteen other);
    }

    public interface ResultStage {
        _FinalStage result(ActionAttemptThirteenResult result);
    }

    public interface _FinalStage {
        ActionAttemptThirteen build();

        _FinalStage error(Optional<String> error);

        _FinalStage error(String error);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptIdStage, ResultStage, _FinalStage {
        private String actionAttemptId;

        private ActionAttemptThirteenResult result;

        private Optional<String> error = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActionAttemptThirteen other) {
            actionAttemptId(other.getActionAttemptId());
            error(other.getError());
            result(other.getResult());
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
        @java.lang.Override
        @JsonSetter("action_attempt_id")
        public ResultStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("result")
        public _FinalStage result(ActionAttemptThirteenResult result) {
            this.result = result;
            return this;
        }

        @java.lang.Override
        public _FinalStage error(String error) {
            this.error = Optional.of(error);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "error", nulls = Nulls.SKIP)
        public _FinalStage error(Optional<String> error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        public ActionAttemptThirteen build() {
            return new ActionAttemptThirteen(actionAttemptId, error, result, additionalProperties);
        }
    }
}