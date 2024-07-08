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
@JsonDeserialize(builder = PhoneErrorsItem.Builder.class)
public final class PhoneErrorsItem {
    private final String errorCode;

    private final String message;

    private final Map<String, Object> additionalProperties;

    private PhoneErrorsItem(String errorCode, String message, Map<String, Object> additionalProperties) {
        this.errorCode = errorCode;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("error_code")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhoneErrorsItem && equalTo((PhoneErrorsItem) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PhoneErrorsItem other) {
        return errorCode.equals(other.errorCode) && message.equals(other.message);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.errorCode, this.message);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ErrorCodeStage builder() {
        return new Builder();
    }

    public interface ErrorCodeStage {
        MessageStage errorCode(String errorCode);

        Builder from(PhoneErrorsItem other);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        PhoneErrorsItem build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ErrorCodeStage, MessageStage, _FinalStage {
        private String errorCode;

        private String message;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PhoneErrorsItem other) {
            errorCode(other.getErrorCode());
            message(other.getMessage());
            return this;
        }

        @java.lang.Override
        @JsonSetter("error_code")
        public MessageStage errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        @java.lang.Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public PhoneErrorsItem build() {
            return new PhoneErrorsItem(errorCode, message, additionalProperties);
        }
    }
}
