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
@JsonDeserialize(builder = DevicePropertiesSchlageMetadata.Builder.class)
public final class DevicePropertiesSchlageMetadata {
    private final String deviceId;

    private final String deviceName;

    private final Optional<Double> accessCodeLength;

    private final Optional<String> model;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesSchlageMetadata(
            String deviceId,
            String deviceName,
            Optional<Double> accessCodeLength,
            Optional<String> model,
            Map<String, Object> additionalProperties) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.accessCodeLength = accessCodeLength;
        this.model = model;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_name")
    public String getDeviceName() {
        return deviceName;
    }

    @JsonProperty("access_code_length")
    public Optional<Double> getAccessCodeLength() {
        return accessCodeLength;
    }

    @JsonProperty("model")
    public Optional<String> getModel() {
        return model;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesSchlageMetadata && equalTo((DevicePropertiesSchlageMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesSchlageMetadata other) {
        return deviceId.equals(other.deviceId)
                && deviceName.equals(other.deviceName)
                && accessCodeLength.equals(other.accessCodeLength)
                && model.equals(other.model);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.deviceName, this.accessCodeLength, this.model);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        DeviceNameStage deviceId(String deviceId);

        Builder from(DevicePropertiesSchlageMetadata other);
    }

    public interface DeviceNameStage {
        _FinalStage deviceName(String deviceName);
    }

    public interface _FinalStage {
        DevicePropertiesSchlageMetadata build();

        _FinalStage accessCodeLength(Optional<Double> accessCodeLength);

        _FinalStage accessCodeLength(Double accessCodeLength);

        _FinalStage model(Optional<String> model);

        _FinalStage model(String model);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, DeviceNameStage, _FinalStage {
        private String deviceId;

        private String deviceName;

        private Optional<String> model = Optional.empty();

        private Optional<Double> accessCodeLength = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DevicePropertiesSchlageMetadata other) {
            deviceId(other.getDeviceId());
            deviceName(other.getDeviceName());
            accessCodeLength(other.getAccessCodeLength());
            model(other.getModel());
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_id")
        public DeviceNameStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_name")
        public _FinalStage deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        @java.lang.Override
        public _FinalStage model(String model) {
            this.model = Optional.of(model);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public _FinalStage model(Optional<String> model) {
            this.model = model;
            return this;
        }

        @java.lang.Override
        public _FinalStage accessCodeLength(Double accessCodeLength) {
            this.accessCodeLength = Optional.of(accessCodeLength);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "access_code_length", nulls = Nulls.SKIP)
        public _FinalStage accessCodeLength(Optional<Double> accessCodeLength) {
            this.accessCodeLength = accessCodeLength;
            return this;
        }

        @java.lang.Override
        public DevicePropertiesSchlageMetadata build() {
            return new DevicePropertiesSchlageMetadata(
                    deviceId, deviceName, accessCodeLength, model, additionalProperties);
        }
    }
}
