/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.credentialpools.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.AcsCredentialPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CredentialPoolsListResponse.Builder.class)
public final class CredentialPoolsListResponse {
    private final List<AcsCredentialPool> acsCredentialPools;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private CredentialPoolsListResponse(
            List<AcsCredentialPool> acsCredentialPools, boolean ok, Map<String, Object> additionalProperties) {
        this.acsCredentialPools = acsCredentialPools;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_credential_pools")
    public List<AcsCredentialPool> getAcsCredentialPools() {
        return acsCredentialPools;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CredentialPoolsListResponse && equalTo((CredentialPoolsListResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CredentialPoolsListResponse other) {
        return acsCredentialPools.equals(other.acsCredentialPools) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.acsCredentialPools, this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(CredentialPoolsListResponse other);
    }

    public interface _FinalStage {
        CredentialPoolsListResponse build();

        _FinalStage acsCredentialPools(List<AcsCredentialPool> acsCredentialPools);

        _FinalStage addAcsCredentialPools(AcsCredentialPool acsCredentialPools);

        _FinalStage addAllAcsCredentialPools(List<AcsCredentialPool> acsCredentialPools);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AcsCredentialPool> acsCredentialPools = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(CredentialPoolsListResponse other) {
            acsCredentialPools(other.getAcsCredentialPools());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage addAllAcsCredentialPools(List<AcsCredentialPool> acsCredentialPools) {
            this.acsCredentialPools.addAll(acsCredentialPools);
            return this;
        }

        @Override
        public _FinalStage addAcsCredentialPools(AcsCredentialPool acsCredentialPools) {
            this.acsCredentialPools.add(acsCredentialPools);
            return this;
        }

        @Override
        @JsonSetter(value = "acs_credential_pools", nulls = Nulls.SKIP)
        public _FinalStage acsCredentialPools(List<AcsCredentialPool> acsCredentialPools) {
            this.acsCredentialPools.clear();
            this.acsCredentialPools.addAll(acsCredentialPools);
            return this;
        }

        @Override
        public CredentialPoolsListResponse build() {
            return new CredentialPoolsListResponse(acsCredentialPools, ok, additionalProperties);
        }
    }
}
