package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UnmanagedListResponse.Builder.class)
public final class UnmanagedListResponse {
    private final List<UnmanagedDevice> devices;

    private final boolean ok;

    private UnmanagedListResponse(List<UnmanagedDevice> devices, boolean ok) {
        this.devices = devices;
        this.ok = ok;
    }

    @JsonProperty("devices")
    public List<UnmanagedDevice> getDevices() {
        return devices;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedListResponse && equalTo((UnmanagedListResponse) other);
    }

    private boolean equalTo(UnmanagedListResponse other) {
        return devices.equals(other.devices) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.devices, this.ok);
    }

    @Override
    public String toString() {
        return "UnmanagedListResponse{" + "devices: " + devices + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(UnmanagedListResponse other);
    }

    public interface _FinalStage {
        UnmanagedListResponse build();

        _FinalStage devices(List<UnmanagedDevice> devices);

        _FinalStage addDevices(UnmanagedDevice devices);

        _FinalStage addAllDevices(List<UnmanagedDevice> devices);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<UnmanagedDevice> devices = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(UnmanagedListResponse other) {
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
        public _FinalStage addAllDevices(List<UnmanagedDevice> devices) {
            this.devices.addAll(devices);
            return this;
        }

        @Override
        public _FinalStage addDevices(UnmanagedDevice devices) {
            this.devices.add(devices);
            return this;
        }

        @Override
        @JsonSetter(value = "devices", nulls = Nulls.SKIP)
        public _FinalStage devices(List<UnmanagedDevice> devices) {
            this.devices.clear();
            this.devices.addAll(devices);
            return this;
        }

        @Override
        public UnmanagedListResponse build() {
            return new UnmanagedListResponse(devices, ok);
        }
    }
}
