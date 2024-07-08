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
@JsonDeserialize(builder = DevicePropertiesEcobeeMetadata.Builder.class)
public final class DevicePropertiesEcobeeMetadata {
    private final String ecobeeDeviceId;

    private final String deviceName;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesEcobeeMetadata(
            String ecobeeDeviceId, String deviceName, Map<String, Object> additionalProperties) {
        this.ecobeeDeviceId = ecobeeDeviceId;
        this.deviceName = deviceName;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("ecobee_device_id")
    public String getEcobeeDeviceId() {
        return ecobeeDeviceId;
    }

    @JsonProperty("device_name")
    public String getDeviceName() {
        return deviceName;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesEcobeeMetadata && equalTo((DevicePropertiesEcobeeMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesEcobeeMetadata other) {
        return ecobeeDeviceId.equals(other.ecobeeDeviceId) && deviceName.equals(other.deviceName);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ecobeeDeviceId, this.deviceName);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EcobeeDeviceIdStage builder() {
        return new Builder();
    }

    public interface EcobeeDeviceIdStage {
        DeviceNameStage ecobeeDeviceId(String ecobeeDeviceId);

        Builder from(DevicePropertiesEcobeeMetadata other);
    }

    public interface DeviceNameStage {
        _FinalStage deviceName(String deviceName);
    }

    public interface _FinalStage {
        DevicePropertiesEcobeeMetadata build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EcobeeDeviceIdStage, DeviceNameStage, _FinalStage {
        private String ecobeeDeviceId;

        private String deviceName;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DevicePropertiesEcobeeMetadata other) {
            ecobeeDeviceId(other.getEcobeeDeviceId());
            deviceName(other.getDeviceName());
            return this;
        }

        @java.lang.Override
        @JsonSetter("ecobee_device_id")
        public DeviceNameStage ecobeeDeviceId(String ecobeeDeviceId) {
            this.ecobeeDeviceId = ecobeeDeviceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_name")
        public _FinalStage deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        @java.lang.Override
        public DevicePropertiesEcobeeMetadata build() {
            return new DevicePropertiesEcobeeMetadata(ecobeeDeviceId, deviceName, additionalProperties);
        }
    }
}
