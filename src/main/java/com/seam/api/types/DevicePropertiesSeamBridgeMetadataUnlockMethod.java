/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DevicePropertiesSeamBridgeMetadataUnlockMethod {
    BRIDGE("bridge"),

    DOORKING("doorking");

    private final String value;

    DevicePropertiesSeamBridgeMetadataUnlockMethod(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
