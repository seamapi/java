package com.seam.api.resources.accesscodes.simulate.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = AccessCodesSimulateCreateUnmanagedAccessCodeRequest.Builder.class)
public final class AccessCodesSimulateCreateUnmanagedAccessCodeRequest {
    private final String deviceId;

    private final String name;

    private final String code;

    private AccessCodesSimulateCreateUnmanagedAccessCodeRequest(String deviceId, String name, String code) {
        this.deviceId = deviceId;
        this.name = name;
        this.code = code;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 8 characters</code>&lt;/span&gt;
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesSimulateCreateUnmanagedAccessCodeRequest
                && equalTo((AccessCodesSimulateCreateUnmanagedAccessCodeRequest) other);
    }

    private boolean equalTo(AccessCodesSimulateCreateUnmanagedAccessCodeRequest other) {
        return deviceId.equals(other.deviceId) && name.equals(other.name) && code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.name, this.code);
    }

    @Override
    public String toString() {
        return "AccessCodesSimulateCreateUnmanagedAccessCodeRequest{" + "deviceId: " + deviceId + ", name: " + name
                + ", code: " + code + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        NameStage deviceId(String deviceId);

        Builder from(AccessCodesSimulateCreateUnmanagedAccessCodeRequest other);
    }

    public interface NameStage {
        CodeStage name(String name);
    }

    public interface CodeStage {
        _FinalStage code(String code);
    }

    public interface _FinalStage {
        AccessCodesSimulateCreateUnmanagedAccessCodeRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, NameStage, CodeStage, _FinalStage {
        private String deviceId;

        private String name;

        private String code;

        private Builder() {}

        @Override
        public Builder from(AccessCodesSimulateCreateUnmanagedAccessCodeRequest other) {
            deviceId(other.getDeviceId());
            name(other.getName());
            code(other.getCode());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public NameStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("name")
        public CodeStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>&lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 8 characters</code>&lt;/span&gt;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("code")
        public _FinalStage code(String code) {
            this.code = code;
            return this;
        }

        @Override
        public AccessCodesSimulateCreateUnmanagedAccessCodeRequest build() {
            return new AccessCodesSimulateCreateUnmanagedAccessCodeRequest(deviceId, name, code);
        }
    }
}
