package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = AccessCodesUnmanagedConvertToManagedResponse.Builder.class)
public final class AccessCodesUnmanagedConvertToManagedResponse {
    private final boolean ok;

    private AccessCodesUnmanagedConvertToManagedResponse(boolean ok) {
        this.ok = ok;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUnmanagedConvertToManagedResponse
                && equalTo((AccessCodesUnmanagedConvertToManagedResponse) other);
    }

    private boolean equalTo(AccessCodesUnmanagedConvertToManagedResponse other) {
        return ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok);
    }

    @Override
    public String toString() {
        return "AccessCodesUnmanagedConvertToManagedResponse{" + "ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(AccessCodesUnmanagedConvertToManagedResponse other);
    }

    public interface _FinalStage {
        AccessCodesUnmanagedConvertToManagedResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(AccessCodesUnmanagedConvertToManagedResponse other) {
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public AccessCodesUnmanagedConvertToManagedResponse build() {
            return new AccessCodesUnmanagedConvertToManagedResponse(ok);
        }
    }
}
