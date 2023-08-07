package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesDeleteRequest.Builder.class)
public final class AccessCodesDeleteRequest {
    private final Optional<String> deviceId;

    private final String accessCodeId;

    private final Optional<Boolean> sync;

    private AccessCodesDeleteRequest(Optional<String> deviceId, String accessCodeId, Optional<Boolean> sync) {
        this.deviceId = deviceId;
        this.accessCodeId = accessCodeId;
        this.sync = sync;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
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
        return other instanceof AccessCodesDeleteRequest && equalTo((AccessCodesDeleteRequest) other);
    }

    private boolean equalTo(AccessCodesDeleteRequest other) {
        return deviceId.equals(other.deviceId) && accessCodeId.equals(other.accessCodeId) && sync.equals(other.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.accessCodeId, this.sync);
    }

    @Override
    public String toString() {
        return "AccessCodesDeleteRequest{" + "deviceId: " + deviceId + ", accessCodeId: " + accessCodeId + ", sync: "
                + sync + "}";
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        _FinalStage accessCodeId(String accessCodeId);

        Builder from(AccessCodesDeleteRequest other);
    }

    public interface _FinalStage {
        AccessCodesDeleteRequest build();

        _FinalStage deviceId(Optional<String> deviceId);

        _FinalStage deviceId(String deviceId);

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, _FinalStage {
        private String accessCodeId;

        private Optional<Boolean> sync = Optional.empty();

        private Optional<String> deviceId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesDeleteRequest other) {
            deviceId(other.getDeviceId());
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
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        @Override
        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public _FinalStage deviceId(Optional<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public AccessCodesDeleteRequest build() {
            return new AccessCodesDeleteRequest(deviceId, accessCodeId, sync);
        }
    }
}
