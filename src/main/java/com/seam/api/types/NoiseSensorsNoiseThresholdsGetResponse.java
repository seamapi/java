package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NoiseSensorsNoiseThresholdsGetResponse.Builder.class)
public final class NoiseSensorsNoiseThresholdsGetResponse {
    private final NoiseThreshold noiseThreshold;

    private final boolean ok;

    private NoiseSensorsNoiseThresholdsGetResponse(NoiseThreshold noiseThreshold, boolean ok) {
        this.noiseThreshold = noiseThreshold;
        this.ok = ok;
    }

    @JsonProperty("noise_threshold")
    public NoiseThreshold getNoiseThreshold() {
        return noiseThreshold;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseSensorsNoiseThresholdsGetResponse
                && equalTo((NoiseSensorsNoiseThresholdsGetResponse) other);
    }

    private boolean equalTo(NoiseSensorsNoiseThresholdsGetResponse other) {
        return noiseThreshold.equals(other.noiseThreshold) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.noiseThreshold, this.ok);
    }

    @Override
    public String toString() {
        return "NoiseSensorsNoiseThresholdsGetResponse{" + "noiseThreshold: " + noiseThreshold + ", ok: " + ok + "}";
    }

    public static NoiseThresholdStage builder() {
        return new Builder();
    }

    public interface NoiseThresholdStage {
        OkStage noiseThreshold(NoiseThreshold noiseThreshold);

        Builder from(NoiseSensorsNoiseThresholdsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        NoiseSensorsNoiseThresholdsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NoiseThresholdStage, OkStage, _FinalStage {
        private NoiseThreshold noiseThreshold;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(NoiseSensorsNoiseThresholdsGetResponse other) {
            noiseThreshold(other.getNoiseThreshold());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("noise_threshold")
        public OkStage noiseThreshold(NoiseThreshold noiseThreshold) {
            this.noiseThreshold = noiseThreshold;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public NoiseSensorsNoiseThresholdsGetResponse build() {
            return new NoiseSensorsNoiseThresholdsGetResponse(noiseThreshold, ok);
        }
    }
}
