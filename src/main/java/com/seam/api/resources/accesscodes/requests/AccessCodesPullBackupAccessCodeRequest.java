package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesPullBackupAccessCodeRequest.Builder.class)
public final class AccessCodesPullBackupAccessCodeRequest {
    private final String accessCodeId;

    private AccessCodesPullBackupAccessCodeRequest(String accessCodeId) {
        this.accessCodeId = accessCodeId;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesPullBackupAccessCodeRequest
                && equalTo((AccessCodesPullBackupAccessCodeRequest) other);
    }

    private boolean equalTo(AccessCodesPullBackupAccessCodeRequest other) {
        return accessCodeId.equals(other.accessCodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodeId);
    }

    @Override
    public String toString() {
        return "AccessCodesPullBackupAccessCodeRequest{" + "accessCodeId: " + accessCodeId + "}";
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        _FinalStage accessCodeId(String accessCodeId);

        Builder from(AccessCodesPullBackupAccessCodeRequest other);
    }

    public interface _FinalStage {
        AccessCodesPullBackupAccessCodeRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, _FinalStage {
        private String accessCodeId;

        private Builder() {}

        @Override
        public Builder from(AccessCodesPullBackupAccessCodeRequest other) {
            accessCodeId(other.getAccessCodeId());
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public _FinalStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        public AccessCodesPullBackupAccessCodeRequest build() {
            return new AccessCodesPullBackupAccessCodeRequest(accessCodeId);
        }
    }
}