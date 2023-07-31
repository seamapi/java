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

@JsonDeserialize(using = DeviceDeviceType.Deserializer.class)
public final class DeviceDeviceType {
    private final Object value;

    private final int type;

    private DeviceDeviceType(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((DeviceDeviceTypeDeviceDeviceType) this.value);
        } else if (this.type == 1) {
            return visitor.visit((DeviceDeviceTypeDeviceDeviceType) this.value);
        } else if (this.type == 2) {
            return visitor.visit((DeviceDeviceTypeDeviceDeviceType) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeviceDeviceType && equalTo((DeviceDeviceType) other);
    }

    private boolean equalTo(DeviceDeviceType other) {
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

    public static DeviceDeviceType of(DeviceDeviceTypeDeviceDeviceType value) {
        return new DeviceDeviceType(value, 0);
    }

    public static DeviceDeviceType of(DeviceDeviceTypeDeviceDeviceType value) {
        return new DeviceDeviceType(value, 1);
    }

    public static DeviceDeviceType of(DeviceDeviceTypeDeviceDeviceType value) {
        return new DeviceDeviceType(value, 2);
    }

    public interface Visitor<T> {
        T visit(DeviceDeviceTypeDeviceDeviceType value);

        T visit(DeviceDeviceTypeDeviceDeviceType value);

        T visit(DeviceDeviceTypeDeviceDeviceType value);
    }

    static final class Deserializer extends StdDeserializer<DeviceDeviceType> {
        Deserializer() {
            super(DeviceDeviceType.class);
        }

        @Override
        public DeviceDeviceType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, DeviceDeviceTypeDeviceDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, DeviceDeviceTypeDeviceDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, DeviceDeviceTypeDeviceDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
