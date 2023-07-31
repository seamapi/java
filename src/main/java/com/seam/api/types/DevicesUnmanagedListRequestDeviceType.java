package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.seam.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = DevicesUnmanagedListRequestDeviceType.Deserializer.class)
public final class DevicesUnmanagedListRequestDeviceType {
    private final Object value;

    private final int type;

    private DevicesUnmanagedListRequestDeviceType(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit(
                    (DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType) this.value);
        } else if (this.type == 1) {
            return visitor.visit(
                    (DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType) this.value);
        } else if (this.type == 2) {
            return visitor.visit(
                    (DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUnmanagedListRequestDeviceType
                && equalTo((DevicesUnmanagedListRequestDeviceType) other);
    }

    private boolean equalTo(DevicesUnmanagedListRequestDeviceType other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public static DevicesUnmanagedListRequestDeviceType of(
            DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType value) {
        return new DevicesUnmanagedListRequestDeviceType(value, 0);
    }

    public static DevicesUnmanagedListRequestDeviceType of(
            DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType value) {
        return new DevicesUnmanagedListRequestDeviceType(value, 1);
    }

    public static DevicesUnmanagedListRequestDeviceType of(
            DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType value) {
        return new DevicesUnmanagedListRequestDeviceType(value, 2);
    }

    public interface Visitor<T> {
        T visit(DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType value);

        T visit(DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType value);

        T visit(DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType value);
    }

    static final class Deserializer extends StdDeserializer<DevicesUnmanagedListRequestDeviceType> {
        Deserializer() {
            super(DevicesUnmanagedListRequestDeviceType.class);
        }

        @Override
        public DevicesUnmanagedListRequestDeviceType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesUnmanagedListRequestDeviceTypeDevicesUnmanagedListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
