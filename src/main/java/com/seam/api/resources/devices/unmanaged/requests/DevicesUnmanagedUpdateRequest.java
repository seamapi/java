package com.seam.api.resources.devices.unmanaged.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicesUnmanagedUpdateRequest.Builder.class)
public final class DevicesUnmanagedUpdateRequest {
    private final String deviceId;

    private final String isManaged;

    private DevicesUnmanagedUpdateRequest(String deviceId, String isManaged) {
        this.deviceId = deviceId;
        this.isManaged = isManaged;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("is_managed")
    public String getIsManaged() {
        return isManaged;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUnmanagedUpdateRequest && equalTo((DevicesUnmanagedUpdateRequest) other);
    }

    private boolean equalTo(DevicesUnmanagedUpdateRequest other) {
        return deviceId.equals(other.deviceId) && isManaged.equals(other.isManaged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.isManaged);
    }

    @Override
    public String toString() {
        return "DevicesUnmanagedUpdateRequest{" + "deviceId: " + deviceId + ", isManaged: " + isManaged + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        IsManagedStage deviceId(String deviceId);

        Builder from(DevicesUnmanagedUpdateRequest other);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(String isManaged);
    }

    public interface _FinalStage {
        DevicesUnmanagedUpdateRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, IsManagedStage, _FinalStage {
        private String deviceId;

        private String isManaged;

        private Builder() {}

        @Override
        public Builder from(DevicesUnmanagedUpdateRequest other) {
            deviceId(other.getDeviceId());
            isManaged(other.getIsManaged());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public IsManagedStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public _FinalStage isManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        public DevicesUnmanagedUpdateRequest build() {
            return new DevicesUnmanagedUpdateRequest(deviceId, isManaged);
        }
    }
}
