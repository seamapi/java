/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.useridentities.enrollmentautomations.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EnrollmentAutomationsLaunchRequest.Builder.class)
public final class EnrollmentAutomationsLaunchRequest {
    private final String userIdentityId;

    private final String credentialManagerAcsSystemId;

    private final Optional<String> acsCredentialPoolId;

    private final Optional<Boolean> createCredentialManagerUser;

    private final Optional<String> credentialManagerAcsUserId;

    private final Map<String, Object> additionalProperties;

    private EnrollmentAutomationsLaunchRequest(
            String userIdentityId,
            String credentialManagerAcsSystemId,
            Optional<String> acsCredentialPoolId,
            Optional<Boolean> createCredentialManagerUser,
            Optional<String> credentialManagerAcsUserId,
            Map<String, Object> additionalProperties) {
        this.userIdentityId = userIdentityId;
        this.credentialManagerAcsSystemId = credentialManagerAcsSystemId;
        this.acsCredentialPoolId = acsCredentialPoolId;
        this.createCredentialManagerUser = createCredentialManagerUser;
        this.credentialManagerAcsUserId = credentialManagerAcsUserId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_identity_id")
    public String getUserIdentityId() {
        return userIdentityId;
    }

    @JsonProperty("credential_manager_acs_system_id")
    public String getCredentialManagerAcsSystemId() {
        return credentialManagerAcsSystemId;
    }

    @JsonProperty("acs_credential_pool_id")
    public Optional<String> getAcsCredentialPoolId() {
        return acsCredentialPoolId;
    }

    @JsonProperty("create_credential_manager_user")
    public Optional<Boolean> getCreateCredentialManagerUser() {
        return createCredentialManagerUser;
    }

    @JsonProperty("credential_manager_acs_user_id")
    public Optional<String> getCredentialManagerAcsUserId() {
        return credentialManagerAcsUserId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EnrollmentAutomationsLaunchRequest
                && equalTo((EnrollmentAutomationsLaunchRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EnrollmentAutomationsLaunchRequest other) {
        return userIdentityId.equals(other.userIdentityId)
                && credentialManagerAcsSystemId.equals(other.credentialManagerAcsSystemId)
                && acsCredentialPoolId.equals(other.acsCredentialPoolId)
                && createCredentialManagerUser.equals(other.createCredentialManagerUser)
                && credentialManagerAcsUserId.equals(other.credentialManagerAcsUserId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userIdentityId,
                this.credentialManagerAcsSystemId,
                this.acsCredentialPoolId,
                this.createCredentialManagerUser,
                this.credentialManagerAcsUserId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdentityIdStage builder() {
        return new Builder();
    }

    public interface UserIdentityIdStage {
        CredentialManagerAcsSystemIdStage userIdentityId(String userIdentityId);

        Builder from(EnrollmentAutomationsLaunchRequest other);
    }

    public interface CredentialManagerAcsSystemIdStage {
        _FinalStage credentialManagerAcsSystemId(String credentialManagerAcsSystemId);
    }

    public interface _FinalStage {
        EnrollmentAutomationsLaunchRequest build();

        _FinalStage acsCredentialPoolId(Optional<String> acsCredentialPoolId);

        _FinalStage acsCredentialPoolId(String acsCredentialPoolId);

        _FinalStage createCredentialManagerUser(Optional<Boolean> createCredentialManagerUser);

        _FinalStage createCredentialManagerUser(Boolean createCredentialManagerUser);

        _FinalStage credentialManagerAcsUserId(Optional<String> credentialManagerAcsUserId);

        _FinalStage credentialManagerAcsUserId(String credentialManagerAcsUserId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdentityIdStage, CredentialManagerAcsSystemIdStage, _FinalStage {
        private String userIdentityId;

        private String credentialManagerAcsSystemId;

        private Optional<String> credentialManagerAcsUserId = Optional.empty();

        private Optional<Boolean> createCredentialManagerUser = Optional.empty();

        private Optional<String> acsCredentialPoolId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EnrollmentAutomationsLaunchRequest other) {
            userIdentityId(other.getUserIdentityId());
            credentialManagerAcsSystemId(other.getCredentialManagerAcsSystemId());
            acsCredentialPoolId(other.getAcsCredentialPoolId());
            createCredentialManagerUser(other.getCreateCredentialManagerUser());
            credentialManagerAcsUserId(other.getCredentialManagerAcsUserId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_identity_id")
        public CredentialManagerAcsSystemIdStage userIdentityId(String userIdentityId) {
            this.userIdentityId = userIdentityId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("credential_manager_acs_system_id")
        public _FinalStage credentialManagerAcsSystemId(String credentialManagerAcsSystemId) {
            this.credentialManagerAcsSystemId = credentialManagerAcsSystemId;
            return this;
        }

        @java.lang.Override
        public _FinalStage credentialManagerAcsUserId(String credentialManagerAcsUserId) {
            this.credentialManagerAcsUserId = Optional.of(credentialManagerAcsUserId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "credential_manager_acs_user_id", nulls = Nulls.SKIP)
        public _FinalStage credentialManagerAcsUserId(Optional<String> credentialManagerAcsUserId) {
            this.credentialManagerAcsUserId = credentialManagerAcsUserId;
            return this;
        }

        @java.lang.Override
        public _FinalStage createCredentialManagerUser(Boolean createCredentialManagerUser) {
            this.createCredentialManagerUser = Optional.of(createCredentialManagerUser);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "create_credential_manager_user", nulls = Nulls.SKIP)
        public _FinalStage createCredentialManagerUser(Optional<Boolean> createCredentialManagerUser) {
            this.createCredentialManagerUser = createCredentialManagerUser;
            return this;
        }

        @java.lang.Override
        public _FinalStage acsCredentialPoolId(String acsCredentialPoolId) {
            this.acsCredentialPoolId = Optional.of(acsCredentialPoolId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "acs_credential_pool_id", nulls = Nulls.SKIP)
        public _FinalStage acsCredentialPoolId(Optional<String> acsCredentialPoolId) {
            this.acsCredentialPoolId = acsCredentialPoolId;
            return this;
        }

        @java.lang.Override
        public EnrollmentAutomationsLaunchRequest build() {
            return new EnrollmentAutomationsLaunchRequest(
                    userIdentityId,
                    credentialManagerAcsSystemId,
                    acsCredentialPoolId,
                    createCredentialManagerUser,
                    credentialManagerAcsUserId,
                    additionalProperties);
        }
    }
}
