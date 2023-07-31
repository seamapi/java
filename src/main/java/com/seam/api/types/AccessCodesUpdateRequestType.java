package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccessCodesUpdateRequestType {
    ONGOING("ongoing"),

    TIME_BOUND("time_bound");

    private final String value;

    AccessCodesUpdateRequestType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
