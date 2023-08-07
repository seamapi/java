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
@JsonDeserialize(builder = DevicesListDeviceProvidersResponse.Builder.class)
public final class DevicesListDeviceProvidersResponse {
    private final List<DevicesListDeviceProvidersResponseDeviceProvidersItem> deviceProviders;

    private final boolean ok;

    private DevicesListDeviceProvidersResponse(
            List<DevicesListDeviceProvidersResponseDeviceProvidersItem> deviceProviders, boolean ok) {
        this.deviceProviders = deviceProviders;
        this.ok = ok;
    }

    @JsonProperty("device_providers")
    public List<DevicesListDeviceProvidersResponseDeviceProvidersItem> getDeviceProviders() {
        return deviceProviders;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesListDeviceProvidersResponse
                && equalTo((DevicesListDeviceProvidersResponse) other);
    }

    private boolean equalTo(DevicesListDeviceProvidersResponse other) {
        return deviceProviders.equals(other.deviceProviders) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceProviders, this.ok);
    }

    @Override
    public String toString() {
        return "DevicesListDeviceProvidersResponse{" + "deviceProviders: " + deviceProviders + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(DevicesListDeviceProvidersResponse other);
    }

    public interface _FinalStage {
        DevicesListDeviceProvidersResponse build();

        _FinalStage deviceProviders(List<DevicesListDeviceProvidersResponseDeviceProvidersItem> deviceProviders);

        _FinalStage addDeviceProviders(DevicesListDeviceProvidersResponseDeviceProvidersItem deviceProviders);

        _FinalStage addAllDeviceProviders(List<DevicesListDeviceProvidersResponseDeviceProvidersItem> deviceProviders);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<DevicesListDeviceProvidersResponseDeviceProvidersItem> deviceProviders = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(DevicesListDeviceProvidersResponse other) {
            deviceProviders(other.getDeviceProviders());
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
        public _FinalStage addAllDeviceProviders(
                List<DevicesListDeviceProvidersResponseDeviceProvidersItem> deviceProviders) {
            this.deviceProviders.addAll(deviceProviders);
            return this;
        }

        @Override
        public _FinalStage addDeviceProviders(DevicesListDeviceProvidersResponseDeviceProvidersItem deviceProviders) {
            this.deviceProviders.add(deviceProviders);
            return this;
        }

        @Override
        @JsonSetter(value = "device_providers", nulls = Nulls.SKIP)
        public _FinalStage deviceProviders(
                List<DevicesListDeviceProvidersResponseDeviceProvidersItem> deviceProviders) {
            this.deviceProviders.clear();
            this.deviceProviders.addAll(deviceProviders);
            return this;
        }

        @Override
        public DevicesListDeviceProvidersResponse build() {
            return new DevicesListDeviceProvidersResponse(deviceProviders, ok);
        }
    }
}