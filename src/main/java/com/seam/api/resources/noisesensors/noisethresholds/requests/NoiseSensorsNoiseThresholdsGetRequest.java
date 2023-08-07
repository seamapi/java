package com.seam.api.resources.noisesensors.noisethresholds.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NoiseSensorsNoiseThresholdsGetRequest.Builder.class)
public final class NoiseSensorsNoiseThresholdsGetRequest {
    private final String noiseThresholdId;

    private NoiseSensorsNoiseThresholdsGetRequest(String noiseThresholdId) {
        this.noiseThresholdId = noiseThresholdId;
    }

    @JsonProperty("noise_threshold_id")
    public String getNoiseThresholdId() {
        return noiseThresholdId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseSensorsNoiseThresholdsGetRequest
                && equalTo((NoiseSensorsNoiseThresholdsGetRequest) other);
    }

    private boolean equalTo(NoiseSensorsNoiseThresholdsGetRequest other) {
        return noiseThresholdId.equals(other.noiseThresholdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.noiseThresholdId);
    }

    @Override
    public String toString() {
        return "NoiseSensorsNoiseThresholdsGetRequest{" + "noiseThresholdId: " + noiseThresholdId + "}";
    }

    public static NoiseThresholdIdStage builder() {
        return new Builder();
    }

    public interface NoiseThresholdIdStage {
        _FinalStage noiseThresholdId(String noiseThresholdId);

        Builder from(NoiseSensorsNoiseThresholdsGetRequest other);
    }

    public interface _FinalStage {
        NoiseSensorsNoiseThresholdsGetRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NoiseThresholdIdStage, _FinalStage {
        private String noiseThresholdId;

        private Builder() {}

        @Override
        public Builder from(NoiseSensorsNoiseThresholdsGetRequest other) {
            noiseThresholdId(other.getNoiseThresholdId());
            return this;
        }

        @Override
        @JsonSetter("noise_threshold_id")
        public _FinalStage noiseThresholdId(String noiseThresholdId) {
            this.noiseThresholdId = noiseThresholdId;
            return this;
        }

        @Override
        public NoiseSensorsNoiseThresholdsGetRequest build() {
            return new NoiseSensorsNoiseThresholdsGetRequest(noiseThresholdId);
        }
    }
}
