package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.AccessCodesUpdateRequestType;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesUpdateRequest.Builder.class)
public final class AccessCodesUpdateRequest {
    private final Optional<String> name;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private final Optional<String> code;

    private final Optional<Boolean> sync;

    private final Optional<Boolean> attemptForOfflineDevice;

    private final Optional<Boolean> preferNativeScheduling;

    private final Optional<Boolean> useBackupAccessCodePool;

    private final String accessCodeId;

    private final Optional<String> deviceId;

    private final Optional<AccessCodesUpdateRequestType> type;

    private AccessCodesUpdateRequest(
            Optional<String> name,
            Optional<String> startsAt,
            Optional<String> endsAt,
            Optional<String> code,
            Optional<Boolean> sync,
            Optional<Boolean> attemptForOfflineDevice,
            Optional<Boolean> preferNativeScheduling,
            Optional<Boolean> useBackupAccessCodePool,
            String accessCodeId,
            Optional<String> deviceId,
            Optional<AccessCodesUpdateRequestType> type) {
        this.name = name;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.code = code;
        this.sync = sync;
        this.attemptForOfflineDevice = attemptForOfflineDevice;
        this.preferNativeScheduling = preferNativeScheduling;
        this.useBackupAccessCodePool = useBackupAccessCodePool;
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

    /**
     * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 8 characters</code>&lt;/span&gt;
     */
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

    @JsonProperty("prefer_native_scheduling")
    public Optional<Boolean> getPreferNativeScheduling() {
        return preferNativeScheduling;
    }

    @JsonProperty("use_backup_access_code_pool")
    public Optional<Boolean> getUseBackupAccessCodePool() {
        return useBackupAccessCodePool;
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
    public Optional<AccessCodesUpdateRequestType> getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUpdateRequest && equalTo((AccessCodesUpdateRequest) other);
    }

    private boolean equalTo(AccessCodesUpdateRequest other) {
        return name.equals(other.name)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt)
                && code.equals(other.code)
                && sync.equals(other.sync)
                && attemptForOfflineDevice.equals(other.attemptForOfflineDevice)
                && preferNativeScheduling.equals(other.preferNativeScheduling)
                && useBackupAccessCodePool.equals(other.useBackupAccessCodePool)
                && accessCodeId.equals(other.accessCodeId)
                && deviceId.equals(other.deviceId)
                && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.startsAt,
                this.endsAt,
                this.code,
                this.sync,
                this.attemptForOfflineDevice,
                this.preferNativeScheduling,
                this.useBackupAccessCodePool,
                this.accessCodeId,
                this.deviceId,
                this.type);
    }

    @Override
    public String toString() {
        return "AccessCodesUpdateRequest{" + "name: " + name + ", startsAt: " + startsAt + ", endsAt: " + endsAt
                + ", code: " + code + ", sync: " + sync + ", attemptForOfflineDevice: " + attemptForOfflineDevice
                + ", preferNativeScheduling: " + preferNativeScheduling + ", useBackupAccessCodePool: "
                + useBackupAccessCodePool + ", accessCodeId: " + accessCodeId + ", deviceId: " + deviceId + ", type: "
                + type + "}";
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        _FinalStage accessCodeId(String accessCodeId);

        Builder from(AccessCodesUpdateRequest other);
    }

    public interface _FinalStage {
        AccessCodesUpdateRequest build();

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

        _FinalStage preferNativeScheduling(Optional<Boolean> preferNativeScheduling);

        _FinalStage preferNativeScheduling(Boolean preferNativeScheduling);

        _FinalStage useBackupAccessCodePool(Optional<Boolean> useBackupAccessCodePool);

        _FinalStage useBackupAccessCodePool(Boolean useBackupAccessCodePool);

        _FinalStage deviceId(Optional<String> deviceId);

        _FinalStage deviceId(String deviceId);

        _FinalStage type(Optional<AccessCodesUpdateRequestType> type);

        _FinalStage type(AccessCodesUpdateRequestType type);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, _FinalStage {
        private String accessCodeId;

        private Optional<AccessCodesUpdateRequestType> type = Optional.empty();

        private Optional<String> deviceId = Optional.empty();

        private Optional<Boolean> useBackupAccessCodePool = Optional.empty();

        private Optional<Boolean> preferNativeScheduling = Optional.empty();

        private Optional<Boolean> attemptForOfflineDevice = Optional.empty();

        private Optional<Boolean> sync = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesUpdateRequest other) {
            name(other.getName());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            code(other.getCode());
            sync(other.getSync());
            attemptForOfflineDevice(other.getAttemptForOfflineDevice());
            preferNativeScheduling(other.getPreferNativeScheduling());
            useBackupAccessCodePool(other.getUseBackupAccessCodePool());
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
        public _FinalStage type(AccessCodesUpdateRequestType type) {
            this.type = Optional.of(type);
            return this;
        }

        @Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Optional<AccessCodesUpdateRequestType> type) {
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
        public _FinalStage useBackupAccessCodePool(Boolean useBackupAccessCodePool) {
            this.useBackupAccessCodePool = Optional.of(useBackupAccessCodePool);
            return this;
        }

        @Override
        @JsonSetter(value = "use_backup_access_code_pool", nulls = Nulls.SKIP)
        public _FinalStage useBackupAccessCodePool(Optional<Boolean> useBackupAccessCodePool) {
            this.useBackupAccessCodePool = useBackupAccessCodePool;
            return this;
        }

        @Override
        public _FinalStage preferNativeScheduling(Boolean preferNativeScheduling) {
            this.preferNativeScheduling = Optional.of(preferNativeScheduling);
            return this;
        }

        @Override
        @JsonSetter(value = "prefer_native_scheduling", nulls = Nulls.SKIP)
        public _FinalStage preferNativeScheduling(Optional<Boolean> preferNativeScheduling) {
            this.preferNativeScheduling = preferNativeScheduling;
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

        /**
         * <p>&lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 8 characters</code>&lt;/span&gt;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
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
        public AccessCodesUpdateRequest build() {
            return new AccessCodesUpdateRequest(
                    name,
                    startsAt,
                    endsAt,
                    code,
                    sync,
                    attemptForOfflineDevice,
                    preferNativeScheduling,
                    useBackupAccessCodePool,
                    accessCodeId,
                    deviceId,
                    type);
        }
    }
}
