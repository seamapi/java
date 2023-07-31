package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ServiceHealthStatus {
    HEALTHY("healthy"),

    DEGRADED("degraded"),

    DOWN("down");

    private final String value;

    ServiceHealthStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
