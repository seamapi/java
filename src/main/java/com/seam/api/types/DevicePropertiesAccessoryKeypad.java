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
@JsonDeserialize(builder = DevicePropertiesAccessoryKeypad.Builder.class)
public final class DevicePropertiesAccessoryKeypad {
    private final boolean isConnected;

    private final Optional<DevicePropertiesAccessoryKeypadBattery> battery;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesAccessoryKeypad(
            boolean isConnected,
            Optional<DevicePropertiesAccessoryKeypadBattery> battery,
            Map<String, Object> additionalProperties) {
        this.isConnected = isConnected;
        this.battery = battery;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Indicates if the accessory_keypad is connected to the device.
     */
    @JsonProperty("is_connected")
    public boolean getIsConnected() {
        return isConnected;
    }

    /**
     * @return Indicates if the keypad battery properties.
     */
    @JsonProperty("battery")
    public Optional<DevicePropertiesAccessoryKeypadBattery> getBattery() {
        return battery;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesAccessoryKeypad && equalTo((DevicePropertiesAccessoryKeypad) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesAccessoryKeypad other) {
        return isConnected == other.isConnected && battery.equals(other.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.isConnected, this.battery);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IsConnectedStage builder() {
        return new Builder();
    }

    public interface IsConnectedStage {
        _FinalStage isConnected(boolean isConnected);

        Builder from(DevicePropertiesAccessoryKeypad other);
    }

    public interface _FinalStage {
        DevicePropertiesAccessoryKeypad build();

        _FinalStage battery(Optional<DevicePropertiesAccessoryKeypadBattery> battery);

        _FinalStage battery(DevicePropertiesAccessoryKeypadBattery battery);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IsConnectedStage, _FinalStage {
        private boolean isConnected;

        private Optional<DevicePropertiesAccessoryKeypadBattery> battery = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesAccessoryKeypad other) {
            isConnected(other.getIsConnected());
            battery(other.getBattery());
            return this;
        }

        /**
         * <p>Indicates if the accessory_keypad is connected to the device.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("is_connected")
        public _FinalStage isConnected(boolean isConnected) {
            this.isConnected = isConnected;
            return this;
        }

        /**
         * <p>Indicates if the keypad battery properties.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage battery(DevicePropertiesAccessoryKeypadBattery battery) {
            this.battery = Optional.of(battery);
            return this;
        }

        @Override
        @JsonSetter(value = "battery", nulls = Nulls.SKIP)
        public _FinalStage battery(Optional<DevicePropertiesAccessoryKeypadBattery> battery) {
            this.battery = battery;
            return this;
        }

        @Override
        public DevicePropertiesAccessoryKeypad build() {
            return new DevicePropertiesAccessoryKeypad(isConnected, battery, additionalProperties);
        }
    }
}
