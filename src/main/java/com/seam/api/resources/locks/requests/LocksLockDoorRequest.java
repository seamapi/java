package com.seam.api.resources.locks.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = LocksLockDoorRequest.Builder.class)
public final class LocksLockDoorRequest {
    private final String deviceId;

    private final Optional<Boolean> sync;

    private LocksLockDoorRequest(String deviceId, Optional<Boolean> sync) {
        this.deviceId = deviceId;
        this.sync = sync;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("sync")
    public Optional<Boolean> getSync() {
        return sync;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LocksLockDoorRequest && equalTo((LocksLockDoorRequest) other);
    }

    private boolean equalTo(LocksLockDoorRequest other) {
        return deviceId.equals(other.deviceId) && sync.equals(other.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.sync);
    }

    @Override
    public String toString() {
        return "LocksLockDoorRequest{" + "deviceId: " + deviceId + ", sync: " + sync + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(LocksLockDoorRequest other);
    }

    public interface _FinalStage {
        LocksLockDoorRequest build();

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Optional<Boolean> sync = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LocksLockDoorRequest other) {
            deviceId(other.getDeviceId());
            sync(other.getSync());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public _FinalStage sync(Boolean sync) {
            this.sync = Optional.of(sync);
            return this;
        }

        @Override
        @JsonSetter(value = "sync", nulls = Nulls.SKIP)
        public _FinalStage sync(Optional<Boolean> sync) {
            this.sync = sync;
            return this;
        }

        @Override
        public LocksLockDoorRequest build() {
            return new LocksLockDoorRequest(deviceId, sync);
        }
    }
}
