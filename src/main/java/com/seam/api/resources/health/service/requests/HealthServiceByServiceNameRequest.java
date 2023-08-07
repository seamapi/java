package com.seam.api.resources.health.service.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = HealthServiceByServiceNameRequest.Builder.class)
public final class HealthServiceByServiceNameRequest {
    private final String serviceName;

    private HealthServiceByServiceNameRequest(String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonProperty("service_name")
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HealthServiceByServiceNameRequest && equalTo((HealthServiceByServiceNameRequest) other);
    }

    private boolean equalTo(HealthServiceByServiceNameRequest other) {
        return serviceName.equals(other.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.serviceName);
    }

    @Override
    public String toString() {
        return "HealthServiceByServiceNameRequest{" + "serviceName: " + serviceName + "}";
    }

    public static ServiceNameStage builder() {
        return new Builder();
    }

    public interface ServiceNameStage {
        _FinalStage serviceName(String serviceName);

        Builder from(HealthServiceByServiceNameRequest other);
    }

    public interface _FinalStage {
        HealthServiceByServiceNameRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ServiceNameStage, _FinalStage {
        private String serviceName;

        private Builder() {}

        @Override
        public Builder from(HealthServiceByServiceNameRequest other) {
            serviceName(other.getServiceName());
            return this;
        }

        @Override
        @JsonSetter("service_name")
        public _FinalStage serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public HealthServiceByServiceNameRequest build() {
            return new HealthServiceByServiceNameRequest(serviceName);
        }
    }
}
