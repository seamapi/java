package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesUnmanagedGetResponse.Builder.class)
public final class AccessCodesUnmanagedGetResponse {
    private final AccessCodesUnmanagedGetResponseAccessCode accessCode;

    private final boolean ok;

    private AccessCodesUnmanagedGetResponse(AccessCodesUnmanagedGetResponseAccessCode accessCode, boolean ok) {
        this.accessCode = accessCode;
        this.ok = ok;
    }

    @JsonProperty("access_code")
    public AccessCodesUnmanagedGetResponseAccessCode getAccessCode() {
        return accessCode;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUnmanagedGetResponse && equalTo((AccessCodesUnmanagedGetResponse) other);
    }

    private boolean equalTo(AccessCodesUnmanagedGetResponse other) {
        return accessCode.equals(other.accessCode) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCode, this.ok);
    }

    @Override
    public String toString() {
        return "AccessCodesUnmanagedGetResponse{" + "accessCode: " + accessCode + ", ok: " + ok + "}";
    }

    public static AccessCodeStage builder() {
        return new Builder();
    }

    public interface AccessCodeStage {
        OkStage accessCode(AccessCodesUnmanagedGetResponseAccessCode accessCode);

        Builder from(AccessCodesUnmanagedGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        AccessCodesUnmanagedGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeStage, OkStage, _FinalStage {
        private AccessCodesUnmanagedGetResponseAccessCode accessCode;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(AccessCodesUnmanagedGetResponse other) {
            accessCode(other.getAccessCode());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("access_code")
        public OkStage accessCode(AccessCodesUnmanagedGetResponseAccessCode accessCode) {
            this.accessCode = accessCode;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public AccessCodesUnmanagedGetResponse build() {
            return new AccessCodesUnmanagedGetResponse(accessCode, ok);
        }
    }
}
