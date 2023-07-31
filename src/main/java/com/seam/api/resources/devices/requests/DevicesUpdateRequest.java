package com.seam.api.resources.devices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.DevicesUpdateRequestLocation;
import com.seam.api.types.DevicesUpdateRequestProperties;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = DevicesUpdateRequest.Builder.class)
public final class DevicesUpdateRequest {
    private final String deviceId;

    private final Optional<DevicesUpdateRequestProperties> properties;

    private final Optional<String> name;

    private final Optional<DevicesUpdateRequestLocation> location;

    private final Optional<Boolean> isManaged;

    private DevicesUpdateRequest(
            String deviceId,
            Optional<DevicesUpdateRequestProperties> properties,
            Optional<String> name,
            Optional<DevicesUpdateRequestLocation> location,
            Optional<Boolean> isManaged) {
        this.deviceId = deviceId;
        this.properties = properties;
        this.name = name;
        this.location = location;
        this.isManaged = isManaged;
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

    @JsonProperty("location")
    public Optional<DevicesUpdateRequestLocation> getLocation() {
        return location;
    }

    @JsonProperty("is_managed")
    public Optional<Boolean> getIsManaged() {
        return isManaged;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUpdateRequest && equalTo((DevicesUpdateRequest) other);
    }

    private boolean equalTo(DevicesUpdateRequest other) {
        return deviceId.equals(other.deviceId)
                && properties.equals(other.properties)
                && name.equals(other.name)
                && location.equals(other.location)
                && isManaged.equals(other.isManaged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.properties, this.name, this.location, this.isManaged);
    }

    @Override
    public String toString() {
        return "DevicesUpdateRequest{" + "deviceId: " + deviceId + ", properties: " + properties + ", name: " + name
                + ", location: " + location + ", isManaged: " + isManaged + "}";
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

        _FinalStage location(Optional<DevicesUpdateRequestLocation> location);

        _FinalStage location(DevicesUpdateRequestLocation location);

        _FinalStage isManaged(Optional<Boolean> isManaged);

        _FinalStage isManaged(Boolean isManaged);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Optional<Boolean> isManaged = Optional.empty();

        private Optional<DevicesUpdateRequestLocation> location = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<DevicesUpdateRequestProperties> properties = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(DevicesUpdateRequest other) {
            deviceId(other.getDeviceId());
            properties(other.getProperties());
            name(other.getName());
            location(other.getLocation());
            isManaged(other.getIsManaged());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public _FinalStage isManaged(Boolean isManaged) {
            this.isManaged = Optional.of(isManaged);
            return this;
        }

        @Override
        @JsonSetter(value = "is_managed", nulls = Nulls.SKIP)
        public _FinalStage isManaged(Optional<Boolean> isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        public _FinalStage location(DevicesUpdateRequestLocation location) {
            this.location = Optional.of(location);
            return this;
        }

        @Override
        @JsonSetter(value = "location", nulls = Nulls.SKIP)
        public _FinalStage location(Optional<DevicesUpdateRequestLocation> location) {
            this.location = location;
            return this;
        }

        @Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage properties(DevicesUpdateRequestProperties properties) {
            this.properties = Optional.of(properties);
            return this;
        }

        @Override
        @JsonSetter(value = "properties", nulls = Nulls.SKIP)
        public _FinalStage properties(Optional<DevicesUpdateRequestProperties> properties) {
            this.properties = properties;
            return this;
        }

        @Override
        public DevicesUpdateRequest build() {
            return new DevicesUpdateRequest(deviceId, properties, name, location, isManaged);
        }
    }
}
