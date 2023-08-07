package com.seam.api.resources.accesscodes.unmanaged.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesUnmanagedListRequest.Builder.class)
public final class AccessCodesUnmanagedListRequest {
    private final String deviceId;

    private AccessCodesUnmanagedListRequest(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUnmanagedListRequest && equalTo((AccessCodesUnmanagedListRequest) other);
    }

    private boolean equalTo(AccessCodesUnmanagedListRequest other) {
        return deviceId.equals(other.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId);
    }

    @Override
    public String toString() {
        return "AccessCodesUnmanagedListRequest{" + "deviceId: " + deviceId + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(AccessCodesUnmanagedListRequest other);
    }

    public interface _FinalStage {
        AccessCodesUnmanagedListRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Builder() {}

        @Override
        public Builder from(AccessCodesUnmanagedListRequest other) {
            deviceId(other.getDeviceId());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public AccessCodesUnmanagedListRequest build() {
            return new AccessCodesUnmanagedListRequest(deviceId);
        }
    }
}
