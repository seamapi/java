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
@JsonDeserialize(builder = ActionAttemptThirtyTwoError.Builder.class)
public final class ActionAttemptThirtyTwoError {
    private final String type;

    private final String message;

    private final Map<String, Object> additionalProperties;

    private ActionAttemptThirtyTwoError(String type, String message, Map<String, Object> additionalProperties) {
        this.type = type;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptThirtyTwoError && equalTo((ActionAttemptThirtyTwoError) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptThirtyTwoError other) {
        return type.equals(other.type) && message.equals(other.message);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        MessageStage type(String type);

        Builder from(ActionAttemptThirtyTwoError other);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        ActionAttemptThirtyTwoError build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, MessageStage, _FinalStage {
        private String type;

        private String message;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActionAttemptThirtyTwoError other) {
            type(other.getType());
            message(other.getMessage());
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public MessageStage type(String type) {
            this.type = type;
            return this;
        }

        @java.lang.Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public ActionAttemptThirtyTwoError build() {
            return new ActionAttemptThirtyTwoError(type, message, additionalProperties);
        }
    }
}
