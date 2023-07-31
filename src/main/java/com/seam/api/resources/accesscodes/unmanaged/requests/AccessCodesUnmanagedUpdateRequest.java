package com.seam.api.resources.accesscodes.unmanaged.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesUnmanagedUpdateRequest.Builder.class)
public final class AccessCodesUnmanagedUpdateRequest {
    private final String accessCodeId;

    private final boolean isManaged;

    private final Optional<Boolean> force;

    private AccessCodesUnmanagedUpdateRequest(String accessCodeId, boolean isManaged, Optional<Boolean> force) {
        this.accessCodeId = accessCodeId;
        this.isManaged = isManaged;
        this.force = force;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("is_managed")
    public boolean getIsManaged() {
        return isManaged;
    }

    @JsonProperty("force")
    public Optional<Boolean> getForce() {
        return force;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUnmanagedUpdateRequest && equalTo((AccessCodesUnmanagedUpdateRequest) other);
    }

    private boolean equalTo(AccessCodesUnmanagedUpdateRequest other) {
        return accessCodeId.equals(other.accessCodeId) && isManaged == other.isManaged && force.equals(other.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodeId, this.isManaged, this.force);
    }

    @Override
    public String toString() {
        return "AccessCodesUnmanagedUpdateRequest{" + "accessCodeId: " + accessCodeId + ", isManaged: " + isManaged
                + ", force: " + force + "}";
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        IsManagedStage accessCodeId(String accessCodeId);

        Builder from(AccessCodesUnmanagedUpdateRequest other);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(boolean isManaged);
    }

    public interface _FinalStage {
        AccessCodesUnmanagedUpdateRequest build();

        _FinalStage force(Optional<Boolean> force);

        _FinalStage force(Boolean force);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, IsManagedStage, _FinalStage {
        private String accessCodeId;

        private boolean isManaged;

        private Optional<Boolean> force = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesUnmanagedUpdateRequest other) {
            accessCodeId(other.getAccessCodeId());
            isManaged(other.getIsManaged());
            force(other.getForce());
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public IsManagedStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public _FinalStage isManaged(boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        public _FinalStage force(Boolean force) {
            this.force = Optional.of(force);
            return this;
        }

        @Override
        @JsonSetter(value = "force", nulls = Nulls.SKIP)
        public _FinalStage force(Optional<Boolean> force) {
            this.force = force;
            return this;
        }

        @Override
        public AccessCodesUnmanagedUpdateRequest build() {
            return new AccessCodesUnmanagedUpdateRequest(accessCodeId, isManaged, force);
        }
    }
}
