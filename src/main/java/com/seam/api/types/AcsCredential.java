/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AcsCredential.Builder.class)
public final class AcsCredential {
    private final String acsCredentialId;

    private final Optional<String> acsUserId;

    private final Optional<String> acsCredentialPoolId;

    private final String acsSystemId;

    private final Optional<String> parentAcsCredentialId;

    private final String displayName;

    private final Optional<String> code;

    private final AcsCredentialAccessMethod accessMethod;

    private final Optional<AcsCredentialExternalType> externalType;

    private final Optional<String> externalTypeDisplayName;

    private final OffsetDateTime createdAt;

    private final String workspaceId;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private final List<AcsCredentialErrorsItem> errors;

    private final List<AcsCredentialWarningsItem> warnings;

    private final Optional<Boolean> isMultiPhoneSyncCredential;

    private final Optional<AcsCredentialVisionlineMetadata> visionlineMetadata;

    private final Map<String, Object> additionalProperties;

    private AcsCredential(
            String acsCredentialId,
            Optional<String> acsUserId,
            Optional<String> acsCredentialPoolId,
            String acsSystemId,
            Optional<String> parentAcsCredentialId,
            String displayName,
            Optional<String> code,
            AcsCredentialAccessMethod accessMethod,
            Optional<AcsCredentialExternalType> externalType,
            Optional<String> externalTypeDisplayName,
            OffsetDateTime createdAt,
            String workspaceId,
            Optional<String> startsAt,
            Optional<String> endsAt,
            List<AcsCredentialErrorsItem> errors,
            List<AcsCredentialWarningsItem> warnings,
            Optional<Boolean> isMultiPhoneSyncCredential,
            Optional<AcsCredentialVisionlineMetadata> visionlineMetadata,
            Map<String, Object> additionalProperties) {
        this.acsCredentialId = acsCredentialId;
        this.acsUserId = acsUserId;
        this.acsCredentialPoolId = acsCredentialPoolId;
        this.acsSystemId = acsSystemId;
        this.parentAcsCredentialId = parentAcsCredentialId;
        this.displayName = displayName;
        this.code = code;
        this.accessMethod = accessMethod;
        this.externalType = externalType;
        this.externalTypeDisplayName = externalTypeDisplayName;
        this.createdAt = createdAt;
        this.workspaceId = workspaceId;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.errors = errors;
        this.warnings = warnings;
        this.isMultiPhoneSyncCredential = isMultiPhoneSyncCredential;
        this.visionlineMetadata = visionlineMetadata;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_credential_id")
    public String getAcsCredentialId() {
        return acsCredentialId;
    }

    @JsonProperty("acs_user_id")
    public Optional<String> getAcsUserId() {
        return acsUserId;
    }

    @JsonProperty("acs_credential_pool_id")
    public Optional<String> getAcsCredentialPoolId() {
        return acsCredentialPoolId;
    }

    @JsonProperty("acs_system_id")
    public String getAcsSystemId() {
        return acsSystemId;
    }

    @JsonProperty("parent_acs_credential_id")
    public Optional<String> getParentAcsCredentialId() {
        return parentAcsCredentialId;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @JsonProperty("access_method")
    public AcsCredentialAccessMethod getAccessMethod() {
        return accessMethod;
    }

    @JsonProperty("external_type")
    public Optional<AcsCredentialExternalType> getExternalType() {
        return externalType;
    }

    @JsonProperty("external_type_display_name")
    public Optional<String> getExternalTypeDisplayName() {
        return externalTypeDisplayName;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("starts_at")
    public Optional<String> getStartsAt() {
        return startsAt;
    }

    @JsonProperty("ends_at")
    public Optional<String> getEndsAt() {
        return endsAt;
    }

    @JsonProperty("errors")
    public List<AcsCredentialErrorsItem> getErrors() {
        return errors;
    }

    @JsonProperty("warnings")
    public List<AcsCredentialWarningsItem> getWarnings() {
        return warnings;
    }

    @JsonProperty("is_multi_phone_sync_credential")
    public Optional<Boolean> getIsMultiPhoneSyncCredential() {
        return isMultiPhoneSyncCredential;
    }

    @JsonProperty("visionline_metadata")
    public Optional<AcsCredentialVisionlineMetadata> getVisionlineMetadata() {
        return visionlineMetadata;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AcsCredential && equalTo((AcsCredential) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AcsCredential other) {
        return acsCredentialId.equals(other.acsCredentialId)
                && acsUserId.equals(other.acsUserId)
                && acsCredentialPoolId.equals(other.acsCredentialPoolId)
                && acsSystemId.equals(other.acsSystemId)
                && parentAcsCredentialId.equals(other.parentAcsCredentialId)
                && displayName.equals(other.displayName)
                && code.equals(other.code)
                && accessMethod.equals(other.accessMethod)
                && externalType.equals(other.externalType)
                && externalTypeDisplayName.equals(other.externalTypeDisplayName)
                && createdAt.equals(other.createdAt)
                && workspaceId.equals(other.workspaceId)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt)
                && errors.equals(other.errors)
                && warnings.equals(other.warnings)
                && isMultiPhoneSyncCredential.equals(other.isMultiPhoneSyncCredential)
                && visionlineMetadata.equals(other.visionlineMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.acsCredentialId,
                this.acsUserId,
                this.acsCredentialPoolId,
                this.acsSystemId,
                this.parentAcsCredentialId,
                this.displayName,
                this.code,
                this.accessMethod,
                this.externalType,
                this.externalTypeDisplayName,
                this.createdAt,
                this.workspaceId,
                this.startsAt,
                this.endsAt,
                this.errors,
                this.warnings,
                this.isMultiPhoneSyncCredential,
                this.visionlineMetadata);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AcsCredentialIdStage builder() {
        return new Builder();
    }

    public interface AcsCredentialIdStage {
        AcsSystemIdStage acsCredentialId(String acsCredentialId);

        Builder from(AcsCredential other);
    }

    public interface AcsSystemIdStage {
        DisplayNameStage acsSystemId(String acsSystemId);
    }

    public interface DisplayNameStage {
        AccessMethodStage displayName(String displayName);
    }

    public interface AccessMethodStage {
        CreatedAtStage accessMethod(AcsCredentialAccessMethod accessMethod);
    }

    public interface CreatedAtStage {
        WorkspaceIdStage createdAt(OffsetDateTime createdAt);
    }

    public interface WorkspaceIdStage {
        _FinalStage workspaceId(String workspaceId);
    }

    public interface _FinalStage {
        AcsCredential build();

        _FinalStage acsUserId(Optional<String> acsUserId);

        _FinalStage acsUserId(String acsUserId);

        _FinalStage acsCredentialPoolId(Optional<String> acsCredentialPoolId);

        _FinalStage acsCredentialPoolId(String acsCredentialPoolId);

        _FinalStage parentAcsCredentialId(Optional<String> parentAcsCredentialId);

        _FinalStage parentAcsCredentialId(String parentAcsCredentialId);

        _FinalStage code(Optional<String> code);

        _FinalStage code(String code);

        _FinalStage externalType(Optional<AcsCredentialExternalType> externalType);

        _FinalStage externalType(AcsCredentialExternalType externalType);

        _FinalStage externalTypeDisplayName(Optional<String> externalTypeDisplayName);

        _FinalStage externalTypeDisplayName(String externalTypeDisplayName);

        _FinalStage startsAt(Optional<String> startsAt);

        _FinalStage startsAt(String startsAt);

        _FinalStage endsAt(Optional<String> endsAt);

        _FinalStage endsAt(String endsAt);

        _FinalStage errors(List<AcsCredentialErrorsItem> errors);

        _FinalStage addErrors(AcsCredentialErrorsItem errors);

        _FinalStage addAllErrors(List<AcsCredentialErrorsItem> errors);

        _FinalStage warnings(List<AcsCredentialWarningsItem> warnings);

        _FinalStage addWarnings(AcsCredentialWarningsItem warnings);

        _FinalStage addAllWarnings(List<AcsCredentialWarningsItem> warnings);

        _FinalStage isMultiPhoneSyncCredential(Optional<Boolean> isMultiPhoneSyncCredential);

        _FinalStage isMultiPhoneSyncCredential(Boolean isMultiPhoneSyncCredential);

        _FinalStage visionlineMetadata(Optional<AcsCredentialVisionlineMetadata> visionlineMetadata);

        _FinalStage visionlineMetadata(AcsCredentialVisionlineMetadata visionlineMetadata);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AcsCredentialIdStage,
                    AcsSystemIdStage,
                    DisplayNameStage,
                    AccessMethodStage,
                    CreatedAtStage,
                    WorkspaceIdStage,
                    _FinalStage {
        private String acsCredentialId;

        private String acsSystemId;

        private String displayName;

        private AcsCredentialAccessMethod accessMethod;

        private OffsetDateTime createdAt;

        private String workspaceId;

        private Optional<AcsCredentialVisionlineMetadata> visionlineMetadata = Optional.empty();

        private Optional<Boolean> isMultiPhoneSyncCredential = Optional.empty();

        private List<AcsCredentialWarningsItem> warnings = new ArrayList<>();

        private List<AcsCredentialErrorsItem> errors = new ArrayList<>();

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<String> externalTypeDisplayName = Optional.empty();

        private Optional<AcsCredentialExternalType> externalType = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> parentAcsCredentialId = Optional.empty();

        private Optional<String> acsCredentialPoolId = Optional.empty();

        private Optional<String> acsUserId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(AcsCredential other) {
            acsCredentialId(other.getAcsCredentialId());
            acsUserId(other.getAcsUserId());
            acsCredentialPoolId(other.getAcsCredentialPoolId());
            acsSystemId(other.getAcsSystemId());
            parentAcsCredentialId(other.getParentAcsCredentialId());
            displayName(other.getDisplayName());
            code(other.getCode());
            accessMethod(other.getAccessMethod());
            externalType(other.getExternalType());
            externalTypeDisplayName(other.getExternalTypeDisplayName());
            createdAt(other.getCreatedAt());
            workspaceId(other.getWorkspaceId());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            errors(other.getErrors());
            warnings(other.getWarnings());
            isMultiPhoneSyncCredential(other.getIsMultiPhoneSyncCredential());
            visionlineMetadata(other.getVisionlineMetadata());
            return this;
        }

        @Override
        @JsonSetter("acs_credential_id")
        public AcsSystemIdStage acsCredentialId(String acsCredentialId) {
            this.acsCredentialId = acsCredentialId;
            return this;
        }

        @Override
        @JsonSetter("acs_system_id")
        public DisplayNameStage acsSystemId(String acsSystemId) {
            this.acsSystemId = acsSystemId;
            return this;
        }

        @Override
        @JsonSetter("display_name")
        public AccessMethodStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        @JsonSetter("access_method")
        public CreatedAtStage accessMethod(AcsCredentialAccessMethod accessMethod) {
            this.accessMethod = accessMethod;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public WorkspaceIdStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("workspace_id")
        public _FinalStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public _FinalStage visionlineMetadata(AcsCredentialVisionlineMetadata visionlineMetadata) {
            this.visionlineMetadata = Optional.of(visionlineMetadata);
            return this;
        }

        @Override
        @JsonSetter(value = "visionline_metadata", nulls = Nulls.SKIP)
        public _FinalStage visionlineMetadata(Optional<AcsCredentialVisionlineMetadata> visionlineMetadata) {
            this.visionlineMetadata = visionlineMetadata;
            return this;
        }

        @Override
        public _FinalStage isMultiPhoneSyncCredential(Boolean isMultiPhoneSyncCredential) {
            this.isMultiPhoneSyncCredential = Optional.of(isMultiPhoneSyncCredential);
            return this;
        }

        @Override
        @JsonSetter(value = "is_multi_phone_sync_credential", nulls = Nulls.SKIP)
        public _FinalStage isMultiPhoneSyncCredential(Optional<Boolean> isMultiPhoneSyncCredential) {
            this.isMultiPhoneSyncCredential = isMultiPhoneSyncCredential;
            return this;
        }

        @Override
        public _FinalStage addAllWarnings(List<AcsCredentialWarningsItem> warnings) {
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public _FinalStage addWarnings(AcsCredentialWarningsItem warnings) {
            this.warnings.add(warnings);
            return this;
        }

        @Override
        @JsonSetter(value = "warnings", nulls = Nulls.SKIP)
        public _FinalStage warnings(List<AcsCredentialWarningsItem> warnings) {
            this.warnings.clear();
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public _FinalStage addAllErrors(List<AcsCredentialErrorsItem> errors) {
            this.errors.addAll(errors);
            return this;
        }

        @Override
        public _FinalStage addErrors(AcsCredentialErrorsItem errors) {
            this.errors.add(errors);
            return this;
        }

        @Override
        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public _FinalStage errors(List<AcsCredentialErrorsItem> errors) {
            this.errors.clear();
            this.errors.addAll(errors);
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
        public _FinalStage externalTypeDisplayName(String externalTypeDisplayName) {
            this.externalTypeDisplayName = Optional.of(externalTypeDisplayName);
            return this;
        }

        @Override
        @JsonSetter(value = "external_type_display_name", nulls = Nulls.SKIP)
        public _FinalStage externalTypeDisplayName(Optional<String> externalTypeDisplayName) {
            this.externalTypeDisplayName = externalTypeDisplayName;
            return this;
        }

        @Override
        public _FinalStage externalType(AcsCredentialExternalType externalType) {
            this.externalType = Optional.of(externalType);
            return this;
        }

        @Override
        @JsonSetter(value = "external_type", nulls = Nulls.SKIP)
        public _FinalStage externalType(Optional<AcsCredentialExternalType> externalType) {
            this.externalType = externalType;
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
        public _FinalStage parentAcsCredentialId(String parentAcsCredentialId) {
            this.parentAcsCredentialId = Optional.of(parentAcsCredentialId);
            return this;
        }

        @Override
        @JsonSetter(value = "parent_acs_credential_id", nulls = Nulls.SKIP)
        public _FinalStage parentAcsCredentialId(Optional<String> parentAcsCredentialId) {
            this.parentAcsCredentialId = parentAcsCredentialId;
            return this;
        }

        @Override
        public _FinalStage acsCredentialPoolId(String acsCredentialPoolId) {
            this.acsCredentialPoolId = Optional.of(acsCredentialPoolId);
            return this;
        }

        @Override
        @JsonSetter(value = "acs_credential_pool_id", nulls = Nulls.SKIP)
        public _FinalStage acsCredentialPoolId(Optional<String> acsCredentialPoolId) {
            this.acsCredentialPoolId = acsCredentialPoolId;
            return this;
        }

        @Override
        public _FinalStage acsUserId(String acsUserId) {
            this.acsUserId = Optional.of(acsUserId);
            return this;
        }

        @Override
        @JsonSetter(value = "acs_user_id", nulls = Nulls.SKIP)
        public _FinalStage acsUserId(Optional<String> acsUserId) {
            this.acsUserId = acsUserId;
            return this;
        }

        @Override
        public AcsCredential build() {
            return new AcsCredential(
                    acsCredentialId,
                    acsUserId,
                    acsCredentialPoolId,
                    acsSystemId,
                    parentAcsCredentialId,
                    displayName,
                    code,
                    accessMethod,
                    externalType,
                    externalTypeDisplayName,
                    createdAt,
                    workspaceId,
                    startsAt,
                    endsAt,
                    errors,
                    warnings,
                    isMultiPhoneSyncCredential,
                    visionlineMetadata,
                    additionalProperties);
        }
    }
}
