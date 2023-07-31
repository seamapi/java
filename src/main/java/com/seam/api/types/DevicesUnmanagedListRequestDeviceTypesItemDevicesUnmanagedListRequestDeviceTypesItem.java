package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem {
    ECOBEE_THERMOSTAT("ecobee_thermostat"),

    NEST_THERMOSTAT("nest_thermostat");

    private final String value;

    DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
