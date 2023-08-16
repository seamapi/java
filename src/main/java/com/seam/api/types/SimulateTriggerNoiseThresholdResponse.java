package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SimulateTriggerNoiseThresholdResponse.Builder.class)
public final class SimulateTriggerNoiseThresholdResponse {
    private final boolean ok;

    private SimulateTriggerNoiseThresholdResponse(boolean ok) {
        this.ok = ok;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SimulateTriggerNoiseThresholdResponse
                && equalTo((SimulateTriggerNoiseThresholdResponse) other);
    }

    private boolean equalTo(SimulateTriggerNoiseThresholdResponse other) {
        return ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok);
    }

    @Override
    public String toString() {
        return "SimulateTriggerNoiseThresholdResponse{" + "ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(SimulateTriggerNoiseThresholdResponse other);
    }

    public interface _FinalStage {
        SimulateTriggerNoiseThresholdResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(SimulateTriggerNoiseThresholdResponse other) {
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
        public SimulateTriggerNoiseThresholdResponse build() {
            return new SimulateTriggerNoiseThresholdResponse(ok);
        }
    }
}
