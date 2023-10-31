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
@JsonDeserialize(builder = NukiDeviceMetadata.Builder.class)
public final class NukiDeviceMetadata {
    private final Optional<Boolean> keypadBatteryCritical;

    private final Map<String, Object> additionalProperties;

    private NukiDeviceMetadata(Optional<Boolean> keypadBatteryCritical, Map<String, Object> additionalProperties) {
        this.keypadBatteryCritical = keypadBatteryCritical;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("keypad_battery_critical")
    public Optional<Boolean> getKeypadBatteryCritical() {
        return keypadBatteryCritical;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NukiDeviceMetadata && equalTo((NukiDeviceMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NukiDeviceMetadata other) {
        return keypadBatteryCritical.equals(other.keypadBatteryCritical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.keypadBatteryCritical);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Boolean> keypadBatteryCritical = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(NukiDeviceMetadata other) {
            keypadBatteryCritical(other.getKeypadBatteryCritical());
            return this;
        }

        @JsonSetter(value = "keypad_battery_critical", nulls = Nulls.SKIP)
        public Builder keypadBatteryCritical(Optional<Boolean> keypadBatteryCritical) {
            this.keypadBatteryCritical = keypadBatteryCritical;
            return this;
        }

        public Builder keypadBatteryCritical(Boolean keypadBatteryCritical) {
            this.keypadBatteryCritical = Optional.of(keypadBatteryCritical);
            return this;
        }

        public NukiDeviceMetadata build() {
            return new NukiDeviceMetadata(keypadBatteryCritical, additionalProperties);
        }
    }
}
