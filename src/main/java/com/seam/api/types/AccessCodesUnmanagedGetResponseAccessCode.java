package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesUnmanagedGetResponseAccessCode.Builder.class)
public final class AccessCodesUnmanagedGetResponseAccessCode {
    private final AccessCodesUnmanagedGetResponseAccessCodeType type;

    private final String accessCodeId;

    private final String deviceId;

    private final Optional<String> name;

    private final Optional<String> code;

    private final String createdAt;

    private final Optional<Object> errors;

    private final Optional<Object> warnings;

    private final String isManaged;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private AccessCodesUnmanagedGetResponseAccessCode(
            AccessCodesUnmanagedGetResponseAccessCodeType type,
            String accessCodeId,
            String deviceId,
            Optional<String> name,
            Optional<String> code,
            String createdAt,
            Optional<Object> errors,
            Optional<Object> warnings,
            String isManaged,
            Optional<String> startsAt,
            Optional<String> endsAt) {
        this.type = type;
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
    }

    @JsonProperty("type")
    public AccessCodesUnmanagedGetResponseAccessCodeType getType() {
        return type;
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
    public String getCreatedAt() {
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
    public Optional<String> getStartsAt() {
        return startsAt;
    }

    @JsonProperty("ends_at")
    public Optional<String> getEndsAt() {
        return endsAt;
    }

    @JsonProperty("status")
    public String getStatus() {
        return "set";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUnmanagedGetResponseAccessCode
                && equalTo((AccessCodesUnmanagedGetResponseAccessCode) other);
    }

    private boolean equalTo(AccessCodesUnmanagedGetResponseAccessCode other) {
        return type.equals(other.type)
                && accessCodeId.equals(other.accessCodeId)
                && deviceId.equals(other.deviceId)
                && name.equals(other.name)
                && code.equals(other.code)
                && createdAt.equals(other.createdAt)
                && errors.equals(other.errors)
                && warnings.equals(other.warnings)
                && isManaged.equals(other.isManaged)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.type,
                this.accessCodeId,
                this.deviceId,
                this.name,
                this.code,
                this.createdAt,
                this.errors,
                this.warnings,
                this.isManaged,
                this.startsAt,
                this.endsAt);
    }

    @Override
    public String toString() {
        return "AccessCodesUnmanagedGetResponseAccessCode{" + "type: " + type + ", accessCodeId: " + accessCodeId
                + ", deviceId: " + deviceId + ", name: " + name + ", code: " + code + ", createdAt: " + createdAt
                + ", errors: " + errors + ", warnings: " + warnings + ", isManaged: " + isManaged + ", startsAt: "
                + startsAt + ", endsAt: " + endsAt + "}";
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        AccessCodeIdStage type(AccessCodesUnmanagedGetResponseAccessCodeType type);

        Builder from(AccessCodesUnmanagedGetResponseAccessCode other);
    }

    public interface AccessCodeIdStage {
        DeviceIdStage accessCodeId(String accessCodeId);
    }

    public interface DeviceIdStage {
        CreatedAtStage deviceId(String deviceId);
    }

    public interface CreatedAtStage {
        IsManagedStage createdAt(String createdAt);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(String isManaged);
    }

    public interface _FinalStage {
        AccessCodesUnmanagedGetResponseAccessCode build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage code(Optional<String> code);

        _FinalStage code(String code);

        _FinalStage errors(Optional<Object> errors);

        _FinalStage errors(Object errors);

        _FinalStage warnings(Optional<Object> warnings);

        _FinalStage warnings(Object warnings);

        _FinalStage startsAt(Optional<String> startsAt);

        _FinalStage startsAt(String startsAt);

        _FinalStage endsAt(Optional<String> endsAt);

        _FinalStage endsAt(String endsAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TypeStage, AccessCodeIdStage, DeviceIdStage, CreatedAtStage, IsManagedStage, _FinalStage {
        private AccessCodesUnmanagedGetResponseAccessCodeType type;

        private String accessCodeId;

        private String deviceId;

        private String createdAt;

        private String isManaged;

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<Object> warnings = Optional.empty();

        private Optional<Object> errors = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesUnmanagedGetResponseAccessCode other) {
            type(other.getType());
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
            return this;
        }

        @Override
        @JsonSetter("type")
        public AccessCodeIdStage type(AccessCodesUnmanagedGetResponseAccessCodeType type) {
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
        public IsManagedStage createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public _FinalStage isManaged(String isManaged) {
            this.isManaged = isManaged;
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
        public AccessCodesUnmanagedGetResponseAccessCode build() {
            return new AccessCodesUnmanagedGetResponseAccessCode(
                    type, accessCodeId, deviceId, name, code, createdAt, errors, warnings, isManaged, startsAt, endsAt);
        }
    }
}
