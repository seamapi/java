/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AcsCredentialExternalType {
    PTI_CARD("pti_card"),

    BRIVO_CREDENTIAL("brivo_credential"),

    HID_CREDENTIAL("hid_credential"),

    VISIONLINE_CARD("visionline_card");

    private final String value;

    AcsCredentialExternalType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
