/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.systems.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.AcsSystem;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SystemsGetResponse.Builder.class)
public final class SystemsGetResponse {
    private final AcsSystem acsSystem;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private SystemsGetResponse(AcsSystem acsSystem, boolean ok, Map<String, Object> additionalProperties) {
        this.acsSystem = acsSystem;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_system")
    public AcsSystem getAcsSystem() {
        return acsSystem;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SystemsGetResponse && equalTo((SystemsGetResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SystemsGetResponse other) {
        return acsSystem.equals(other.acsSystem) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.acsSystem, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AcsSystemStage builder() {
        return new Builder();
    }

    public interface AcsSystemStage {
        OkStage acsSystem(AcsSystem acsSystem);

        Builder from(SystemsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        SystemsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AcsSystemStage, OkStage, _FinalStage {
        private AcsSystem acsSystem;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SystemsGetResponse other) {
            acsSystem(other.getAcsSystem());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("acs_system")
        public OkStage acsSystem(AcsSystem acsSystem) {
            this.acsSystem = acsSystem;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public SystemsGetResponse build() {
            return new SystemsGetResponse(acsSystem, ok, additionalProperties);
        }
    }
}
