package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = NoiseSensorsSimulateTriggerNoiseThresholdResponse.Builder.class)
public final class NoiseSensorsSimulateTriggerNoiseThresholdResponse {
    private final boolean ok;

    private NoiseSensorsSimulateTriggerNoiseThresholdResponse(boolean ok) {
        this.ok = ok;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseSensorsSimulateTriggerNoiseThresholdResponse
                && equalTo((NoiseSensorsSimulateTriggerNoiseThresholdResponse) other);
    }

    private boolean equalTo(NoiseSensorsSimulateTriggerNoiseThresholdResponse other) {
        return ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok);
    }

    @Override
    public String toString() {
        return "NoiseSensorsSimulateTriggerNoiseThresholdResponse{" + "ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(NoiseSensorsSimulateTriggerNoiseThresholdResponse other);
    }

    public interface _FinalStage {
        NoiseSensorsSimulateTriggerNoiseThresholdResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(NoiseSensorsSimulateTriggerNoiseThresholdResponse other) {
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
        public NoiseSensorsSimulateTriggerNoiseThresholdResponse build() {
            return new NoiseSensorsSimulateTriggerNoiseThresholdResponse(ok);
        }
    }
}
