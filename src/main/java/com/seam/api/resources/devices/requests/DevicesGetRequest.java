package com.seam.api.resources.devices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = DevicesGetRequest.Builder.class)
public final class DevicesGetRequest {
    private final Optional<String> deviceId;

    private final Optional<String> name;

    private DevicesGetRequest(Optional<String> deviceId, Optional<String> name) {
        this.deviceId = deviceId;
        this.name = name;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesGetRequest && equalTo((DevicesGetRequest) other);
    }

    private boolean equalTo(DevicesGetRequest other) {
        return deviceId.equals(other.deviceId) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.name);
    }

    @Override
    public String toString() {
        return "DevicesGetRequest{" + "deviceId: " + deviceId + ", name: " + name + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> deviceId = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        public Builder from(DevicesGetRequest other) {
            deviceId(other.getDeviceId());
            name(other.getName());
            return this;
        }

        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public Builder deviceId(Optional<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        public DevicesGetRequest build() {
            return new DevicesGetRequest(deviceId, name);
        }
    }
}
