/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PhoneDeviceType {
    ANDROID_PHONE("android_phone"),

    IOS_PHONE("ios_phone");

    private final String value;

    PhoneDeviceType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
