/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MaxTimeRounding {
    ONE_HOUR("1hour"),

    ONE_DAY("1day"),

    ONE_H("1h"),

    ONE_D("1d");

    private final String value;

    MaxTimeRounding(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
