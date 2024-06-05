/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.useridentities.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.AcsSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserIdentitiesListAcsSystemsResponse.Builder.class)
public final class UserIdentitiesListAcsSystemsResponse {
    private final List<AcsSystem> acsSystems;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private UserIdentitiesListAcsSystemsResponse(
            List<AcsSystem> acsSystems, boolean ok, Map<String, Object> additionalProperties) {
        this.acsSystems = acsSystems;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_systems")
    public List<AcsSystem> getAcsSystems() {
        return acsSystems;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserIdentitiesListAcsSystemsResponse
                && equalTo((UserIdentitiesListAcsSystemsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserIdentitiesListAcsSystemsResponse other) {
        return acsSystems.equals(other.acsSystems) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.acsSystems, this.ok);
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

        Builder from(UserIdentitiesListAcsSystemsResponse other);
    }

    public interface _FinalStage {
        UserIdentitiesListAcsSystemsResponse build();

        _FinalStage acsSystems(List<AcsSystem> acsSystems);

        _FinalStage addAcsSystems(AcsSystem acsSystems);

        _FinalStage addAllAcsSystems(List<AcsSystem> acsSystems);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AcsSystem> acsSystems = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(UserIdentitiesListAcsSystemsResponse other) {
            acsSystems(other.getAcsSystems());
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
        public _FinalStage addAllAcsSystems(List<AcsSystem> acsSystems) {
            this.acsSystems.addAll(acsSystems);
            return this;
        }

        @Override
        public _FinalStage addAcsSystems(AcsSystem acsSystems) {
            this.acsSystems.add(acsSystems);
            return this;
        }

        @Override
        @JsonSetter(value = "acs_systems", nulls = Nulls.SKIP)
        public _FinalStage acsSystems(List<AcsSystem> acsSystems) {
            this.acsSystems.clear();
            this.acsSystems.addAll(acsSystems);
            return this;
        }

        @Override
        public UserIdentitiesListAcsSystemsResponse build() {
            return new UserIdentitiesListAcsSystemsResponse(acsSystems, ok, additionalProperties);
        }
    }
}
