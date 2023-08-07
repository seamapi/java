package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DeviceProperties.Builder.class)
public final class DeviceProperties {
    private final boolean online;

    private final String name;

    private final DevicePropertiesModel model;

    private DeviceProperties(boolean online, String name, DevicePropertiesModel model) {
        this.online = online;
        this.name = name;
        this.model = model;
    }

    @JsonProperty("online")
    public boolean getOnline() {
        return online;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("model")
    public DevicePropertiesModel getModel() {
        return model;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeviceProperties && equalTo((DeviceProperties) other);
    }

    private boolean equalTo(DeviceProperties other) {
        return online == other.online && name.equals(other.name) && model.equals(other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.online, this.name, this.model);
    }

    @Override
    public String toString() {
        return "DeviceProperties{" + "online: " + online + ", name: " + name + ", model: " + model + "}";
    }

    public static OnlineStage builder() {
        return new Builder();
    }

    public interface OnlineStage {
        NameStage online(boolean online);

        Builder from(DeviceProperties other);
    }

    public interface NameStage {
        ModelStage name(String name);
    }

    public interface ModelStage {
        _FinalStage model(DevicePropertiesModel model);
    }

    public interface _FinalStage {
        DeviceProperties build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OnlineStage, NameStage, ModelStage, _FinalStage {
        private boolean online;

        private String name;

        private DevicePropertiesModel model;

        private Builder() {}

        @Override
        public Builder from(DeviceProperties other) {
            online(other.getOnline());
            name(other.getName());
            model(other.getModel());
            return this;
        }

        @Override
        @JsonSetter("online")
        public NameStage online(boolean online) {
            this.online = online;
            return this;
        }

        @Override
        @JsonSetter("name")
        public ModelStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("model")
        public _FinalStage model(DevicePropertiesModel model) {
            this.model = model;
            return this;
        }

        @Override
        public DeviceProperties build() {
            return new DeviceProperties(online, name, model);
        }
    }
}
