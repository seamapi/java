package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccessCodesUnmanagedListResponseAccessCodesItemType {
    TIME_BOUND("time_bound"),

    ONGOING("ongoing");

    private final String value;

    AccessCodesUnmanagedListResponseAccessCodesItemType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
