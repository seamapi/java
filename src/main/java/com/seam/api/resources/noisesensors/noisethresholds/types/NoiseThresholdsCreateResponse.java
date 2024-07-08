/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.noisesensors.noisethresholds.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.ActionAttempt;
import com.seam.api.types.NoiseThreshold;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NoiseThresholdsCreateResponse.Builder.class)
public final class NoiseThresholdsCreateResponse {
    private final ActionAttempt actionAttempt;

    private final NoiseThreshold noiseThreshold;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private NoiseThresholdsCreateResponse(
            ActionAttempt actionAttempt,
            NoiseThreshold noiseThreshold,
            boolean ok,
            Map<String, Object> additionalProperties) {
        this.actionAttempt = actionAttempt;
        this.noiseThreshold = noiseThreshold;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("action_attempt")
    public ActionAttempt getActionAttempt() {
        return actionAttempt;
    }

    @JsonProperty("noise_threshold")
    public NoiseThreshold getNoiseThreshold() {
        return noiseThreshold;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseThresholdsCreateResponse && equalTo((NoiseThresholdsCreateResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NoiseThresholdsCreateResponse other) {
        return actionAttempt.equals(other.actionAttempt)
                && noiseThreshold.equals(other.noiseThreshold)
                && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.actionAttempt, this.noiseThreshold, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActionAttemptStage builder() {
        return new Builder();
    }

    public interface ActionAttemptStage {
        NoiseThresholdStage actionAttempt(ActionAttempt actionAttempt);

        Builder from(NoiseThresholdsCreateResponse other);
    }

    public interface NoiseThresholdStage {
        OkStage noiseThreshold(NoiseThreshold noiseThreshold);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        NoiseThresholdsCreateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptStage, NoiseThresholdStage, OkStage, _FinalStage {
        private ActionAttempt actionAttempt;

        private NoiseThreshold noiseThreshold;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NoiseThresholdsCreateResponse other) {
            actionAttempt(other.getActionAttempt());
            noiseThreshold(other.getNoiseThreshold());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("action_attempt")
        public NoiseThresholdStage actionAttempt(ActionAttempt actionAttempt) {
            this.actionAttempt = actionAttempt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("noise_threshold")
        public OkStage noiseThreshold(NoiseThreshold noiseThreshold) {
            this.noiseThreshold = noiseThreshold;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public NoiseThresholdsCreateResponse build() {
            return new NoiseThresholdsCreateResponse(actionAttempt, noiseThreshold, ok, additionalProperties);
        }
    }
}
