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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EnrollmentAutomation.Builder.class)
public final class EnrollmentAutomation {
    private final String credentialManagerAcsSystemId;

    private final String userIdentityId;

    private final OffsetDateTime createdAt;

    private final String workspaceId;

    private final String enrollmentAutomationId;

    private final Map<String, Object> additionalProperties;

    private EnrollmentAutomation(
            String credentialManagerAcsSystemId,
            String userIdentityId,
            OffsetDateTime createdAt,
            String workspaceId,
            String enrollmentAutomationId,
            Map<String, Object> additionalProperties) {
        this.credentialManagerAcsSystemId = credentialManagerAcsSystemId;
        this.userIdentityId = userIdentityId;
        this.createdAt = createdAt;
        this.workspaceId = workspaceId;
        this.enrollmentAutomationId = enrollmentAutomationId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("credential_manager_acs_system_id")
    public String getCredentialManagerAcsSystemId() {
        return credentialManagerAcsSystemId;
    }

    @JsonProperty("user_identity_id")
    public String getUserIdentityId() {
        return userIdentityId;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("enrollment_automation_id")
    public String getEnrollmentAutomationId() {
        return enrollmentAutomationId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EnrollmentAutomation && equalTo((EnrollmentAutomation) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EnrollmentAutomation other) {
        return credentialManagerAcsSystemId.equals(other.credentialManagerAcsSystemId)
                && userIdentityId.equals(other.userIdentityId)
                && createdAt.equals(other.createdAt)
                && workspaceId.equals(other.workspaceId)
                && enrollmentAutomationId.equals(other.enrollmentAutomationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.credentialManagerAcsSystemId,
                this.userIdentityId,
                this.createdAt,
                this.workspaceId,
                this.enrollmentAutomationId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CredentialManagerAcsSystemIdStage builder() {
        return new Builder();
    }

    public interface CredentialManagerAcsSystemIdStage {
        UserIdentityIdStage credentialManagerAcsSystemId(String credentialManagerAcsSystemId);

        Builder from(EnrollmentAutomation other);
    }

    public interface UserIdentityIdStage {
        CreatedAtStage userIdentityId(String userIdentityId);
    }

    public interface CreatedAtStage {
        WorkspaceIdStage createdAt(OffsetDateTime createdAt);
    }

    public interface WorkspaceIdStage {
        EnrollmentAutomationIdStage workspaceId(String workspaceId);
    }

    public interface EnrollmentAutomationIdStage {
        _FinalStage enrollmentAutomationId(String enrollmentAutomationId);
    }

    public interface _FinalStage {
        EnrollmentAutomation build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements CredentialManagerAcsSystemIdStage,
                    UserIdentityIdStage,
                    CreatedAtStage,
                    WorkspaceIdStage,
                    EnrollmentAutomationIdStage,
                    _FinalStage {
        private String credentialManagerAcsSystemId;

        private String userIdentityId;

        private OffsetDateTime createdAt;

        private String workspaceId;

        private String enrollmentAutomationId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(EnrollmentAutomation other) {
            credentialManagerAcsSystemId(other.getCredentialManagerAcsSystemId());
            userIdentityId(other.getUserIdentityId());
            createdAt(other.getCreatedAt());
            workspaceId(other.getWorkspaceId());
            enrollmentAutomationId(other.getEnrollmentAutomationId());
            return this;
        }

        @Override
        @JsonSetter("credential_manager_acs_system_id")
        public UserIdentityIdStage credentialManagerAcsSystemId(String credentialManagerAcsSystemId) {
            this.credentialManagerAcsSystemId = credentialManagerAcsSystemId;
            return this;
        }

        @Override
        @JsonSetter("user_identity_id")
        public CreatedAtStage userIdentityId(String userIdentityId) {
            this.userIdentityId = userIdentityId;
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
        public EnrollmentAutomationIdStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        @JsonSetter("enrollment_automation_id")
        public _FinalStage enrollmentAutomationId(String enrollmentAutomationId) {
            this.enrollmentAutomationId = enrollmentAutomationId;
            return this;
        }

        @Override
        public EnrollmentAutomation build() {
            return new EnrollmentAutomation(
                    credentialManagerAcsSystemId,
                    userIdentityId,
                    createdAt,
                    workspaceId,
                    enrollmentAutomationId,
                    additionalProperties);
        }
    }
}
