package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptErrorError.Builder.class)
public final class ActionAttemptErrorError {
    private final String type;

    private final String message;

    private ActionAttemptErrorError(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptErrorError && equalTo((ActionAttemptErrorError) other);
    }

    private boolean equalTo(ActionAttemptErrorError other) {
        return type.equals(other.type) && message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    @Override
    public String toString() {
        return "ActionAttemptErrorError{" + "type: " + type + ", message: " + message + "}";
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        MessageStage type(String type);

        Builder from(ActionAttemptErrorError other);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        ActionAttemptErrorError build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, MessageStage, _FinalStage {
        private String type;

        private String message;

        private Builder() {}

        @Override
        public Builder from(ActionAttemptErrorError other) {
            type(other.getType());
            message(other.getMessage());
            return this;
        }

        @Override
        @JsonSetter("type")
        public MessageStage type(String type) {
            this.type = type;
            return this;
        }

        @Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public ActionAttemptErrorError build() {
            return new ActionAttemptErrorError(type, message);
        }
    }
}
