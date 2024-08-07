/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.entrances.requests;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EntrancesListCredentialsWithAccessRequest.Builder.class)
public final class EntrancesListCredentialsWithAccessRequest {
    private final String acsEntranceId;

    private final Optional<List<String>> includeIf;

    private final Map<String, Object> additionalProperties;

    private EntrancesListCredentialsWithAccessRequest(
            String acsEntranceId, Optional<List<String>> includeIf, Map<String, Object> additionalProperties) {
        this.acsEntranceId = acsEntranceId;
        this.includeIf = includeIf;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_entrance_id")
    public String getAcsEntranceId() {
        return acsEntranceId;
    }

    @JsonProperty("include_if")
    public Optional<List<String>> getIncludeIf() {
        return includeIf;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntrancesListCredentialsWithAccessRequest
                && equalTo((EntrancesListCredentialsWithAccessRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntrancesListCredentialsWithAccessRequest other) {
        return acsEntranceId.equals(other.acsEntranceId) && includeIf.equals(other.includeIf);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.acsEntranceId, this.includeIf);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AcsEntranceIdStage builder() {
        return new Builder();
    }

    public interface AcsEntranceIdStage {
        _FinalStage acsEntranceId(String acsEntranceId);

        Builder from(EntrancesListCredentialsWithAccessRequest other);
    }

    public interface _FinalStage {
        EntrancesListCredentialsWithAccessRequest build();

        _FinalStage includeIf(Optional<List<String>> includeIf);

        _FinalStage includeIf(List<String> includeIf);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AcsEntranceIdStage, _FinalStage {
        private String acsEntranceId;

        private Optional<List<String>> includeIf = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntrancesListCredentialsWithAccessRequest other) {
            acsEntranceId(other.getAcsEntranceId());
            includeIf(other.getIncludeIf());
            return this;
        }

        @java.lang.Override
        @JsonSetter("acs_entrance_id")
        public _FinalStage acsEntranceId(String acsEntranceId) {
            this.acsEntranceId = acsEntranceId;
            return this;
        }

        @java.lang.Override
        public _FinalStage includeIf(List<String> includeIf) {
            this.includeIf = Optional.of(includeIf);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "include_if", nulls = Nulls.SKIP)
        public _FinalStage includeIf(Optional<List<String>> includeIf) {
            this.includeIf = includeIf;
            return this;
        }

        @java.lang.Override
        public EntrancesListCredentialsWithAccessRequest build() {
            return new EntrancesListCredentialsWithAccessRequest(acsEntranceId, includeIf, additionalProperties);
        }
    }
}
