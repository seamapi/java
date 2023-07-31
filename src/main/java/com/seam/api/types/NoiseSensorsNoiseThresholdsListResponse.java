package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = NoiseSensorsNoiseThresholdsListResponse.Builder.class)
public final class NoiseSensorsNoiseThresholdsListResponse {
    private final List<NoiseThreshold> noiseThresholds;

    private final boolean ok;

    private NoiseSensorsNoiseThresholdsListResponse(List<NoiseThreshold> noiseThresholds, boolean ok) {
        this.noiseThresholds = noiseThresholds;
        this.ok = ok;
    }

    @JsonProperty("noise_thresholds")
    public List<NoiseThreshold> getNoiseThresholds() {
        return noiseThresholds;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseSensorsNoiseThresholdsListResponse
                && equalTo((NoiseSensorsNoiseThresholdsListResponse) other);
    }

    private boolean equalTo(NoiseSensorsNoiseThresholdsListResponse other) {
        return noiseThresholds.equals(other.noiseThresholds) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.noiseThresholds, this.ok);
    }

    @Override
    public String toString() {
        return "NoiseSensorsNoiseThresholdsListResponse{" + "noiseThresholds: " + noiseThresholds + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(NoiseSensorsNoiseThresholdsListResponse other);
    }

    public interface _FinalStage {
        NoiseSensorsNoiseThresholdsListResponse build();

        _FinalStage noiseThresholds(List<NoiseThreshold> noiseThresholds);

        _FinalStage addNoiseThresholds(NoiseThreshold noiseThresholds);

        _FinalStage addAllNoiseThresholds(List<NoiseThreshold> noiseThresholds);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<NoiseThreshold> noiseThresholds = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(NoiseSensorsNoiseThresholdsListResponse other) {
            noiseThresholds(other.getNoiseThresholds());
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
        public _FinalStage addAllNoiseThresholds(List<NoiseThreshold> noiseThresholds) {
            this.noiseThresholds.addAll(noiseThresholds);
            return this;
        }

        @Override
        public _FinalStage addNoiseThresholds(NoiseThreshold noiseThresholds) {
            this.noiseThresholds.add(noiseThresholds);
            return this;
        }

        @Override
        @JsonSetter(value = "noise_thresholds", nulls = Nulls.SKIP)
        public _FinalStage noiseThresholds(List<NoiseThreshold> noiseThresholds) {
            this.noiseThresholds.clear();
            this.noiseThresholds.addAll(noiseThresholds);
            return this;
        }

        @Override
        public NoiseSensorsNoiseThresholdsListResponse build() {
            return new NoiseSensorsNoiseThresholdsListResponse(noiseThresholds, ok);
        }
    }
}
