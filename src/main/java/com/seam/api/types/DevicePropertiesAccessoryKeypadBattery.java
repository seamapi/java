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
@JsonDeserialize(builder = DevicePropertiesAccessoryKeypadBattery.Builder.class)
public final class DevicePropertiesAccessoryKeypadBattery {
    private final double level;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesAccessoryKeypadBattery(double level, Map<String, Object> additionalProperties) {
        this.level = level;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("level")
    public double getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesAccessoryKeypadBattery
                && equalTo((DevicePropertiesAccessoryKeypadBattery) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesAccessoryKeypadBattery other) {
        return level == other.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.level);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LevelStage builder() {
        return new Builder();
    }

    public interface LevelStage {
        _FinalStage level(double level);

        Builder from(DevicePropertiesAccessoryKeypadBattery other);
    }

    public interface _FinalStage {
        DevicePropertiesAccessoryKeypadBattery build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LevelStage, _FinalStage {
        private double level;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesAccessoryKeypadBattery other) {
            level(other.getLevel());
            return this;
        }

        @Override
        @JsonSetter("level")
        public _FinalStage level(double level) {
            this.level = level;
            return this;
        }

        @Override
        public DevicePropertiesAccessoryKeypadBattery build() {
            return new DevicePropertiesAccessoryKeypadBattery(level, additionalProperties);
        }
    }
}
