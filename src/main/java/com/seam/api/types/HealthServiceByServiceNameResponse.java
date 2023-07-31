package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = HealthServiceByServiceNameResponse.Builder.class)
public final class HealthServiceByServiceNameResponse {
    private final boolean ok;

    private final String lastServiceEvaluationAt;

    private final ServiceHealth serviceHealth;

    private HealthServiceByServiceNameResponse(
            boolean ok, String lastServiceEvaluationAt, ServiceHealth serviceHealth) {
        this.ok = ok;
        this.lastServiceEvaluationAt = lastServiceEvaluationAt;
        this.serviceHealth = serviceHealth;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @JsonProperty("last_service_evaluation_at")
    public String getLastServiceEvaluationAt() {
        return lastServiceEvaluationAt;
    }

    @JsonProperty("service_health")
    public ServiceHealth getServiceHealth() {
        return serviceHealth;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HealthServiceByServiceNameResponse
                && equalTo((HealthServiceByServiceNameResponse) other);
    }

    private boolean equalTo(HealthServiceByServiceNameResponse other) {
        return ok == other.ok
                && lastServiceEvaluationAt.equals(other.lastServiceEvaluationAt)
                && serviceHealth.equals(other.serviceHealth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok, this.lastServiceEvaluationAt, this.serviceHealth);
    }

    @Override
    public String toString() {
        return "HealthServiceByServiceNameResponse{" + "ok: " + ok + ", lastServiceEvaluationAt: "
                + lastServiceEvaluationAt + ", serviceHealth: " + serviceHealth + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        LastServiceEvaluationAtStage ok(boolean ok);

        Builder from(HealthServiceByServiceNameResponse other);
    }

    public interface LastServiceEvaluationAtStage {
        ServiceHealthStage lastServiceEvaluationAt(String lastServiceEvaluationAt);
    }

    public interface ServiceHealthStage {
        _FinalStage serviceHealth(ServiceHealth serviceHealth);
    }

    public interface _FinalStage {
        HealthServiceByServiceNameResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements OkStage, LastServiceEvaluationAtStage, ServiceHealthStage, _FinalStage {
        private boolean ok;

        private String lastServiceEvaluationAt;

        private ServiceHealth serviceHealth;

        private Builder() {}

        @Override
        public Builder from(HealthServiceByServiceNameResponse other) {
            ok(other.getOk());
            lastServiceEvaluationAt(other.getLastServiceEvaluationAt());
            serviceHealth(other.getServiceHealth());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public LastServiceEvaluationAtStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        @JsonSetter("last_service_evaluation_at")
        public ServiceHealthStage lastServiceEvaluationAt(String lastServiceEvaluationAt) {
            this.lastServiceEvaluationAt = lastServiceEvaluationAt;
            return this;
        }

        @Override
        @JsonSetter("service_health")
        public _FinalStage serviceHealth(ServiceHealth serviceHealth) {
            this.serviceHealth = serviceHealth;
            return this;
        }

        @Override
        public HealthServiceByServiceNameResponse build() {
            return new HealthServiceByServiceNameResponse(ok, lastServiceEvaluationAt, serviceHealth);
        }
    }
}
