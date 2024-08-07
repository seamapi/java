/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.useridentities.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserIdentitiesAddAcsUserRequest.Builder.class)
public final class UserIdentitiesAddAcsUserRequest {
    private final String userIdentityId;

    private final String acsUserId;

    private final Map<String, Object> additionalProperties;

    private UserIdentitiesAddAcsUserRequest(
            String userIdentityId, String acsUserId, Map<String, Object> additionalProperties) {
        this.userIdentityId = userIdentityId;
        this.acsUserId = acsUserId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_identity_id")
    public String getUserIdentityId() {
        return userIdentityId;
    }

    @JsonProperty("acs_user_id")
    public String getAcsUserId() {
        return acsUserId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserIdentitiesAddAcsUserRequest && equalTo((UserIdentitiesAddAcsUserRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserIdentitiesAddAcsUserRequest other) {
        return userIdentityId.equals(other.userIdentityId) && acsUserId.equals(other.acsUserId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userIdentityId, this.acsUserId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdentityIdStage builder() {
        return new Builder();
    }

    public interface UserIdentityIdStage {
        AcsUserIdStage userIdentityId(String userIdentityId);

        Builder from(UserIdentitiesAddAcsUserRequest other);
    }

    public interface AcsUserIdStage {
        _FinalStage acsUserId(String acsUserId);
    }

    public interface _FinalStage {
        UserIdentitiesAddAcsUserRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdentityIdStage, AcsUserIdStage, _FinalStage {
        private String userIdentityId;

        private String acsUserId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserIdentitiesAddAcsUserRequest other) {
            userIdentityId(other.getUserIdentityId());
            acsUserId(other.getAcsUserId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_identity_id")
        public AcsUserIdStage userIdentityId(String userIdentityId) {
            this.userIdentityId = userIdentityId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("acs_user_id")
        public _FinalStage acsUserId(String acsUserId) {
            this.acsUserId = acsUserId;
            return this;
        }

        @java.lang.Override
        public UserIdentitiesAddAcsUserRequest build() {
            return new UserIdentitiesAddAcsUserRequest(userIdentityId, acsUserId, additionalProperties);
        }
    }
}
