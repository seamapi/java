/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.accessgroups.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.AcsAccessGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessGroupsListResponse.Builder.class)
public final class AccessGroupsListResponse {
    private final List<AcsAccessGroup> acsAccessGroups;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private AccessGroupsListResponse(
            List<AcsAccessGroup> acsAccessGroups, boolean ok, Map<String, Object> additionalProperties) {
        this.acsAccessGroups = acsAccessGroups;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_access_groups")
    public List<AcsAccessGroup> getAcsAccessGroups() {
        return acsAccessGroups;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessGroupsListResponse && equalTo((AccessGroupsListResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AccessGroupsListResponse other) {
        return acsAccessGroups.equals(other.acsAccessGroups) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.acsAccessGroups, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(AccessGroupsListResponse other);
    }

    public interface _FinalStage {
        AccessGroupsListResponse build();

        _FinalStage acsAccessGroups(List<AcsAccessGroup> acsAccessGroups);

        _FinalStage addAcsAccessGroups(AcsAccessGroup acsAccessGroups);

        _FinalStage addAllAcsAccessGroups(List<AcsAccessGroup> acsAccessGroups);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AcsAccessGroup> acsAccessGroups = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AccessGroupsListResponse other) {
            acsAccessGroups(other.getAcsAccessGroups());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllAcsAccessGroups(List<AcsAccessGroup> acsAccessGroups) {
            this.acsAccessGroups.addAll(acsAccessGroups);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAcsAccessGroups(AcsAccessGroup acsAccessGroups) {
            this.acsAccessGroups.add(acsAccessGroups);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "acs_access_groups", nulls = Nulls.SKIP)
        public _FinalStage acsAccessGroups(List<AcsAccessGroup> acsAccessGroups) {
            this.acsAccessGroups.clear();
            this.acsAccessGroups.addAll(acsAccessGroups);
            return this;
        }

        @java.lang.Override
        public AccessGroupsListResponse build() {
            return new AccessGroupsListResponse(acsAccessGroups, ok, additionalProperties);
        }
    }
}
