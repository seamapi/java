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
@JsonDeserialize(builder = DevicePropertiesBattery.Builder.class)
public final class DevicePropertiesBattery {
    private final double level;

    private final DevicePropertiesBatteryStatus status;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesBattery(
            double level, DevicePropertiesBatteryStatus status, Map<String, Object> additionalProperties) {
        this.level = level;
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("level")
    public double getLevel() {
        return level;
    }

    @JsonProperty("status")
    public DevicePropertiesBatteryStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesBattery && equalTo((DevicePropertiesBattery) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesBattery other) {
        return level == other.level && status.equals(other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.level, this.status);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LevelStage builder() {
        return new Builder();
    }

    public interface LevelStage {
        StatusStage level(double level);

        Builder from(DevicePropertiesBattery other);
    }

    public interface StatusStage {
        _FinalStage status(DevicePropertiesBatteryStatus status);
    }

    public interface _FinalStage {
        DevicePropertiesBattery build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LevelStage, StatusStage, _FinalStage {
        private double level;

        private DevicePropertiesBatteryStatus status;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesBattery other) {
            level(other.getLevel());
            status(other.getStatus());
            return this;
        }

        @Override
        @JsonSetter("level")
        public StatusStage level(double level) {
            this.level = level;
            return this;
        }

        @Override
        @JsonSetter("status")
        public _FinalStage status(DevicePropertiesBatteryStatus status) {
            this.status = status;
            return this;
        }

        @Override
        public DevicePropertiesBattery build() {
            return new DevicePropertiesBattery(level, status, additionalProperties);
        }
    }
}
