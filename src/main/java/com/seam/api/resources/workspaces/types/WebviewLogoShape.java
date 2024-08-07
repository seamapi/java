/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.workspaces.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WebviewLogoShape {
    CIRCLE("circle"),

    SQUARE("square");

    private final String value;

    WebviewLogoShape(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
