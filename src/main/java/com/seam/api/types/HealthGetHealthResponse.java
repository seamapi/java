package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = HealthGetHealthResponse.Builder.class)
public final class HealthGetHealthResponse {
    private final boolean ok;

    private final Optional<String> lastServiceEvaluationAt;

    private final List<ServiceHealth> serviceHealthStatuses;

    private HealthGetHealthResponse(
            boolean ok, Optional<String> lastServiceEvaluationAt, List<ServiceHealth> serviceHealthStatuses) {
        this.ok = ok;
        this.lastServiceEvaluationAt = lastServiceEvaluationAt;
        this.serviceHealthStatuses = serviceHealthStatuses;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @JsonProperty("msg")
    public String getMsg() {
        return "I’m one with the Force. The Force is with me.";
    }

    @JsonProperty("last_service_evaluation_at")
    public Optional<String> getLastServiceEvaluationAt() {
        return lastServiceEvaluationAt;
    }

    @JsonProperty("service_health_statuses")
    public List<ServiceHealth> getServiceHealthStatuses() {
        return serviceHealthStatuses;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HealthGetHealthResponse && equalTo((HealthGetHealthResponse) other);
    }

    private boolean equalTo(HealthGetHealthResponse other) {
        return ok == other.ok
                && lastServiceEvaluationAt.equals(other.lastServiceEvaluationAt)
                && serviceHealthStatuses.equals(other.serviceHealthStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok, this.lastServiceEvaluationAt, this.serviceHealthStatuses);
    }

    @Override
    public String toString() {
        return "HealthGetHealthResponse{" + "ok: " + ok + ", lastServiceEvaluationAt: " + lastServiceEvaluationAt
                + ", serviceHealthStatuses: " + serviceHealthStatuses + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(HealthGetHealthResponse other);
    }

    public interface _FinalStage {
        HealthGetHealthResponse build();

        _FinalStage lastServiceEvaluationAt(Optional<String> lastServiceEvaluationAt);

        _FinalStage lastServiceEvaluationAt(String lastServiceEvaluationAt);

        _FinalStage serviceHealthStatuses(List<ServiceHealth> serviceHealthStatuses);

        _FinalStage addServiceHealthStatuses(ServiceHealth serviceHealthStatuses);

        _FinalStage addAllServiceHealthStatuses(List<ServiceHealth> serviceHealthStatuses);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ServiceHealth> serviceHealthStatuses = new ArrayList<>();

        private Optional<String> lastServiceEvaluationAt = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(HealthGetHealthResponse other) {
            ok(other.getOk());
            lastServiceEvaluationAt(other.getLastServiceEvaluationAt());
            serviceHealthStatuses(other.getServiceHealthStatuses());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage addAllServiceHealthStatuses(List<ServiceHealth> serviceHealthStatuses) {
            this.serviceHealthStatuses.addAll(serviceHealthStatuses);
            return this;
        }

        @Override
        public _FinalStage addServiceHealthStatuses(ServiceHealth serviceHealthStatuses) {
            this.serviceHealthStatuses.add(serviceHealthStatuses);
            return this;
        }

        @Override
        @JsonSetter(value = "service_health_statuses", nulls = Nulls.SKIP)
        public _FinalStage serviceHealthStatuses(List<ServiceHealth> serviceHealthStatuses) {
            this.serviceHealthStatuses.clear();
            this.serviceHealthStatuses.addAll(serviceHealthStatuses);
            return this;
        }

        @Override
        public _FinalStage lastServiceEvaluationAt(String lastServiceEvaluationAt) {
            this.lastServiceEvaluationAt = Optional.of(lastServiceEvaluationAt);
            return this;
        }

        @Override
        @JsonSetter(value = "last_service_evaluation_at", nulls = Nulls.SKIP)
        public _FinalStage lastServiceEvaluationAt(Optional<String> lastServiceEvaluationAt) {
            this.lastServiceEvaluationAt = lastServiceEvaluationAt;
            return this;
        }

        @Override
        public HealthGetHealthResponse build() {
            return new HealthGetHealthResponse(ok, lastServiceEvaluationAt, serviceHealthStatuses);
        }
    }
}
