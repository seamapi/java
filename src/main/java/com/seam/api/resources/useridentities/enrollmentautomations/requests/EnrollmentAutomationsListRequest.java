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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EnrollmentAutomationsListRequest.Builder.class)
public final class EnrollmentAutomationsListRequest {
    private final String userIdentityId;

    private final Map<String, Object> additionalProperties;

    private EnrollmentAutomationsListRequest(String userIdentityId, Map<String, Object> additionalProperties) {
        this.userIdentityId = userIdentityId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_identity_id")
    public String getUserIdentityId() {
        return userIdentityId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EnrollmentAutomationsListRequest && equalTo((EnrollmentAutomationsListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EnrollmentAutomationsListRequest other) {
        return userIdentityId.equals(other.userIdentityId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userIdentityId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdentityIdStage builder() {
        return new Builder();
    }

    public interface UserIdentityIdStage {
        _FinalStage userIdentityId(String userIdentityId);

        Builder from(EnrollmentAutomationsListRequest other);
    }

    public interface _FinalStage {
        EnrollmentAutomationsListRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdentityIdStage, _FinalStage {
        private String userIdentityId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EnrollmentAutomationsListRequest other) {
            userIdentityId(other.getUserIdentityId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_identity_id")
        public _FinalStage userIdentityId(String userIdentityId) {
            this.userIdentityId = userIdentityId;
            return this;
        }

        @java.lang.Override
        public EnrollmentAutomationsListRequest build() {
            return new EnrollmentAutomationsListRequest(userIdentityId, additionalProperties);
        }
    }
}
