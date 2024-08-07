/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.thermostats.types;

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
@JsonDeserialize(builder = ThermostatsUpdateResponse.Builder.class)
public final class ThermostatsUpdateResponse {
    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private ThermostatsUpdateResponse(boolean ok, Map<String, Object> additionalProperties) {
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsUpdateResponse && equalTo((ThermostatsUpdateResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ThermostatsUpdateResponse other) {
        return ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ok);
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

        Builder from(ThermostatsUpdateResponse other);
    }

    public interface _FinalStage {
        ThermostatsUpdateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ThermostatsUpdateResponse other) {
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
        public ThermostatsUpdateResponse build() {
            return new ThermostatsUpdateResponse(ok, additionalProperties);
        }
    }
}
