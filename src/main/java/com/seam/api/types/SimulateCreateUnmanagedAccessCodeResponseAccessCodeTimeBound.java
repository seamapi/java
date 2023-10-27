/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound.Builder.class)
public final class SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound {
    private final String accessCodeId;

    private final Optional<String> code;

    private final SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBoundCreatedAt createdAt;

    private final boolean isManaged;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound(
            String accessCodeId,
            Optional<String> code,
            SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBoundCreatedAt createdAt,
            boolean isManaged,
            Optional<String> startsAt,
            Optional<String> endsAt) {
        this.accessCodeId = accessCodeId;
        this.code = code;
        this.createdAt = createdAt;
        this.isManaged = isManaged;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @JsonProperty("status")
    public String getStatus() {
        return "set";
    }

    @JsonProperty("created_at")
    public SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBoundCreatedAt getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("is_managed")
    public boolean getIsManaged() {
        return isManaged;
    }

    @JsonProperty("starts_at")
    public Optional<String> getStartsAt() {
        return startsAt;
    }

    @JsonProperty("ends_at")
    public Optional<String> getEndsAt() {
        return endsAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound
                && equalTo((SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound) other);
    }

    private boolean equalTo(SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound other) {
        return accessCodeId.equals(other.accessCodeId)
                && code.equals(other.code)
                && createdAt.equals(other.createdAt)
                && isManaged == other.isManaged
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodeId, this.code, this.createdAt, this.isManaged, this.startsAt, this.endsAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        CreatedAtStage accessCodeId(String accessCodeId);

        Builder from(SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound other);
    }

    public interface CreatedAtStage {
        IsManagedStage createdAt(SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBoundCreatedAt createdAt);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(boolean isManaged);
    }

    public interface _FinalStage {
        SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound build();

        _FinalStage code(Optional<String> code);

        _FinalStage code(String code);

        _FinalStage startsAt(Optional<String> startsAt);

        _FinalStage startsAt(String startsAt);

        _FinalStage endsAt(Optional<String> endsAt);

        _FinalStage endsAt(String endsAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, CreatedAtStage, IsManagedStage, _FinalStage {
        private String accessCodeId;

        private SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBoundCreatedAt createdAt;

        private boolean isManaged;

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound other) {
            accessCodeId(other.getAccessCodeId());
            code(other.getCode());
            createdAt(other.getCreatedAt());
            isManaged(other.getIsManaged());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public CreatedAtStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public IsManagedStage createdAt(
                SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBoundCreatedAt createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public _FinalStage isManaged(boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        public _FinalStage endsAt(String endsAt) {
            this.endsAt = Optional.of(endsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "ends_at", nulls = Nulls.SKIP)
        public _FinalStage endsAt(Optional<String> endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        @Override
        public _FinalStage startsAt(String startsAt) {
            this.startsAt = Optional.of(startsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "starts_at", nulls = Nulls.SKIP)
        public _FinalStage startsAt(Optional<String> startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        @Override
        public _FinalStage code(String code) {
            this.code = Optional.of(code);
            return this;
        }

        @Override
        @JsonSetter(value = "code", nulls = Nulls.SKIP)
        public _FinalStage code(Optional<String> code) {
            this.code = code;
            return this;
        }

        @Override
        public SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound build() {
            return new SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound(
                    accessCodeId, code, createdAt, isManaged, startsAt, endsAt);
        }
    }
}
