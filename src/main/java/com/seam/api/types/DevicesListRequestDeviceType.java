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

@JsonDeserialize(using = DevicesListRequestDeviceType.Deserializer.class)
public final class DevicesListRequestDeviceType {
    private final Object value;

    private final int type;

    private DevicesListRequestDeviceType(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((DevicesListRequestDeviceTypeDevicesListRequestDeviceType) this.value);
        } else if (this.type == 1) {
            return visitor.visit((DevicesListRequestDeviceTypeDevicesListRequestDeviceType) this.value);
        } else if (this.type == 2) {
            return visitor.visit((DevicesListRequestDeviceTypeDevicesListRequestDeviceType) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesListRequestDeviceType && equalTo((DevicesListRequestDeviceType) other);
    }

    private boolean equalTo(DevicesListRequestDeviceType other) {
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

    public static DevicesListRequestDeviceType of(DevicesListRequestDeviceTypeDevicesListRequestDeviceType value) {
        return new DevicesListRequestDeviceType(value, 0);
    }

    public static DevicesListRequestDeviceType of(DevicesListRequestDeviceTypeDevicesListRequestDeviceType value) {
        return new DevicesListRequestDeviceType(value, 1);
    }

    public static DevicesListRequestDeviceType of(DevicesListRequestDeviceTypeDevicesListRequestDeviceType value) {
        return new DevicesListRequestDeviceType(value, 2);
    }

    public interface Visitor<T> {
        T visit(DevicesListRequestDeviceTypeDevicesListRequestDeviceType value);

        T visit(DevicesListRequestDeviceTypeDevicesListRequestDeviceType value);

        T visit(DevicesListRequestDeviceTypeDevicesListRequestDeviceType value);
    }

    static final class Deserializer extends StdDeserializer<DevicesListRequestDeviceType> {
        Deserializer() {
            super(DevicesListRequestDeviceType.class);
        }

        @Override
        public DevicesListRequestDeviceType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesListRequestDeviceTypeDevicesListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesListRequestDeviceTypeDevicesListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesListRequestDeviceTypeDevicesListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
