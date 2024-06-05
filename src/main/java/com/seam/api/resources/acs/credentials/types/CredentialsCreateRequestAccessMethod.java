/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.credentials.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CredentialsCreateRequestAccessMethod {
    CODE("code"),

    CARD("card"),

    MOBILE_KEY("mobile_key");

    private final String value;

    CredentialsCreateRequestAccessMethod(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
