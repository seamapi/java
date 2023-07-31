package com.seam.api.types;

public final class DevicesUpdateRequestLocation {
    private DevicesUpdateRequestLocation() {}

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUpdateRequestLocation;
    }

    @Override
    public String toString() {
        return "DevicesUpdateRequestLocation{" + "}";
    }
}
