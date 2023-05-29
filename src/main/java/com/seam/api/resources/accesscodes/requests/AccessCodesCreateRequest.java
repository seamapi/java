package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesCreateRequest.Builder.class)
public final class AccessCodesCreateRequest {
    private final String deviceId;

    private final Optional<String> name;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private final Optional<String> code;

    private final Optional<Boolean> sync;

    private final Optional<Boolean> attemptForOfflineDevice;

    private final Optional<String> commonCodeKey;

    private int _cachedHashCode;

    AccessCodesCreateRequest(
            String deviceId,
            Optional<String> name,
            Optional<String> startsAt,
            Optional<String> endsAt,
            Optional<String> code,
            Optional<Boolean> sync,
            Optional<Boolean> attemptForOfflineDevice,
            Optional<String> commonCodeKey) {
        this.deviceId = deviceId;
        this.name = name;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.code = code;
        this.sync = sync;
        this.attemptForOfflineDevice = attemptForOfflineDevice;
        this.commonCodeKey = commonCodeKey;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
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

    @JsonProperty("common_code_key")
    public Optional<String> getCommonCodeKey() {
        return commonCodeKey;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesCreateRequest && equalTo((AccessCodesCreateRequest) other);
    }

    private boolean equalTo(AccessCodesCreateRequest other) {
        return deviceId.equals(other.deviceId)
                && name.equals(other.name)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt)
                && code.equals(other.code)
                && sync.equals(other.sync)
                && attemptForOfflineDevice.equals(other.attemptForOfflineDevice)
                && commonCodeKey.equals(other.commonCodeKey);
    }

    @Override
    public int hashCode() {
        if (_cachedHashCode == 0) {
            _cachedHashCode = Objects.hash(
                    this.deviceId,
                    this.name,
                    this.startsAt,
                    this.endsAt,
                    this.code,
                    this.sync,
                    this.attemptForOfflineDevice,
                    this.commonCodeKey);
        }
        return _cachedHashCode;
    }

    @Override
    public String toString() {
        return "AccessCodesCreateRequest{" + "deviceId: " + deviceId + ", name: " + name + ", startsAt: " + startsAt
                + ", endsAt: " + endsAt + ", code: " + code + ", sync: " + sync + ", attemptForOfflineDevice: "
                + attemptForOfflineDevice + ", commonCodeKey: " + commonCodeKey + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(AccessCodesCreateRequest other);
    }

    public interface _FinalStage {
        AccessCodesCreateRequest build();

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

        _FinalStage commonCodeKey(Optional<String> commonCodeKey);

        _FinalStage commonCodeKey(String commonCodeKey);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Optional<String> commonCodeKey = Optional.empty();

        private Optional<Boolean> attemptForOfflineDevice = Optional.empty();

        private Optional<Boolean> sync = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesCreateRequest other) {
            deviceId(other.getDeviceId());
            name(other.getName());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            code(other.getCode());
            sync(other.getSync());
            attemptForOfflineDevice(other.getAttemptForOfflineDevice());
            commonCodeKey(other.getCommonCodeKey());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public _FinalStage commonCodeKey(String commonCodeKey) {
            this.commonCodeKey = Optional.of(commonCodeKey);
            return this;
        }

        @Override
        @JsonSetter(value = "common_code_key", nulls = Nulls.SKIP)
        public _FinalStage commonCodeKey(Optional<String> commonCodeKey) {
            this.commonCodeKey = commonCodeKey;
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
        public AccessCodesCreateRequest build() {
            return new AccessCodesCreateRequest(
                    deviceId, name, startsAt, endsAt, code, sync, attemptForOfflineDevice, commonCodeKey);
        }
    }
}
