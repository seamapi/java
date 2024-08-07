/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.accesscodes.types.AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared;
import com.seam.api.types.MaxTimeRounding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesCreateMultipleRequest.Builder.class)
public final class AccessCodesCreateMultipleRequest {
    private final List<String> deviceIds;

    private final Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
            behaviorWhenCodeCannotBeShared;

    private final Optional<Double> preferredCodeLength;

    private final Optional<String> name;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private final Optional<String> code;

    private final Optional<Boolean> attemptForOfflineDevice;

    private final Optional<Boolean> preferNativeScheduling;

    private final Optional<Boolean> useBackupAccessCodePool;

    private final Optional<Boolean> allowExternalModification;

    private final Optional<Boolean> isExternalModificationAllowed;

    private final Optional<Boolean> useOfflineAccessCode;

    private final Optional<Boolean> isOfflineAccessCode;

    private final Optional<Boolean> isOneTimeUse;

    private final Optional<MaxTimeRounding> maxTimeRounding;

    private final Map<String, Object> additionalProperties;

    private AccessCodesCreateMultipleRequest(
            List<String> deviceIds,
            Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared> behaviorWhenCodeCannotBeShared,
            Optional<Double> preferredCodeLength,
            Optional<String> name,
            Optional<String> startsAt,
            Optional<String> endsAt,
            Optional<String> code,
            Optional<Boolean> attemptForOfflineDevice,
            Optional<Boolean> preferNativeScheduling,
            Optional<Boolean> useBackupAccessCodePool,
            Optional<Boolean> allowExternalModification,
            Optional<Boolean> isExternalModificationAllowed,
            Optional<Boolean> useOfflineAccessCode,
            Optional<Boolean> isOfflineAccessCode,
            Optional<Boolean> isOneTimeUse,
            Optional<MaxTimeRounding> maxTimeRounding,
            Map<String, Object> additionalProperties) {
        this.deviceIds = deviceIds;
        this.behaviorWhenCodeCannotBeShared = behaviorWhenCodeCannotBeShared;
        this.preferredCodeLength = preferredCodeLength;
        this.name = name;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.code = code;
        this.attemptForOfflineDevice = attemptForOfflineDevice;
        this.preferNativeScheduling = preferNativeScheduling;
        this.useBackupAccessCodePool = useBackupAccessCodePool;
        this.allowExternalModification = allowExternalModification;
        this.isExternalModificationAllowed = isExternalModificationAllowed;
        this.useOfflineAccessCode = useOfflineAccessCode;
        this.isOfflineAccessCode = isOfflineAccessCode;
        this.isOneTimeUse = isOneTimeUse;
        this.maxTimeRounding = maxTimeRounding;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_ids")
    public List<String> getDeviceIds() {
        return deviceIds;
    }

    @JsonProperty("behavior_when_code_cannot_be_shared")
    public Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
            getBehaviorWhenCodeCannotBeShared() {
        return behaviorWhenCodeCannotBeShared;
    }

    @JsonProperty("preferred_code_length")
    public Optional<Double> getPreferredCodeLength() {
        return preferredCodeLength;
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

    @JsonProperty("allow_external_modification")
    public Optional<Boolean> getAllowExternalModification() {
        return allowExternalModification;
    }

    @JsonProperty("is_external_modification_allowed")
    public Optional<Boolean> getIsExternalModificationAllowed() {
        return isExternalModificationAllowed;
    }

    @JsonProperty("use_offline_access_code")
    public Optional<Boolean> getUseOfflineAccessCode() {
        return useOfflineAccessCode;
    }

    @JsonProperty("is_offline_access_code")
    public Optional<Boolean> getIsOfflineAccessCode() {
        return isOfflineAccessCode;
    }

    @JsonProperty("is_one_time_use")
    public Optional<Boolean> getIsOneTimeUse() {
        return isOneTimeUse;
    }

    @JsonProperty("max_time_rounding")
    public Optional<MaxTimeRounding> getMaxTimeRounding() {
        return maxTimeRounding;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesCreateMultipleRequest && equalTo((AccessCodesCreateMultipleRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AccessCodesCreateMultipleRequest other) {
        return deviceIds.equals(other.deviceIds)
                && behaviorWhenCodeCannotBeShared.equals(other.behaviorWhenCodeCannotBeShared)
                && preferredCodeLength.equals(other.preferredCodeLength)
                && name.equals(other.name)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt)
                && code.equals(other.code)
                && attemptForOfflineDevice.equals(other.attemptForOfflineDevice)
                && preferNativeScheduling.equals(other.preferNativeScheduling)
                && useBackupAccessCodePool.equals(other.useBackupAccessCodePool)
                && allowExternalModification.equals(other.allowExternalModification)
                && isExternalModificationAllowed.equals(other.isExternalModificationAllowed)
                && useOfflineAccessCode.equals(other.useOfflineAccessCode)
                && isOfflineAccessCode.equals(other.isOfflineAccessCode)
                && isOneTimeUse.equals(other.isOneTimeUse)
                && maxTimeRounding.equals(other.maxTimeRounding);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.deviceIds,
                this.behaviorWhenCodeCannotBeShared,
                this.preferredCodeLength,
                this.name,
                this.startsAt,
                this.endsAt,
                this.code,
                this.attemptForOfflineDevice,
                this.preferNativeScheduling,
                this.useBackupAccessCodePool,
                this.allowExternalModification,
                this.isExternalModificationAllowed,
                this.useOfflineAccessCode,
                this.isOfflineAccessCode,
                this.isOneTimeUse,
                this.maxTimeRounding);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<String> deviceIds = new ArrayList<>();

        private Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
                behaviorWhenCodeCannotBeShared = Optional.empty();

        private Optional<Double> preferredCodeLength = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<Boolean> attemptForOfflineDevice = Optional.empty();

        private Optional<Boolean> preferNativeScheduling = Optional.empty();

        private Optional<Boolean> useBackupAccessCodePool = Optional.empty();

        private Optional<Boolean> allowExternalModification = Optional.empty();

        private Optional<Boolean> isExternalModificationAllowed = Optional.empty();

        private Optional<Boolean> useOfflineAccessCode = Optional.empty();

        private Optional<Boolean> isOfflineAccessCode = Optional.empty();

        private Optional<Boolean> isOneTimeUse = Optional.empty();

        private Optional<MaxTimeRounding> maxTimeRounding = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AccessCodesCreateMultipleRequest other) {
            deviceIds(other.getDeviceIds());
            behaviorWhenCodeCannotBeShared(other.getBehaviorWhenCodeCannotBeShared());
            preferredCodeLength(other.getPreferredCodeLength());
            name(other.getName());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            code(other.getCode());
            attemptForOfflineDevice(other.getAttemptForOfflineDevice());
            preferNativeScheduling(other.getPreferNativeScheduling());
            useBackupAccessCodePool(other.getUseBackupAccessCodePool());
            allowExternalModification(other.getAllowExternalModification());
            isExternalModificationAllowed(other.getIsExternalModificationAllowed());
            useOfflineAccessCode(other.getUseOfflineAccessCode());
            isOfflineAccessCode(other.getIsOfflineAccessCode());
            isOneTimeUse(other.getIsOneTimeUse());
            maxTimeRounding(other.getMaxTimeRounding());
            return this;
        }

        @JsonSetter(value = "device_ids", nulls = Nulls.SKIP)
        public Builder deviceIds(List<String> deviceIds) {
            this.deviceIds.clear();
            this.deviceIds.addAll(deviceIds);
            return this;
        }

        public Builder addDeviceIds(String deviceIds) {
            this.deviceIds.add(deviceIds);
            return this;
        }

        public Builder addAllDeviceIds(List<String> deviceIds) {
            this.deviceIds.addAll(deviceIds);
            return this;
        }

        @JsonSetter(value = "behavior_when_code_cannot_be_shared", nulls = Nulls.SKIP)
        public Builder behaviorWhenCodeCannotBeShared(
                Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
                        behaviorWhenCodeCannotBeShared) {
            this.behaviorWhenCodeCannotBeShared = behaviorWhenCodeCannotBeShared;
            return this;
        }

        public Builder behaviorWhenCodeCannotBeShared(
                AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared behaviorWhenCodeCannotBeShared) {
            this.behaviorWhenCodeCannotBeShared = Optional.of(behaviorWhenCodeCannotBeShared);
            return this;
        }

        @JsonSetter(value = "preferred_code_length", nulls = Nulls.SKIP)
        public Builder preferredCodeLength(Optional<Double> preferredCodeLength) {
            this.preferredCodeLength = preferredCodeLength;
            return this;
        }

        public Builder preferredCodeLength(Double preferredCodeLength) {
            this.preferredCodeLength = Optional.of(preferredCodeLength);
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

        @JsonSetter(value = "starts_at", nulls = Nulls.SKIP)
        public Builder startsAt(Optional<String> startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        public Builder startsAt(String startsAt) {
            this.startsAt = Optional.of(startsAt);
            return this;
        }

        @JsonSetter(value = "ends_at", nulls = Nulls.SKIP)
        public Builder endsAt(Optional<String> endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        public Builder endsAt(String endsAt) {
            this.endsAt = Optional.of(endsAt);
            return this;
        }

        @JsonSetter(value = "code", nulls = Nulls.SKIP)
        public Builder code(Optional<String> code) {
            this.code = code;
            return this;
        }

        public Builder code(String code) {
            this.code = Optional.of(code);
            return this;
        }

        @JsonSetter(value = "attempt_for_offline_device", nulls = Nulls.SKIP)
        public Builder attemptForOfflineDevice(Optional<Boolean> attemptForOfflineDevice) {
            this.attemptForOfflineDevice = attemptForOfflineDevice;
            return this;
        }

        public Builder attemptForOfflineDevice(Boolean attemptForOfflineDevice) {
            this.attemptForOfflineDevice = Optional.of(attemptForOfflineDevice);
            return this;
        }

        @JsonSetter(value = "prefer_native_scheduling", nulls = Nulls.SKIP)
        public Builder preferNativeScheduling(Optional<Boolean> preferNativeScheduling) {
            this.preferNativeScheduling = preferNativeScheduling;
            return this;
        }

        public Builder preferNativeScheduling(Boolean preferNativeScheduling) {
            this.preferNativeScheduling = Optional.of(preferNativeScheduling);
            return this;
        }

        @JsonSetter(value = "use_backup_access_code_pool", nulls = Nulls.SKIP)
        public Builder useBackupAccessCodePool(Optional<Boolean> useBackupAccessCodePool) {
            this.useBackupAccessCodePool = useBackupAccessCodePool;
            return this;
        }

        public Builder useBackupAccessCodePool(Boolean useBackupAccessCodePool) {
            this.useBackupAccessCodePool = Optional.of(useBackupAccessCodePool);
            return this;
        }

        @JsonSetter(value = "allow_external_modification", nulls = Nulls.SKIP)
        public Builder allowExternalModification(Optional<Boolean> allowExternalModification) {
            this.allowExternalModification = allowExternalModification;
            return this;
        }

        public Builder allowExternalModification(Boolean allowExternalModification) {
            this.allowExternalModification = Optional.of(allowExternalModification);
            return this;
        }

        @JsonSetter(value = "is_external_modification_allowed", nulls = Nulls.SKIP)
        public Builder isExternalModificationAllowed(Optional<Boolean> isExternalModificationAllowed) {
            this.isExternalModificationAllowed = isExternalModificationAllowed;
            return this;
        }

        public Builder isExternalModificationAllowed(Boolean isExternalModificationAllowed) {
            this.isExternalModificationAllowed = Optional.of(isExternalModificationAllowed);
            return this;
        }

        @JsonSetter(value = "use_offline_access_code", nulls = Nulls.SKIP)
        public Builder useOfflineAccessCode(Optional<Boolean> useOfflineAccessCode) {
            this.useOfflineAccessCode = useOfflineAccessCode;
            return this;
        }

        public Builder useOfflineAccessCode(Boolean useOfflineAccessCode) {
            this.useOfflineAccessCode = Optional.of(useOfflineAccessCode);
            return this;
        }

        @JsonSetter(value = "is_offline_access_code", nulls = Nulls.SKIP)
        public Builder isOfflineAccessCode(Optional<Boolean> isOfflineAccessCode) {
            this.isOfflineAccessCode = isOfflineAccessCode;
            return this;
        }

        public Builder isOfflineAccessCode(Boolean isOfflineAccessCode) {
            this.isOfflineAccessCode = Optional.of(isOfflineAccessCode);
            return this;
        }

        @JsonSetter(value = "is_one_time_use", nulls = Nulls.SKIP)
        public Builder isOneTimeUse(Optional<Boolean> isOneTimeUse) {
            this.isOneTimeUse = isOneTimeUse;
            return this;
        }

        public Builder isOneTimeUse(Boolean isOneTimeUse) {
            this.isOneTimeUse = Optional.of(isOneTimeUse);
            return this;
        }

        @JsonSetter(value = "max_time_rounding", nulls = Nulls.SKIP)
        public Builder maxTimeRounding(Optional<MaxTimeRounding> maxTimeRounding) {
            this.maxTimeRounding = maxTimeRounding;
            return this;
        }

        public Builder maxTimeRounding(MaxTimeRounding maxTimeRounding) {
            this.maxTimeRounding = Optional.of(maxTimeRounding);
            return this;
        }

        public AccessCodesCreateMultipleRequest build() {
            return new AccessCodesCreateMultipleRequest(
                    deviceIds,
                    behaviorWhenCodeCannotBeShared,
                    preferredCodeLength,
                    name,
                    startsAt,
                    endsAt,
                    code,
                    attemptForOfflineDevice,
                    preferNativeScheduling,
                    useBackupAccessCodePool,
                    allowExternalModification,
                    isExternalModificationAllowed,
                    useOfflineAccessCode,
                    isOfflineAccessCode,
                    isOneTimeUse,
                    maxTimeRounding,
                    additionalProperties);
        }
    }
}
