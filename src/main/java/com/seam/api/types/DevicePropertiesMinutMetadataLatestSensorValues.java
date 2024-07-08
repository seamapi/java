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
@JsonDeserialize(builder = DevicePropertiesMinutMetadataLatestSensorValues.Builder.class)
public final class DevicePropertiesMinutMetadataLatestSensorValues {
    private final DevicePropertiesMinutMetadataLatestSensorValuesTemperature temperature;

    private final DevicePropertiesMinutMetadataLatestSensorValuesSound sound;

    private final DevicePropertiesMinutMetadataLatestSensorValuesHumidity humidity;

    private final DevicePropertiesMinutMetadataLatestSensorValuesPressure pressure;

    private final DevicePropertiesMinutMetadataLatestSensorValuesAccelerometerZ accelerometerZ;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesMinutMetadataLatestSensorValues(
            DevicePropertiesMinutMetadataLatestSensorValuesTemperature temperature,
            DevicePropertiesMinutMetadataLatestSensorValuesSound sound,
            DevicePropertiesMinutMetadataLatestSensorValuesHumidity humidity,
            DevicePropertiesMinutMetadataLatestSensorValuesPressure pressure,
            DevicePropertiesMinutMetadataLatestSensorValuesAccelerometerZ accelerometerZ,
            Map<String, Object> additionalProperties) {
        this.temperature = temperature;
        this.sound = sound;
        this.humidity = humidity;
        this.pressure = pressure;
        this.accelerometerZ = accelerometerZ;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("temperature")
    public DevicePropertiesMinutMetadataLatestSensorValuesTemperature getTemperature() {
        return temperature;
    }

    @JsonProperty("sound")
    public DevicePropertiesMinutMetadataLatestSensorValuesSound getSound() {
        return sound;
    }

    @JsonProperty("humidity")
    public DevicePropertiesMinutMetadataLatestSensorValuesHumidity getHumidity() {
        return humidity;
    }

    @JsonProperty("pressure")
    public DevicePropertiesMinutMetadataLatestSensorValuesPressure getPressure() {
        return pressure;
    }

    @JsonProperty("accelerometer_z")
    public DevicePropertiesMinutMetadataLatestSensorValuesAccelerometerZ getAccelerometerZ() {
        return accelerometerZ;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesMinutMetadataLatestSensorValues
                && equalTo((DevicePropertiesMinutMetadataLatestSensorValues) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesMinutMetadataLatestSensorValues other) {
        return temperature.equals(other.temperature)
                && sound.equals(other.sound)
                && humidity.equals(other.humidity)
                && pressure.equals(other.pressure)
                && accelerometerZ.equals(other.accelerometerZ);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.temperature, this.sound, this.humidity, this.pressure, this.accelerometerZ);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TemperatureStage builder() {
        return new Builder();
    }

    public interface TemperatureStage {
        SoundStage temperature(DevicePropertiesMinutMetadataLatestSensorValuesTemperature temperature);

        Builder from(DevicePropertiesMinutMetadataLatestSensorValues other);
    }

    public interface SoundStage {
        HumidityStage sound(DevicePropertiesMinutMetadataLatestSensorValuesSound sound);
    }

    public interface HumidityStage {
        PressureStage humidity(DevicePropertiesMinutMetadataLatestSensorValuesHumidity humidity);
    }

    public interface PressureStage {
        AccelerometerZStage pressure(DevicePropertiesMinutMetadataLatestSensorValuesPressure pressure);
    }

    public interface AccelerometerZStage {
        _FinalStage accelerometerZ(DevicePropertiesMinutMetadataLatestSensorValuesAccelerometerZ accelerometerZ);
    }

    public interface _FinalStage {
        DevicePropertiesMinutMetadataLatestSensorValues build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TemperatureStage, SoundStage, HumidityStage, PressureStage, AccelerometerZStage, _FinalStage {
        private DevicePropertiesMinutMetadataLatestSensorValuesTemperature temperature;

        private DevicePropertiesMinutMetadataLatestSensorValuesSound sound;

        private DevicePropertiesMinutMetadataLatestSensorValuesHumidity humidity;

        private DevicePropertiesMinutMetadataLatestSensorValuesPressure pressure;

        private DevicePropertiesMinutMetadataLatestSensorValuesAccelerometerZ accelerometerZ;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DevicePropertiesMinutMetadataLatestSensorValues other) {
            temperature(other.getTemperature());
            sound(other.getSound());
            humidity(other.getHumidity());
            pressure(other.getPressure());
            accelerometerZ(other.getAccelerometerZ());
            return this;
        }

        @java.lang.Override
        @JsonSetter("temperature")
        public SoundStage temperature(DevicePropertiesMinutMetadataLatestSensorValuesTemperature temperature) {
            this.temperature = temperature;
            return this;
        }

        @java.lang.Override
        @JsonSetter("sound")
        public HumidityStage sound(DevicePropertiesMinutMetadataLatestSensorValuesSound sound) {
            this.sound = sound;
            return this;
        }

        @java.lang.Override
        @JsonSetter("humidity")
        public PressureStage humidity(DevicePropertiesMinutMetadataLatestSensorValuesHumidity humidity) {
            this.humidity = humidity;
            return this;
        }

        @java.lang.Override
        @JsonSetter("pressure")
        public AccelerometerZStage pressure(DevicePropertiesMinutMetadataLatestSensorValuesPressure pressure) {
            this.pressure = pressure;
            return this;
        }

        @java.lang.Override
        @JsonSetter("accelerometer_z")
        public _FinalStage accelerometerZ(
                DevicePropertiesMinutMetadataLatestSensorValuesAccelerometerZ accelerometerZ) {
            this.accelerometerZ = accelerometerZ;
            return this;
        }

        @java.lang.Override
        public DevicePropertiesMinutMetadataLatestSensorValues build() {
            return new DevicePropertiesMinutMetadataLatestSensorValues(
                    temperature, sound, humidity, pressure, accelerometerZ, additionalProperties);
        }
    }
}
