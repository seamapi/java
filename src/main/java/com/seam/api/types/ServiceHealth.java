package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ServiceHealth.Builder.class)
public final class ServiceHealth {
    private final String service;

    private final ServiceHealthStatus status;

    private final String description;

    private ServiceHealth(String service, ServiceHealthStatus status, String description) {
        this.service = service;
        this.status = status;
        this.description = description;
    }

    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("status")
    public ServiceHealthStatus getStatus() {
        return status;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServiceHealth && equalTo((ServiceHealth) other);
    }

    private boolean equalTo(ServiceHealth other) {
        return service.equals(other.service) && status.equals(other.status) && description.equals(other.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.service, this.status, this.description);
    }

    @Override
    public String toString() {
        return "ServiceHealth{" + "service: " + service + ", status: " + status + ", description: " + description + "}";
    }

    public static ServiceStage builder() {
        return new Builder();
    }

    public interface ServiceStage {
        StatusStage service(String service);

        Builder from(ServiceHealth other);
    }

    public interface StatusStage {
        DescriptionStage status(ServiceHealthStatus status);
    }

    public interface DescriptionStage {
        _FinalStage description(String description);
    }

    public interface _FinalStage {
        ServiceHealth build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ServiceStage, StatusStage, DescriptionStage, _FinalStage {
        private String service;

        private ServiceHealthStatus status;

        private String description;

        private Builder() {}

        @Override
        public Builder from(ServiceHealth other) {
            service(other.getService());
            status(other.getStatus());
            description(other.getDescription());
            return this;
        }

        @Override
        @JsonSetter("service")
        public StatusStage service(String service) {
            this.service = service;
            return this;
        }

        @Override
        @JsonSetter("status")
        public DescriptionStage status(ServiceHealthStatus status) {
            this.status = status;
            return this;
        }

        @Override
        @JsonSetter("description")
        public _FinalStage description(String description) {
            this.description = description;
            return this;
        }

        @Override
        public ServiceHealth build() {
            return new ServiceHealth(service, status, description);
        }
    }
}
