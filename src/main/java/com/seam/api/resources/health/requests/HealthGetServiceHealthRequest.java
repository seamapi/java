package com.seam.api.resources.health.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = HealthGetServiceHealthRequest.Builder.class)
public final class HealthGetServiceHealthRequest {
    private final String service;

    private HealthGetServiceHealthRequest(String service) {
        this.service = service;
    }

    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HealthGetServiceHealthRequest && equalTo((HealthGetServiceHealthRequest) other);
    }

    private boolean equalTo(HealthGetServiceHealthRequest other) {
        return service.equals(other.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.service);
    }

    @Override
    public String toString() {
        return "HealthGetServiceHealthRequest{" + "service: " + service + "}";
    }

    public static ServiceStage builder() {
        return new Builder();
    }

    public interface ServiceStage {
        _FinalStage service(String service);

        Builder from(HealthGetServiceHealthRequest other);
    }

    public interface _FinalStage {
        HealthGetServiceHealthRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ServiceStage, _FinalStage {
        private String service;

        private Builder() {}

        @Override
        public Builder from(HealthGetServiceHealthRequest other) {
            service(other.getService());
            return this;
        }

        @Override
        @JsonSetter("service")
        public _FinalStage service(String service) {
            this.service = service;
            return this;
        }

        @Override
        public HealthGetServiceHealthRequest build() {
            return new HealthGetServiceHealthRequest(service);
        }
    }
}
