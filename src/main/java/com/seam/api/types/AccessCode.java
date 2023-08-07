package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCode.Builder.class)
public final class AccessCode {
    private final Optional<String> commonCodeKey;

    private final Optional<Boolean> isScheduledOnDevice;

    private final AccessCodeType type;

    private final Optional<Boolean> isWaitingForCodeAssignment;

    private final String accessCodeId;

    private final String deviceId;

    private final Optional<String> name;

    private final Optional<String> code;

    private final OffsetDateTime createdAt;

    private final Optional<Object> errors;

    private final Optional<Object> warnings;

    private final String isManaged;

    private final Optional<OffsetDateTime> startsAt;

    private final Optional<OffsetDateTime> endsAt;

    private final AccessCodeStatus status;

    private final boolean isBackupAccessCodeAvailable;

    private final Optional<Boolean> isBackup;

    private final Optional<String> pulledBackupAccessCodeId;

    private AccessCode(
            Optional<String> commonCodeKey,
            Optional<Boolean> isScheduledOnDevice,
            AccessCodeType type,
            Optional<Boolean> isWaitingForCodeAssignment,
            String accessCodeId,
            String deviceId,
            Optional<String> name,
            Optional<String> code,
            OffsetDateTime createdAt,
            Optional<Object> errors,
            Optional<Object> warnings,
            String isManaged,
            Optional<OffsetDateTime> startsAt,
            Optional<OffsetDateTime> endsAt,
            AccessCodeStatus status,
            boolean isBackupAccessCodeAvailable,
            Optional<Boolean> isBackup,
            Optional<String> pulledBackupAccessCodeId) {
        this.commonCodeKey = commonCodeKey;
        this.isScheduledOnDevice = isScheduledOnDevice;
        this.type = type;
        this.isWaitingForCodeAssignment = isWaitingForCodeAssignment;
        this.accessCodeId = accessCodeId;
        this.deviceId = deviceId;
        this.name = name;
        this.code = code;
        this.createdAt = createdAt;
        this.errors = errors;
        this.warnings = warnings;
        this.isManaged = isManaged;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.status = status;
        this.isBackupAccessCodeAvailable = isBackupAccessCodeAvailable;
        this.isBackup = isBackup;
        this.pulledBackupAccessCodeId = pulledBackupAccessCodeId;
    }

    @JsonProperty("common_code_key")
    public Optional<String> getCommonCodeKey() {
        return commonCodeKey;
    }

    @JsonProperty("is_scheduled_on_device")
    public Optional<Boolean> getIsScheduledOnDevice() {
        return isScheduledOnDevice;
    }

    @JsonProperty("type")
    public AccessCodeType getType() {
        return type;
    }

    @JsonProperty("is_waiting_for_code_assignment")
    public Optional<Boolean> getIsWaitingForCodeAssignment() {
        return isWaitingForCodeAssignment;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("errors")
    public Optional<Object> getErrors() {
        return errors;
    }

    @JsonProperty("warnings")
    public Optional<Object> getWarnings() {
        return warnings;
    }

    @JsonProperty("is_managed")
    public String getIsManaged() {
        return isManaged;
    }

    @JsonProperty("starts_at")
    public Optional<OffsetDateTime> getStartsAt() {
        return startsAt;
    }

    @JsonProperty("ends_at")
    public Optional<OffsetDateTime> getEndsAt() {
        return endsAt;
    }

    @JsonProperty("status")
    public AccessCodeStatus getStatus() {
        return status;
    }

    @JsonProperty("is_backup_access_code_available")
    public boolean getIsBackupAccessCodeAvailable() {
        return isBackupAccessCodeAvailable;
    }

    @JsonProperty("is_backup")
    public Optional<Boolean> getIsBackup() {
        return isBackup;
    }

    @JsonProperty("pulled_backup_access_code_id")
    public Optional<String> getPulledBackupAccessCodeId() {
        return pulledBackupAccessCodeId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCode && equalTo((AccessCode) other);
    }

    private boolean equalTo(AccessCode other) {
        return commonCodeKey.equals(other.commonCodeKey)
                && isScheduledOnDevice.equals(other.isScheduledOnDevice)
                && type.equals(other.type)
                && isWaitingForCodeAssignment.equals(other.isWaitingForCodeAssignment)
                && accessCodeId.equals(other.accessCodeId)
                && deviceId.equals(other.deviceId)
                && name.equals(other.name)
                && code.equals(other.code)
                && createdAt.equals(other.createdAt)
                && errors.equals(other.errors)
                && warnings.equals(other.warnings)
                && isManaged.equals(other.isManaged)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt)
                && status.equals(other.status)
                && isBackupAccessCodeAvailable == other.isBackupAccessCodeAvailable
                && isBackup.equals(other.isBackup)
                && pulledBackupAccessCodeId.equals(other.pulledBackupAccessCodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.commonCodeKey,
                this.isScheduledOnDevice,
                this.type,
                this.isWaitingForCodeAssignment,
                this.accessCodeId,
                this.deviceId,
                this.name,
                this.code,
                this.createdAt,
                this.errors,
                this.warnings,
                this.isManaged,
                this.startsAt,
                this.endsAt,
                this.status,
                this.isBackupAccessCodeAvailable,
                this.isBackup,
                this.pulledBackupAccessCodeId);
    }

    @Override
    public String toString() {
        return "AccessCode{" + "commonCodeKey: " + commonCodeKey + ", isScheduledOnDevice: " + isScheduledOnDevice
                + ", type: " + type + ", isWaitingForCodeAssignment: " + isWaitingForCodeAssignment + ", accessCodeId: "
                + accessCodeId + ", deviceId: " + deviceId + ", name: " + name + ", code: " + code + ", createdAt: "
                + createdAt + ", errors: " + errors + ", warnings: " + warnings + ", isManaged: " + isManaged
                + ", startsAt: " + startsAt + ", endsAt: " + endsAt + ", status: " + status
                + ", isBackupAccessCodeAvailable: " + isBackupAccessCodeAvailable + ", isBackup: " + isBackup
                + ", pulledBackupAccessCodeId: " + pulledBackupAccessCodeId + "}";
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        AccessCodeIdStage type(AccessCodeType type);

        Builder from(AccessCode other);
    }

    public interface AccessCodeIdStage {
        DeviceIdStage accessCodeId(String accessCodeId);
    }

    public interface DeviceIdStage {
        CreatedAtStage deviceId(String deviceId);
    }

    public interface CreatedAtStage {
        IsManagedStage createdAt(OffsetDateTime createdAt);
    }

    public interface IsManagedStage {
        StatusStage isManaged(String isManaged);
    }

    public interface StatusStage {
        IsBackupAccessCodeAvailableStage status(AccessCodeStatus status);
    }

    public interface IsBackupAccessCodeAvailableStage {
        _FinalStage isBackupAccessCodeAvailable(boolean isBackupAccessCodeAvailable);
    }

    public interface _FinalStage {
        AccessCode build();

        _FinalStage commonCodeKey(Optional<String> commonCodeKey);

        _FinalStage commonCodeKey(String commonCodeKey);

        _FinalStage isScheduledOnDevice(Optional<Boolean> isScheduledOnDevice);

        _FinalStage isScheduledOnDevice(Boolean isScheduledOnDevice);

        _FinalStage isWaitingForCodeAssignment(Optional<Boolean> isWaitingForCodeAssignment);

        _FinalStage isWaitingForCodeAssignment(Boolean isWaitingForCodeAssignment);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage code(Optional<String> code);

        _FinalStage code(String code);

        _FinalStage errors(Optional<Object> errors);

        _FinalStage errors(Object errors);

        _FinalStage warnings(Optional<Object> warnings);

        _FinalStage warnings(Object warnings);

        _FinalStage startsAt(Optional<OffsetDateTime> startsAt);

        _FinalStage startsAt(OffsetDateTime startsAt);

        _FinalStage endsAt(Optional<OffsetDateTime> endsAt);

        _FinalStage endsAt(OffsetDateTime endsAt);

        _FinalStage isBackup(Optional<Boolean> isBackup);

        _FinalStage isBackup(Boolean isBackup);

        _FinalStage pulledBackupAccessCodeId(Optional<String> pulledBackupAccessCodeId);

        _FinalStage pulledBackupAccessCodeId(String pulledBackupAccessCodeId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TypeStage,
                    AccessCodeIdStage,
                    DeviceIdStage,
                    CreatedAtStage,
                    IsManagedStage,
                    StatusStage,
                    IsBackupAccessCodeAvailableStage,
                    _FinalStage {
        private AccessCodeType type;

        private String accessCodeId;

        private String deviceId;

        private OffsetDateTime createdAt;

        private String isManaged;

        private AccessCodeStatus status;

        private boolean isBackupAccessCodeAvailable;

        private Optional<String> pulledBackupAccessCodeId = Optional.empty();

        private Optional<Boolean> isBackup = Optional.empty();

        private Optional<OffsetDateTime> endsAt = Optional.empty();

        private Optional<OffsetDateTime> startsAt = Optional.empty();

        private Optional<Object> warnings = Optional.empty();

        private Optional<Object> errors = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Boolean> isWaitingForCodeAssignment = Optional.empty();

        private Optional<Boolean> isScheduledOnDevice = Optional.empty();

        private Optional<String> commonCodeKey = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCode other) {
            commonCodeKey(other.getCommonCodeKey());
            isScheduledOnDevice(other.getIsScheduledOnDevice());
            type(other.getType());
            isWaitingForCodeAssignment(other.getIsWaitingForCodeAssignment());
            accessCodeId(other.getAccessCodeId());
            deviceId(other.getDeviceId());
            name(other.getName());
            code(other.getCode());
            createdAt(other.getCreatedAt());
            errors(other.getErrors());
            warnings(other.getWarnings());
            isManaged(other.getIsManaged());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            status(other.getStatus());
            isBackupAccessCodeAvailable(other.getIsBackupAccessCodeAvailable());
            isBackup(other.getIsBackup());
            pulledBackupAccessCodeId(other.getPulledBackupAccessCodeId());
            return this;
        }

        @Override
        @JsonSetter("type")
        public AccessCodeIdStage type(AccessCodeType type) {
            this.type = type;
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public DeviceIdStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public CreatedAtStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public IsManagedStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public StatusStage isManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        @JsonSetter("status")
        public IsBackupAccessCodeAvailableStage status(AccessCodeStatus status) {
            this.status = status;
            return this;
        }

        @Override
        @JsonSetter("is_backup_access_code_available")
        public _FinalStage isBackupAccessCodeAvailable(boolean isBackupAccessCodeAvailable) {
            this.isBackupAccessCodeAvailable = isBackupAccessCodeAvailable;
            return this;
        }

        @Override
        public _FinalStage pulledBackupAccessCodeId(String pulledBackupAccessCodeId) {
            this.pulledBackupAccessCodeId = Optional.of(pulledBackupAccessCodeId);
            return this;
        }

        @Override
        @JsonSetter(value = "pulled_backup_access_code_id", nulls = Nulls.SKIP)
        public _FinalStage pulledBackupAccessCodeId(Optional<String> pulledBackupAccessCodeId) {
            this.pulledBackupAccessCodeId = pulledBackupAccessCodeId;
            return this;
        }

        @Override
        public _FinalStage isBackup(Boolean isBackup) {
            this.isBackup = Optional.of(isBackup);
            return this;
        }

        @Override
        @JsonSetter(value = "is_backup", nulls = Nulls.SKIP)
        public _FinalStage isBackup(Optional<Boolean> isBackup) {
            this.isBackup = isBackup;
            return this;
        }

        @Override
        public _FinalStage endsAt(OffsetDateTime endsAt) {
            this.endsAt = Optional.of(endsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "ends_at", nulls = Nulls.SKIP)
        public _FinalStage endsAt(Optional<OffsetDateTime> endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        @Override
        public _FinalStage startsAt(OffsetDateTime startsAt) {
            this.startsAt = Optional.of(startsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "starts_at", nulls = Nulls.SKIP)
        public _FinalStage startsAt(Optional<OffsetDateTime> startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        @Override
        public _FinalStage warnings(Object warnings) {
            this.warnings = Optional.of(warnings);
            return this;
        }

        @Override
        @JsonSetter(value = "warnings", nulls = Nulls.SKIP)
        public _FinalStage warnings(Optional<Object> warnings) {
            this.warnings = warnings;
            return this;
        }

        @Override
        public _FinalStage errors(Object errors) {
            this.errors = Optional.of(errors);
            return this;
        }

        @Override
        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public _FinalStage errors(Optional<Object> errors) {
            this.errors = errors;
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
        public _FinalStage isWaitingForCodeAssignment(Boolean isWaitingForCodeAssignment) {
            this.isWaitingForCodeAssignment = Optional.of(isWaitingForCodeAssignment);
            return this;
        }

        @Override
        @JsonSetter(value = "is_waiting_for_code_assignment", nulls = Nulls.SKIP)
        public _FinalStage isWaitingForCodeAssignment(Optional<Boolean> isWaitingForCodeAssignment) {
            this.isWaitingForCodeAssignment = isWaitingForCodeAssignment;
            return this;
        }

        @Override
        public _FinalStage isScheduledOnDevice(Boolean isScheduledOnDevice) {
            this.isScheduledOnDevice = Optional.of(isScheduledOnDevice);
            return this;
        }

        @Override
        @JsonSetter(value = "is_scheduled_on_device", nulls = Nulls.SKIP)
        public _FinalStage isScheduledOnDevice(Optional<Boolean> isScheduledOnDevice) {
            this.isScheduledOnDevice = isScheduledOnDevice;
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
        public AccessCode build() {
            return new AccessCode(
                    commonCodeKey,
                    isScheduledOnDevice,
                    type,
                    isWaitingForCodeAssignment,
                    accessCodeId,
                    deviceId,
                    name,
                    code,
                    createdAt,
                    errors,
                    warnings,
                    isManaged,
                    startsAt,
                    endsAt,
                    status,
                    isBackupAccessCodeAvailable,
                    isBackup,
                    pulledBackupAccessCodeId);
        }
    }
}
