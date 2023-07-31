package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = UnmanagedDeviceProperties.Builder.class)
public final class UnmanagedDeviceProperties {
    private final String name;

    private final boolean online;

    private final Optional<String> manufacturer;

    private final Optional<String> imageUrl;

    private final Optional<String> imageAltText;

    private final UnmanagedDevicePropertiesModel model;

    private UnmanagedDeviceProperties(
            String name,
            boolean online,
            Optional<String> manufacturer,
            Optional<String> imageUrl,
            Optional<String> imageAltText,
            UnmanagedDevicePropertiesModel model) {
        this.name = name;
        this.online = online;
        this.manufacturer = manufacturer;
        this.imageUrl = imageUrl;
        this.imageAltText = imageAltText;
        this.model = model;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("online")
    public boolean getOnline() {
        return online;
    }

    @JsonProperty("manufacturer")
    public Optional<String> getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("image_url")
    public Optional<String> getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_alt_text")
    public Optional<String> getImageAltText() {
        return imageAltText;
    }

    @JsonProperty("model")
    public UnmanagedDevicePropertiesModel getModel() {
        return model;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedDeviceProperties && equalTo((UnmanagedDeviceProperties) other);
    }

    private boolean equalTo(UnmanagedDeviceProperties other) {
        return name.equals(other.name)
                && online == other.online
                && manufacturer.equals(other.manufacturer)
                && imageUrl.equals(other.imageUrl)
                && imageAltText.equals(other.imageAltText)
                && model.equals(other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.online, this.manufacturer, this.imageUrl, this.imageAltText, this.model);
    }

    @Override
    public String toString() {
        return "UnmanagedDeviceProperties{" + "name: " + name + ", online: " + online + ", manufacturer: "
                + manufacturer + ", imageUrl: " + imageUrl + ", imageAltText: " + imageAltText + ", model: " + model
                + "}";
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        OnlineStage name(String name);

        Builder from(UnmanagedDeviceProperties other);
    }

    public interface OnlineStage {
        ModelStage online(boolean online);
    }

    public interface ModelStage {
        _FinalStage model(UnmanagedDevicePropertiesModel model);
    }

    public interface _FinalStage {
        UnmanagedDeviceProperties build();

        _FinalStage manufacturer(Optional<String> manufacturer);

        _FinalStage manufacturer(String manufacturer);

        _FinalStage imageUrl(Optional<String> imageUrl);

        _FinalStage imageUrl(String imageUrl);

        _FinalStage imageAltText(Optional<String> imageAltText);

        _FinalStage imageAltText(String imageAltText);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, OnlineStage, ModelStage, _FinalStage {
        private String name;

        private boolean online;

        private UnmanagedDevicePropertiesModel model;

        private Optional<String> imageAltText = Optional.empty();

        private Optional<String> imageUrl = Optional.empty();

        private Optional<String> manufacturer = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(UnmanagedDeviceProperties other) {
            name(other.getName());
            online(other.getOnline());
            manufacturer(other.getManufacturer());
            imageUrl(other.getImageUrl());
            imageAltText(other.getImageAltText());
            model(other.getModel());
            return this;
        }

        @Override
        @JsonSetter("name")
        public OnlineStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("online")
        public ModelStage online(boolean online) {
            this.online = online;
            return this;
        }

        @Override
        @JsonSetter("model")
        public _FinalStage model(UnmanagedDevicePropertiesModel model) {
            this.model = model;
            return this;
        }

        @Override
        public _FinalStage imageAltText(String imageAltText) {
            this.imageAltText = Optional.of(imageAltText);
            return this;
        }

        @Override
        @JsonSetter(value = "image_alt_text", nulls = Nulls.SKIP)
        public _FinalStage imageAltText(Optional<String> imageAltText) {
            this.imageAltText = imageAltText;
            return this;
        }

        @Override
        public _FinalStage imageUrl(String imageUrl) {
            this.imageUrl = Optional.of(imageUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "image_url", nulls = Nulls.SKIP)
        public _FinalStage imageUrl(Optional<String> imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public _FinalStage manufacturer(String manufacturer) {
            this.manufacturer = Optional.of(manufacturer);
            return this;
        }

        @Override
        @JsonSetter(value = "manufacturer", nulls = Nulls.SKIP)
        public _FinalStage manufacturer(Optional<String> manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        @Override
        public UnmanagedDeviceProperties build() {
            return new UnmanagedDeviceProperties(name, online, manufacturer, imageUrl, imageAltText, model);
        }
    }
}
