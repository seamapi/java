package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.seam.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(using = ConnectedAccountCustomMetadataValue.Deserializer.class)
public final class ConnectedAccountCustomMetadataValue {
    private final Object value;

    private final int type;

    private ConnectedAccountCustomMetadataValue(Object value, int type) {
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
            return visitor.visit((double) this.value);
        } else if (this.type == 2) {
            return visitor.visit((boolean) this.value);
        } else if (this.type == 3) {
            return visitor.visit((Optional<String>) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountCustomMetadataValue
                && equalTo((ConnectedAccountCustomMetadataValue) other);
    }

    private boolean equalTo(ConnectedAccountCustomMetadataValue other) {
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

    public static ConnectedAccountCustomMetadataValue of(String value) {
        return new ConnectedAccountCustomMetadataValue(value, 0);
    }

    public static ConnectedAccountCustomMetadataValue of(double value) {
        return new ConnectedAccountCustomMetadataValue(value, 1);
    }

    public static ConnectedAccountCustomMetadataValue of(boolean value) {
        return new ConnectedAccountCustomMetadataValue(value, 2);
    }

    public static ConnectedAccountCustomMetadataValue of(Optional<String> value) {
        return new ConnectedAccountCustomMetadataValue(value, 3);
    }

    public interface Visitor<T> {
        T visit(String value);

        T visit(double value);

        T visit(boolean value);

        T visit(Optional<String> value);
    }

    static final class Deserializer extends StdDeserializer<ConnectedAccountCustomMetadataValue> {
        Deserializer() {
            super(ConnectedAccountCustomMetadataValue.class);
        }

        @Override
        public ConnectedAccountCustomMetadataValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            if (value instanceof Double) {
                return of((Double) value);
            }
            if (value instanceof Boolean) {
                return of((Boolean) value);
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<Optional<String>>() {}));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
