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
@JsonDeserialize(builder = UnmanagedUpdateRequest.Builder.class)
public final class UnmanagedUpdateRequest {
    private final String accessCodeId;

    private final boolean isManaged;

    private final Optional<Boolean> force;

    private UnmanagedUpdateRequest(String accessCodeId, boolean isManaged, Optional<Boolean> force) {
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
        return other instanceof UnmanagedUpdateRequest && equalTo((UnmanagedUpdateRequest) other);
    }

    private boolean equalTo(UnmanagedUpdateRequest other) {
        return accessCodeId.equals(other.accessCodeId) && isManaged == other.isManaged && force.equals(other.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodeId, this.isManaged, this.force);
    }

    @Override
    public String toString() {
        return "UnmanagedUpdateRequest{" + "accessCodeId: " + accessCodeId + ", isManaged: " + isManaged + ", force: "
                + force + "}";
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        IsManagedStage accessCodeId(String accessCodeId);

        Builder from(UnmanagedUpdateRequest other);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(boolean isManaged);
    }

    public interface _FinalStage {
        UnmanagedUpdateRequest build();

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
        public Builder from(UnmanagedUpdateRequest other) {
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
        public UnmanagedUpdateRequest build() {
            return new UnmanagedUpdateRequest(accessCodeId, isManaged, force);
        }
    }
}
