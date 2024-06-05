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
@JsonDeserialize(builder = DevicePropertiesMinutMetadataLatestSensorValuesTemperature.Builder.class)
public final class DevicePropertiesMinutMetadataLatestSensorValuesTemperature {
    private final String time;

    private final double value;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesMinutMetadataLatestSensorValuesTemperature(
            String time, double value, Map<String, Object> additionalProperties) {
        this.time = time;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesMinutMetadataLatestSensorValuesTemperature
                && equalTo((DevicePropertiesMinutMetadataLatestSensorValuesTemperature) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesMinutMetadataLatestSensorValuesTemperature other) {
        return time.equals(other.time) && value == other.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.time, this.value);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimeStage builder() {
        return new Builder();
    }

    public interface TimeStage {
        ValueStage time(String time);

        Builder from(DevicePropertiesMinutMetadataLatestSensorValuesTemperature other);
    }

    public interface ValueStage {
        _FinalStage value(double value);
    }

    public interface _FinalStage {
        DevicePropertiesMinutMetadataLatestSensorValuesTemperature build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TimeStage, ValueStage, _FinalStage {
        private String time;

        private double value;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesMinutMetadataLatestSensorValuesTemperature other) {
            time(other.getTime());
            value(other.getValue());
            return this;
        }

        @Override
        @JsonSetter("time")
        public ValueStage time(String time) {
            this.time = time;
            return this;
        }

        @Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
            return this;
        }

        @Override
        public DevicePropertiesMinutMetadataLatestSensorValuesTemperature build() {
            return new DevicePropertiesMinutMetadataLatestSensorValuesTemperature(time, value, additionalProperties);
        }
    }
}
