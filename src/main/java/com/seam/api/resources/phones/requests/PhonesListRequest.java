/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.phones.requests;

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
@JsonDeserialize(builder = PhonesListRequest.Builder.class)
public final class PhonesListRequest {
    private final Optional<String> ownerUserIdentityId;

    private final Map<String, Object> additionalProperties;

    private PhonesListRequest(Optional<String> ownerUserIdentityId, Map<String, Object> additionalProperties) {
        this.ownerUserIdentityId = ownerUserIdentityId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("owner_user_identity_id")
    public Optional<String> getOwnerUserIdentityId() {
        return ownerUserIdentityId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhonesListRequest && equalTo((PhonesListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PhonesListRequest other) {
        return ownerUserIdentityId.equals(other.ownerUserIdentityId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ownerUserIdentityId);
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
        private Optional<String> ownerUserIdentityId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PhonesListRequest other) {
            ownerUserIdentityId(other.getOwnerUserIdentityId());
            return this;
        }

        @JsonSetter(value = "owner_user_identity_id", nulls = Nulls.SKIP)
        public Builder ownerUserIdentityId(Optional<String> ownerUserIdentityId) {
            this.ownerUserIdentityId = ownerUserIdentityId;
            return this;
        }

        public Builder ownerUserIdentityId(String ownerUserIdentityId) {
            this.ownerUserIdentityId = Optional.of(ownerUserIdentityId);
            return this;
        }

        public PhonesListRequest build() {
            return new PhonesListRequest(ownerUserIdentityId, additionalProperties);
        }
    }
}
