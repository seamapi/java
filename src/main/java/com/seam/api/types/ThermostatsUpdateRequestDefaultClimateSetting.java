package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ThermostatsUpdateRequestDefaultClimateSetting.Builder.class)
public final class ThermostatsUpdateRequestDefaultClimateSetting {
    private final Optional<Boolean> automaticHeatingEnabled;

    private final Optional<Boolean> automaticCoolingEnabled;

    private final Optional<ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting> hvacModeSetting;

    private final Optional<Double> coolingSetPointCelsius;

    private final Optional<Double> heatingSetPointCelsius;

    private final Optional<Double> coolingSetPointFahrenheit;

    private final Optional<Double> heatingSetPointFahrenheit;

    private final Optional<Boolean> manualOverrideAllowed;

    private ThermostatsUpdateRequestDefaultClimateSetting(
            Optional<Boolean> automaticHeatingEnabled,
            Optional<Boolean> automaticCoolingEnabled,
            Optional<ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting> hvacModeSetting,
            Optional<Double> coolingSetPointCelsius,
            Optional<Double> heatingSetPointCelsius,
            Optional<Double> coolingSetPointFahrenheit,
            Optional<Double> heatingSetPointFahrenheit,
            Optional<Boolean> manualOverrideAllowed) {
        this.automaticHeatingEnabled = automaticHeatingEnabled;
        this.automaticCoolingEnabled = automaticCoolingEnabled;
        this.hvacModeSetting = hvacModeSetting;
        this.coolingSetPointCelsius = coolingSetPointCelsius;
        this.heatingSetPointCelsius = heatingSetPointCelsius;
        this.coolingSetPointFahrenheit = coolingSetPointFahrenheit;
        this.heatingSetPointFahrenheit = heatingSetPointFahrenheit;
        this.manualOverrideAllowed = manualOverrideAllowed;
    }

    @JsonProperty("automatic_heating_enabled")
    public Optional<Boolean> getAutomaticHeatingEnabled() {
        return automaticHeatingEnabled;
    }

    @JsonProperty("automatic_cooling_enabled")
    public Optional<Boolean> getAutomaticCoolingEnabled() {
        return automaticCoolingEnabled;
    }

    @JsonProperty("hvac_mode_setting")
    public Optional<ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting> getHvacModeSetting() {
        return hvacModeSetting;
    }

    @JsonProperty("cooling_set_point_celsius")
    public Optional<Double> getCoolingSetPointCelsius() {
        return coolingSetPointCelsius;
    }

    @JsonProperty("heating_set_point_celsius")
    public Optional<Double> getHeatingSetPointCelsius() {
        return heatingSetPointCelsius;
    }

    @JsonProperty("cooling_set_point_fahrenheit")
    public Optional<Double> getCoolingSetPointFahrenheit() {
        return coolingSetPointFahrenheit;
    }

    @JsonProperty("heating_set_point_fahrenheit")
    public Optional<Double> getHeatingSetPointFahrenheit() {
        return heatingSetPointFahrenheit;
    }

    @JsonProperty("manual_override_allowed")
    public Optional<Boolean> getManualOverrideAllowed() {
        return manualOverrideAllowed;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsUpdateRequestDefaultClimateSetting
                && equalTo((ThermostatsUpdateRequestDefaultClimateSetting) other);
    }

    private boolean equalTo(ThermostatsUpdateRequestDefaultClimateSetting other) {
        return automaticHeatingEnabled.equals(other.automaticHeatingEnabled)
                && automaticCoolingEnabled.equals(other.automaticCoolingEnabled)
                && hvacModeSetting.equals(other.hvacModeSetting)
                && coolingSetPointCelsius.equals(other.coolingSetPointCelsius)
                && heatingSetPointCelsius.equals(other.heatingSetPointCelsius)
                && coolingSetPointFahrenheit.equals(other.coolingSetPointFahrenheit)
                && heatingSetPointFahrenheit.equals(other.heatingSetPointFahrenheit)
                && manualOverrideAllowed.equals(other.manualOverrideAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.automaticHeatingEnabled,
                this.automaticCoolingEnabled,
                this.hvacModeSetting,
                this.coolingSetPointCelsius,
                this.heatingSetPointCelsius,
                this.coolingSetPointFahrenheit,
                this.heatingSetPointFahrenheit,
                this.manualOverrideAllowed);
    }

    @Override
    public String toString() {
        return "ThermostatsUpdateRequestDefaultClimateSetting{" + "automaticHeatingEnabled: " + automaticHeatingEnabled
                + ", automaticCoolingEnabled: " + automaticCoolingEnabled + ", hvacModeSetting: " + hvacModeSetting
                + ", coolingSetPointCelsius: " + coolingSetPointCelsius + ", heatingSetPointCelsius: "
                + heatingSetPointCelsius + ", coolingSetPointFahrenheit: " + coolingSetPointFahrenheit
                + ", heatingSetPointFahrenheit: " + heatingSetPointFahrenheit + ", manualOverrideAllowed: "
                + manualOverrideAllowed + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Boolean> automaticHeatingEnabled = Optional.empty();

        private Optional<Boolean> automaticCoolingEnabled = Optional.empty();

        private Optional<ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting> hvacModeSetting =
                Optional.empty();

        private Optional<Double> coolingSetPointCelsius = Optional.empty();

        private Optional<Double> heatingSetPointCelsius = Optional.empty();

        private Optional<Double> coolingSetPointFahrenheit = Optional.empty();

        private Optional<Double> heatingSetPointFahrenheit = Optional.empty();

        private Optional<Boolean> manualOverrideAllowed = Optional.empty();

        private Builder() {}

        public Builder from(ThermostatsUpdateRequestDefaultClimateSetting other) {
            automaticHeatingEnabled(other.getAutomaticHeatingEnabled());
            automaticCoolingEnabled(other.getAutomaticCoolingEnabled());
            hvacModeSetting(other.getHvacModeSetting());
            coolingSetPointCelsius(other.getCoolingSetPointCelsius());
            heatingSetPointCelsius(other.getHeatingSetPointCelsius());
            coolingSetPointFahrenheit(other.getCoolingSetPointFahrenheit());
            heatingSetPointFahrenheit(other.getHeatingSetPointFahrenheit());
            manualOverrideAllowed(other.getManualOverrideAllowed());
            return this;
        }

        @JsonSetter(value = "automatic_heating_enabled", nulls = Nulls.SKIP)
        public Builder automaticHeatingEnabled(Optional<Boolean> automaticHeatingEnabled) {
            this.automaticHeatingEnabled = automaticHeatingEnabled;
            return this;
        }

        public Builder automaticHeatingEnabled(Boolean automaticHeatingEnabled) {
            this.automaticHeatingEnabled = Optional.of(automaticHeatingEnabled);
            return this;
        }

        @JsonSetter(value = "automatic_cooling_enabled", nulls = Nulls.SKIP)
        public Builder automaticCoolingEnabled(Optional<Boolean> automaticCoolingEnabled) {
            this.automaticCoolingEnabled = automaticCoolingEnabled;
            return this;
        }

        public Builder automaticCoolingEnabled(Boolean automaticCoolingEnabled) {
            this.automaticCoolingEnabled = Optional.of(automaticCoolingEnabled);
            return this;
        }

        @JsonSetter(value = "hvac_mode_setting", nulls = Nulls.SKIP)
        public Builder hvacModeSetting(
                Optional<ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting> hvacModeSetting) {
            this.hvacModeSetting = hvacModeSetting;
            return this;
        }

        public Builder hvacModeSetting(ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting hvacModeSetting) {
            this.hvacModeSetting = Optional.of(hvacModeSetting);
            return this;
        }

        @JsonSetter(value = "cooling_set_point_celsius", nulls = Nulls.SKIP)
        public Builder coolingSetPointCelsius(Optional<Double> coolingSetPointCelsius) {
            this.coolingSetPointCelsius = coolingSetPointCelsius;
            return this;
        }

        public Builder coolingSetPointCelsius(Double coolingSetPointCelsius) {
            this.coolingSetPointCelsius = Optional.of(coolingSetPointCelsius);
            return this;
        }

        @JsonSetter(value = "heating_set_point_celsius", nulls = Nulls.SKIP)
        public Builder heatingSetPointCelsius(Optional<Double> heatingSetPointCelsius) {
            this.heatingSetPointCelsius = heatingSetPointCelsius;
            return this;
        }

        public Builder heatingSetPointCelsius(Double heatingSetPointCelsius) {
            this.heatingSetPointCelsius = Optional.of(heatingSetPointCelsius);
            return this;
        }

        @JsonSetter(value = "cooling_set_point_fahrenheit", nulls = Nulls.SKIP)
        public Builder coolingSetPointFahrenheit(Optional<Double> coolingSetPointFahrenheit) {
            this.coolingSetPointFahrenheit = coolingSetPointFahrenheit;
            return this;
        }

        public Builder coolingSetPointFahrenheit(Double coolingSetPointFahrenheit) {
            this.coolingSetPointFahrenheit = Optional.of(coolingSetPointFahrenheit);
            return this;
        }

        @JsonSetter(value = "heating_set_point_fahrenheit", nulls = Nulls.SKIP)
        public Builder heatingSetPointFahrenheit(Optional<Double> heatingSetPointFahrenheit) {
            this.heatingSetPointFahrenheit = heatingSetPointFahrenheit;
            return this;
        }

        public Builder heatingSetPointFahrenheit(Double heatingSetPointFahrenheit) {
            this.heatingSetPointFahrenheit = Optional.of(heatingSetPointFahrenheit);
            return this;
        }

        @JsonSetter(value = "manual_override_allowed", nulls = Nulls.SKIP)
        public Builder manualOverrideAllowed(Optional<Boolean> manualOverrideAllowed) {
            this.manualOverrideAllowed = manualOverrideAllowed;
            return this;
        }

        public Builder manualOverrideAllowed(Boolean manualOverrideAllowed) {
            this.manualOverrideAllowed = Optional.of(manualOverrideAllowed);
            return this;
        }

        public ThermostatsUpdateRequestDefaultClimateSetting build() {
            return new ThermostatsUpdateRequestDefaultClimateSetting(
                    automaticHeatingEnabled,
                    automaticCoolingEnabled,
                    hvacModeSetting,
                    coolingSetPointCelsius,
                    heatingSetPointCelsius,
                    coolingSetPointFahrenheit,
                    heatingSetPointFahrenheit,
                    manualOverrideAllowed);
        }
    }
}
