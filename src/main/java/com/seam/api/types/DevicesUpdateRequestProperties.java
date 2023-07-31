package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = DevicesUpdateRequestProperties.Builder.class)
public final class DevicesUpdateRequestProperties {
    private final Optional<String> name;

    private DevicesUpdateRequestProperties(Optional<String> name) {
        this.name = name;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUpdateRequestProperties && equalTo((DevicesUpdateRequestProperties) other);
    }

    private boolean equalTo(DevicesUpdateRequestProperties other) {
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return "DevicesUpdateRequestProperties{" + "name: " + name + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Builder() {}

        public Builder from(DevicesUpdateRequestProperties other) {
            name(other.getName());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        public DevicesUpdateRequestProperties build() {
            return new DevicesUpdateRequestProperties(name);
        }
    }
}
