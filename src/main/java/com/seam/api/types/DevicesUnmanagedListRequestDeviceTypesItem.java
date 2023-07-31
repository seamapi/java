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

@JsonDeserialize(using = DevicesUnmanagedListRequestDeviceTypesItem.Deserializer.class)
public final class DevicesUnmanagedListRequestDeviceTypesItem {
    private final Object value;

    private final int type;

    private DevicesUnmanagedListRequestDeviceTypesItem(Object value, int type) {
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
                    (DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem) this.value);
        } else if (this.type == 1) {
            return visitor.visit(
                    (DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem) this.value);
        } else if (this.type == 2) {
            return visitor.visit(
                    (DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUnmanagedListRequestDeviceTypesItem
                && equalTo((DevicesUnmanagedListRequestDeviceTypesItem) other);
    }

    private boolean equalTo(DevicesUnmanagedListRequestDeviceTypesItem other) {
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

    public static DevicesUnmanagedListRequestDeviceTypesItem of(
            DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem value) {
        return new DevicesUnmanagedListRequestDeviceTypesItem(value, 0);
    }

    public static DevicesUnmanagedListRequestDeviceTypesItem of(
            DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem value) {
        return new DevicesUnmanagedListRequestDeviceTypesItem(value, 1);
    }

    public static DevicesUnmanagedListRequestDeviceTypesItem of(
            DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem value) {
        return new DevicesUnmanagedListRequestDeviceTypesItem(value, 2);
    }

    public interface Visitor<T> {
        T visit(DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem value);

        T visit(DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem value);

        T visit(DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem value);
    }

    static final class Deserializer extends StdDeserializer<DevicesUnmanagedListRequestDeviceTypesItem> {
        Deserializer() {
            super(DevicesUnmanagedListRequestDeviceTypesItem.class);
        }

        @Override
        public DevicesUnmanagedListRequestDeviceTypesItem deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value,
                        DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value,
                        DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value,
                        DevicesUnmanagedListRequestDeviceTypesItemDevicesUnmanagedListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
