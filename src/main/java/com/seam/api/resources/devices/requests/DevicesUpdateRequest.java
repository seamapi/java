/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.devices.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.devices.types.DevicesUpdateRequestCustomMetadataValue;
import com.seam.api.resources.devices.types.DevicesUpdateRequestProperties;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicesUpdateRequest.Builder.class)
public final class DevicesUpdateRequest {
    private final String deviceId;

    private final Optional<DevicesUpdateRequestProperties> properties;

    private final Optional<String> name;

    private final Optional<Boolean> isManaged;

    private final Optional<Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>>> customMetadata;

    private final Map<String, Object> additionalProperties;

    private DevicesUpdateRequest(
            String deviceId,
            Optional<DevicesUpdateRequestProperties> properties,
            Optional<String> name,
            Optional<Boolean> isManaged,
            Optional<Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>>> customMetadata,
            Map<String, Object> additionalProperties) {
        this.deviceId = deviceId;
        this.properties = properties;
        this.name = name;
        this.isManaged = isManaged;
        this.customMetadata = customMetadata;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("properties")
    public Optional<DevicesUpdateRequestProperties> getProperties() {
        return properties;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("is_managed")
    public Optional<Boolean> getIsManaged() {
        return isManaged;
    }

    @JsonProperty("custom_metadata")
    public Optional<Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>>> getCustomMetadata() {
        return customMetadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUpdateRequest && equalTo((DevicesUpdateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicesUpdateRequest other) {
        return deviceId.equals(other.deviceId)
                && properties.equals(other.properties)
                && name.equals(other.name)
                && isManaged.equals(other.isManaged)
                && customMetadata.equals(other.customMetadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.properties, this.name, this.isManaged, this.customMetadata);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(DevicesUpdateRequest other);
    }

    public interface _FinalStage {
        DevicesUpdateRequest build();

        _FinalStage properties(Optional<DevicesUpdateRequestProperties> properties);

        _FinalStage properties(DevicesUpdateRequestProperties properties);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage isManaged(Optional<Boolean> isManaged);

        _FinalStage isManaged(Boolean isManaged);

        _FinalStage customMetadata(
                Optional<Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>>> customMetadata);

        _FinalStage customMetadata(Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>> customMetadata);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Optional<Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>>> customMetadata =
                Optional.empty();

        private Optional<Boolean> isManaged = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<DevicesUpdateRequestProperties> properties = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DevicesUpdateRequest other) {
            deviceId(other.getDeviceId());
            properties(other.getProperties());
            name(other.getName());
            isManaged(other.getIsManaged());
            customMetadata(other.getCustomMetadata());
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @java.lang.Override
        public _FinalStage customMetadata(
                Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>> customMetadata) {
            this.customMetadata = Optional.of(customMetadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "custom_metadata", nulls = Nulls.SKIP)
        public _FinalStage customMetadata(
                Optional<Map<String, Optional<DevicesUpdateRequestCustomMetadataValue>>> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        @java.lang.Override
        public _FinalStage isManaged(Boolean isManaged) {
            this.isManaged = Optional.of(isManaged);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "is_managed", nulls = Nulls.SKIP)
        public _FinalStage isManaged(Optional<Boolean> isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public _FinalStage properties(DevicesUpdateRequestProperties properties) {
            this.properties = Optional.of(properties);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "properties", nulls = Nulls.SKIP)
        public _FinalStage properties(Optional<DevicesUpdateRequestProperties> properties) {
            this.properties = properties;
            return this;
        }

        @java.lang.Override
        public DevicesUpdateRequest build() {
            return new DevicesUpdateRequest(
                    deviceId, properties, name, isManaged, customMetadata, additionalProperties);
        }
    }
}
