package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectWebviewsCreateRequestDeviceSelectionMode {
    NONE("none"),

    SINGLE("single"),

    MULTIPLE("multiple");

    private final String value;

    ConnectWebviewsCreateRequestDeviceSelectionMode(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
