package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UnmanagedDeviceWarningsItem.Builder.class)
public final class UnmanagedDeviceWarningsItem {
    private final String warningCode;

    private final String message;

    private UnmanagedDeviceWarningsItem(String warningCode, String message) {
        this.warningCode = warningCode;
        this.message = message;
    }

    @JsonProperty("warning_code")
    public String getWarningCode() {
        return warningCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedDeviceWarningsItem && equalTo((UnmanagedDeviceWarningsItem) other);
    }

    private boolean equalTo(UnmanagedDeviceWarningsItem other) {
        return warningCode.equals(other.warningCode) && message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.warningCode, this.message);
    }

    @Override
    public String toString() {
        return "UnmanagedDeviceWarningsItem{" + "warningCode: " + warningCode + ", message: " + message + "}";
    }

    public static WarningCodeStage builder() {
        return new Builder();
    }

    public interface WarningCodeStage {
        MessageStage warningCode(String warningCode);

        Builder from(UnmanagedDeviceWarningsItem other);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        UnmanagedDeviceWarningsItem build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WarningCodeStage, MessageStage, _FinalStage {
        private String warningCode;

        private String message;

        private Builder() {}

        @Override
        public Builder from(UnmanagedDeviceWarningsItem other) {
            warningCode(other.getWarningCode());
            message(other.getMessage());
            return this;
        }

        @Override
        @JsonSetter("warning_code")
        public MessageStage warningCode(String warningCode) {
            this.warningCode = warningCode;
            return this;
        }

        @Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public UnmanagedDeviceWarningsItem build() {
            return new UnmanagedDeviceWarningsItem(warningCode, message);
        }
    }
}