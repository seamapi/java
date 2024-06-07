/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.users.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.AcsEntrance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UsersListAccessibleEntrancesResponse.Builder.class)
public final class UsersListAccessibleEntrancesResponse {
    private final List<AcsEntrance> acsEntrances;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private UsersListAccessibleEntrancesResponse(
            List<AcsEntrance> acsEntrances, boolean ok, Map<String, Object> additionalProperties) {
        this.acsEntrances = acsEntrances;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_entrances")
    public List<AcsEntrance> getAcsEntrances() {
        return acsEntrances;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UsersListAccessibleEntrancesResponse
                && equalTo((UsersListAccessibleEntrancesResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UsersListAccessibleEntrancesResponse other) {
        return acsEntrances.equals(other.acsEntrances) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.acsEntrances, this.ok);
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

        Builder from(UsersListAccessibleEntrancesResponse other);
    }

    public interface _FinalStage {
        UsersListAccessibleEntrancesResponse build();

        _FinalStage acsEntrances(List<AcsEntrance> acsEntrances);

        _FinalStage addAcsEntrances(AcsEntrance acsEntrances);

        _FinalStage addAllAcsEntrances(List<AcsEntrance> acsEntrances);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AcsEntrance> acsEntrances = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UsersListAccessibleEntrancesResponse other) {
            acsEntrances(other.getAcsEntrances());
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
        public _FinalStage addAllAcsEntrances(List<AcsEntrance> acsEntrances) {
            this.acsEntrances.addAll(acsEntrances);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAcsEntrances(AcsEntrance acsEntrances) {
            this.acsEntrances.add(acsEntrances);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "acs_entrances", nulls = Nulls.SKIP)
        public _FinalStage acsEntrances(List<AcsEntrance> acsEntrances) {
            this.acsEntrances.clear();
            this.acsEntrances.addAll(acsEntrances);
            return this;
        }

        @java.lang.Override
        public UsersListAccessibleEntrancesResponse build() {
            return new UsersListAccessibleEntrancesResponse(acsEntrances, ok, additionalProperties);
        }
    }
}