package com.seam.api.resources.accesscodes.unmanaged.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UnmanagedDeleteRequest.Builder.class)
public final class UnmanagedDeleteRequest {
    private final String accessCodeId;

    private final Optional<Boolean> sync;

    private UnmanagedDeleteRequest(String accessCodeId, Optional<Boolean> sync) {
        this.accessCodeId = accessCodeId;
        this.sync = sync;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("sync")
    public Optional<Boolean> getSync() {
        return sync;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedDeleteRequest && equalTo((UnmanagedDeleteRequest) other);
    }

    private boolean equalTo(UnmanagedDeleteRequest other) {
        return accessCodeId.equals(other.accessCodeId) && sync.equals(other.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodeId, this.sync);
    }

    @Override
    public String toString() {
        return "UnmanagedDeleteRequest{" + "accessCodeId: " + accessCodeId + ", sync: " + sync + "}";
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        _FinalStage accessCodeId(String accessCodeId);

        Builder from(UnmanagedDeleteRequest other);
    }

    public interface _FinalStage {
        UnmanagedDeleteRequest build();

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, _FinalStage {
        private String accessCodeId;

        private Optional<Boolean> sync = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(UnmanagedDeleteRequest other) {
            accessCodeId(other.getAccessCodeId());
            sync(other.getSync());
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public _FinalStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        public _FinalStage sync(Boolean sync) {
            this.sync = Optional.of(sync);
            return this;
        }

        @Override
        @JsonSetter(value = "sync", nulls = Nulls.SKIP)
        public _FinalStage sync(Optional<Boolean> sync) {
            this.sync = sync;
            return this;
        }

        @Override
        public UnmanagedDeleteRequest build() {
            return new UnmanagedDeleteRequest(accessCodeId, sync);
        }
    }
}