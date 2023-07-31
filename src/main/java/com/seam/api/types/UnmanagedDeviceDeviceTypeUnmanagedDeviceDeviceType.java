package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UnmanagedDeviceDeviceTypeUnmanagedDeviceDeviceType {
    ECOBEE_THERMOSTAT("ecobee_thermostat"),

    NEST_THERMOSTAT("nest_thermostat");

    private final String value;

    UnmanagedDeviceDeviceTypeUnmanagedDeviceDeviceType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
