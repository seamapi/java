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

@JsonDeserialize(using = ThermostatsListRequestDeviceTypesItem.Deserializer.class)
public final class ThermostatsListRequestDeviceTypesItem {
    private final Object value;

    private final int type;

    private ThermostatsListRequestDeviceTypesItem(Object value, int type) {
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
                    (ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem) this.value);
        } else if (this.type == 1) {
            return visitor.visit(
                    (ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem) this.value);
        } else if (this.type == 2) {
            return visitor.visit(
                    (ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsListRequestDeviceTypesItem
                && equalTo((ThermostatsListRequestDeviceTypesItem) other);
    }

    private boolean equalTo(ThermostatsListRequestDeviceTypesItem other) {
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

    public static ThermostatsListRequestDeviceTypesItem of(
            ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem value) {
        return new ThermostatsListRequestDeviceTypesItem(value, 0);
    }

    public static ThermostatsListRequestDeviceTypesItem of(
            ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem value) {
        return new ThermostatsListRequestDeviceTypesItem(value, 1);
    }

    public static ThermostatsListRequestDeviceTypesItem of(
            ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem value) {
        return new ThermostatsListRequestDeviceTypesItem(value, 2);
    }

    public interface Visitor<T> {
        T visit(ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem value);

        T visit(ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem value);

        T visit(ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem value);
    }

    static final class Deserializer extends StdDeserializer<ThermostatsListRequestDeviceTypesItem> {
        Deserializer() {
            super(ThermostatsListRequestDeviceTypesItem.class);
        }

        @Override
        public ThermostatsListRequestDeviceTypesItem deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, ThermostatsListRequestDeviceTypesItemThermostatsListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
