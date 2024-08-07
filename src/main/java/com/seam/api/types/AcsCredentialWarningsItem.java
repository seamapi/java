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
@JsonDeserialize(builder = AcsCredentialWarningsItem.Builder.class)
public final class AcsCredentialWarningsItem {
    private final String warningCode;

    private final String message;

    private final Map<String, Object> additionalProperties;

    private AcsCredentialWarningsItem(String warningCode, String message, Map<String, Object> additionalProperties) {
        this.warningCode = warningCode;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("warning_code")
    public String getWarningCode() {
        return warningCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AcsCredentialWarningsItem && equalTo((AcsCredentialWarningsItem) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AcsCredentialWarningsItem other) {
        return warningCode.equals(other.warningCode) && message.equals(other.message);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.warningCode, this.message);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static WarningCodeStage builder() {
        return new Builder();
    }

    public interface WarningCodeStage {
        MessageStage warningCode(String warningCode);

        Builder from(AcsCredentialWarningsItem other);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        AcsCredentialWarningsItem build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WarningCodeStage, MessageStage, _FinalStage {
        private String warningCode;

        private String message;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AcsCredentialWarningsItem other) {
            warningCode(other.getWarningCode());
            message(other.getMessage());
            return this;
        }

        @java.lang.Override
        @JsonSetter("warning_code")
        public MessageStage warningCode(String warningCode) {
            this.warningCode = warningCode;
            return this;
        }

        @java.lang.Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public AcsCredentialWarningsItem build() {
            return new AcsCredentialWarningsItem(warningCode, message, additionalProperties);
        }
    }
}
