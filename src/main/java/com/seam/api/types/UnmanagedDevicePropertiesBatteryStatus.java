/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UnmanagedDevicePropertiesBatteryStatus {
    CRITICAL("critical"),

    LOW("low"),

    GOOD("good"),

    FULL("full");

    private final String value;

    UnmanagedDevicePropertiesBatteryStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
