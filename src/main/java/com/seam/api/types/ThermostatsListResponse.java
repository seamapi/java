package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = ThermostatsListResponse.Builder.class)
public final class ThermostatsListResponse {
    private final List<Device> thermostats;

    private final boolean ok;

    private ThermostatsListResponse(List<Device> thermostats, boolean ok) {
        this.thermostats = thermostats;
        this.ok = ok;
    }

    @JsonProperty("thermostats")
    public List<Device> getThermostats() {
        return thermostats;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsListResponse && equalTo((ThermostatsListResponse) other);
    }

    private boolean equalTo(ThermostatsListResponse other) {
        return thermostats.equals(other.thermostats) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.thermostats, this.ok);
    }

    @Override
    public String toString() {
        return "ThermostatsListResponse{" + "thermostats: " + thermostats + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ThermostatsListResponse other);
    }

    public interface _FinalStage {
        ThermostatsListResponse build();

        _FinalStage thermostats(List<Device> thermostats);

        _FinalStage addThermostats(Device thermostats);

        _FinalStage addAllThermostats(List<Device> thermostats);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<Device> thermostats = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ThermostatsListResponse other) {
            thermostats(other.getThermostats());
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
        public _FinalStage addAllThermostats(List<Device> thermostats) {
            this.thermostats.addAll(thermostats);
            return this;
        }

        @Override
        public _FinalStage addThermostats(Device thermostats) {
            this.thermostats.add(thermostats);
            return this;
        }

        @Override
        @JsonSetter(value = "thermostats", nulls = Nulls.SKIP)
        public _FinalStage thermostats(List<Device> thermostats) {
            this.thermostats.clear();
            this.thermostats.addAll(thermostats);
            return this;
        }

        @Override
        public ThermostatsListResponse build() {
            return new ThermostatsListResponse(thermostats, ok);
        }
    }
}
