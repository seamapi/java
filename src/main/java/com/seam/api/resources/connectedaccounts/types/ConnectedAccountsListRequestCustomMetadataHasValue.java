/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.connectedaccounts.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.seam.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = ConnectedAccountsListRequestCustomMetadataHasValue.Deserializer.class)
public final class ConnectedAccountsListRequestCustomMetadataHasValue {
    private final Object value;

    private final int type;

    private ConnectedAccountsListRequestCustomMetadataHasValue(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((String) this.value);
        } else if (this.type == 1) {
            return visitor.visit((boolean) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsListRequestCustomMetadataHasValue
                && equalTo((ConnectedAccountsListRequestCustomMetadataHasValue) other);
    }

    private boolean equalTo(ConnectedAccountsListRequestCustomMetadataHasValue other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static ConnectedAccountsListRequestCustomMetadataHasValue of(String value) {
        return new ConnectedAccountsListRequestCustomMetadataHasValue(value, 0);
    }

    public static ConnectedAccountsListRequestCustomMetadataHasValue of(boolean value) {
        return new ConnectedAccountsListRequestCustomMetadataHasValue(value, 1);
    }

    public interface Visitor<T> {
        T visit(String value);

        T visit(boolean value);
    }

    static final class Deserializer extends StdDeserializer<ConnectedAccountsListRequestCustomMetadataHasValue> {
        Deserializer() {
            super(ConnectedAccountsListRequestCustomMetadataHasValue.class);
        }

        @java.lang.Override
        public ConnectedAccountsListRequestCustomMetadataHasValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            if (value instanceof Boolean) {
                return of((Boolean) value);
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
