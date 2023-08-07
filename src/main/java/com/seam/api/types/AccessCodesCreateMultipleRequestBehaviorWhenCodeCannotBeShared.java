package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared {
    THROW("throw"),

    CREATE_RANDOM_CODE("create_random_code");

    private final String value;

    AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}