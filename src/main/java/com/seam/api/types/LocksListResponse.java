package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = LocksListResponse.Builder.class)
public final class LocksListResponse {
    private final Optional<Object> locks;

    private final Optional<Object> devices;

    private final boolean ok;

    private LocksListResponse(Optional<Object> locks, Optional<Object> devices, boolean ok) {
        this.locks = locks;
        this.devices = devices;
        this.ok = ok;
    }

    @JsonProperty("locks")
    public Optional<Object> getLocks() {
        return locks;
    }

    @JsonProperty("devices")
    public Optional<Object> getDevices() {
        return devices;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LocksListResponse && equalTo((LocksListResponse) other);
    }

    private boolean equalTo(LocksListResponse other) {
        return locks.equals(other.locks) && devices.equals(other.devices) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.locks, this.devices, this.ok);
    }

    @Override
    public String toString() {
        return "LocksListResponse{" + "locks: " + locks + ", devices: " + devices + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(LocksListResponse other);
    }

    public interface _FinalStage {
        LocksListResponse build();

        _FinalStage locks(Optional<Object> locks);

        _FinalStage locks(Object locks);

        _FinalStage devices(Optional<Object> devices);

        _FinalStage devices(Object devices);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Optional<Object> devices = Optional.empty();

        private Optional<Object> locks = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LocksListResponse other) {
            locks(other.getLocks());
            devices(other.getDevices());
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
        public _FinalStage devices(Object devices) {
            this.devices = Optional.of(devices);
            return this;
        }

        @Override
        @JsonSetter(value = "devices", nulls = Nulls.SKIP)
        public _FinalStage devices(Optional<Object> devices) {
            this.devices = devices;
            return this;
        }

        @Override
        public _FinalStage locks(Object locks) {
            this.locks = Optional.of(locks);
            return this;
        }

        @Override
        @JsonSetter(value = "locks", nulls = Nulls.SKIP)
        public _FinalStage locks(Optional<Object> locks) {
            this.locks = locks;
            return this;
        }

        @Override
        public LocksListResponse build() {
            return new LocksListResponse(locks, devices, ok);
        }
    }
}
