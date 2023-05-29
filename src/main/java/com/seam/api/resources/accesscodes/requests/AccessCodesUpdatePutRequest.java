package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.AccessCodesUpdatePutRequestType;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesUpdatePutRequest.Builder.class)
public final class AccessCodesUpdatePutRequest {
    private final Optional<String> name;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private final Optional<String> code;

    private final Optional<Boolean> sync;

    private final Optional<Boolean> attemptForOfflineDevice;

    private final String accessCodeId;

    private final Optional<String> deviceId;

    private final Optional<AccessCodesUpdatePutRequestType> type;

    private int _cachedHashCode;

    AccessCodesUpdatePutRequest(
            Optional<String> name,
            Optional<String> startsAt,
            Optional<String> endsAt,
            Optional<String> code,
            Optional<Boolean> sync,
            Optional<Boolean> attemptForOfflineDevice,
            String accessCodeId,
            Optional<String> deviceId,
            Optional<AccessCodesUpdatePutRequestType> type) {
        this.name = name;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.code = code;
        this.sync = sync;
        this.attemptForOfflineDevice = attemptForOfflineDevice;
        this.accessCodeId = accessCodeId;
        this.deviceId = deviceId;
        this.type = type;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("starts_at")
    public Optional<String> getStartsAt() {
        return startsAt;
    }

    @JsonProperty("ends_at")
    public Optional<String> getEndsAt() {
        return endsAt;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @JsonProperty("sync")
    public Optional<Boolean> getSync() {
        return sync;
    }

    @JsonProperty("attempt_for_offline_device")
    public Optional<Boolean> getAttemptForOfflineDevice() {
        return attemptForOfflineDevice;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @JsonProperty("type")
    public Optional<AccessCodesUpdatePutRequestType> getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUpdatePutRequest && equalTo((AccessCodesUpdatePutRequest) other);
    }

    private boolean equalTo(AccessCodesUpdatePutRequest other) {
        return name.equals(other.name)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt)
                && code.equals(other.code)
                && sync.equals(other.sync)
                && attemptForOfflineDevice.equals(other.attemptForOfflineDevice)
                && accessCodeId.equals(other.accessCodeId)
                && deviceId.equals(other.deviceId)
                && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        if (_cachedHashCode == 0) {
            _cachedHashCode = Objects.hash(
                    this.name,
                    this.startsAt,
                    this.endsAt,
                    this.code,
                    this.sync,
                    this.attemptForOfflineDevice,
                    this.accessCodeId,
                    this.deviceId,
                    this.type);
        }
        return _cachedHashCode;
    }

    @Override
    public String toString() {
        return "AccessCodesUpdatePutRequest{" + "name: " + name + ", startsAt: " + startsAt + ", endsAt: " + endsAt
                + ", code: " + code + ", sync: " + sync + ", attemptForOfflineDevice: " + attemptForOfflineDevice
                + ", accessCodeId: " + accessCodeId + ", deviceId: " + deviceId + ", type: " + type + "}";
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        _FinalStage accessCodeId(String accessCodeId);

        Builder from(AccessCodesUpdatePutRequest other);
    }

    public interface _FinalStage {
        AccessCodesUpdatePutRequest build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage startsAt(Optional<String> startsAt);

        _FinalStage startsAt(String startsAt);

        _FinalStage endsAt(Optional<String> endsAt);

        _FinalStage endsAt(String endsAt);

        _FinalStage code(Optional<String> code);

        _FinalStage code(String code);

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);

        _FinalStage attemptForOfflineDevice(Optional<Boolean> attemptForOfflineDevice);

        _FinalStage attemptForOfflineDevice(Boolean attemptForOfflineDevice);

        _FinalStage deviceId(Optional<String> deviceId);

        _FinalStage deviceId(String deviceId);

        _FinalStage type(Optional<AccessCodesUpdatePutRequestType> type);

        _FinalStage type(AccessCodesUpdatePutRequestType type);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, _FinalStage {
        private String accessCodeId;

        private Optional<AccessCodesUpdatePutRequestType> type = Optional.empty();

        private Optional<String> deviceId = Optional.empty();

        private Optional<Boolean> attemptForOfflineDevice = Optional.empty();

        private Optional<Boolean> sync = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesUpdatePutRequest other) {
            name(other.getName());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            code(other.getCode());
            sync(other.getSync());
            attemptForOfflineDevice(other.getAttemptForOfflineDevice());
            accessCodeId(other.getAccessCodeId());
            deviceId(other.getDeviceId());
            type(other.getType());
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public _FinalStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        public _FinalStage type(AccessCodesUpdatePutRequestType type) {
            this.type = Optional.of(type);
            return this;
        }

        @Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Optional<AccessCodesUpdatePutRequestType> type) {
            this.type = type;
            return this;
        }

        @Override
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        @Override
        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public _FinalStage deviceId(Optional<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public _FinalStage attemptForOfflineDevice(Boolean attemptForOfflineDevice) {
            this.attemptForOfflineDevice = Optional.of(attemptForOfflineDevice);
            return this;
        }

        @Override
        @JsonSetter(value = "attempt_for_offline_device", nulls = Nulls.SKIP)
        public _FinalStage attemptForOfflineDevice(Optional<Boolean> attemptForOfflineDevice) {
            this.attemptForOfflineDevice = attemptForOfflineDevice;
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
        public _FinalStage code(String code) {
            this.code = Optional.of(code);
            return this;
        }

        @Override
        @JsonSetter(value = "code", nulls = Nulls.SKIP)
        public _FinalStage code(Optional<String> code) {
            this.code = code;
            return this;
        }

        @Override
        public _FinalStage endsAt(String endsAt) {
            this.endsAt = Optional.of(endsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "ends_at", nulls = Nulls.SKIP)
        public _FinalStage endsAt(Optional<String> endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        @Override
        public _FinalStage startsAt(String startsAt) {
            this.startsAt = Optional.of(startsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "starts_at", nulls = Nulls.SKIP)
        public _FinalStage startsAt(Optional<String> startsAt) {
            this.startsAt = startsAt;
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
        public AccessCodesUpdatePutRequest build() {
            return new AccessCodesUpdatePutRequest(
                    name, startsAt, endsAt, code, sync, attemptForOfflineDevice, accessCodeId, deviceId, type);
        }
    }
}
