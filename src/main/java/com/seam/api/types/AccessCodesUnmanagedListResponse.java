package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = AccessCodesUnmanagedListResponse.Builder.class)
public final class AccessCodesUnmanagedListResponse {
    private final List<AccessCodesUnmanagedListResponseAccessCodesItem> accessCodes;

    private final boolean ok;

    private AccessCodesUnmanagedListResponse(
            List<AccessCodesUnmanagedListResponseAccessCodesItem> accessCodes, boolean ok) {
        this.accessCodes = accessCodes;
        this.ok = ok;
    }

    @JsonProperty("access_codes")
    public List<AccessCodesUnmanagedListResponseAccessCodesItem> getAccessCodes() {
        return accessCodes;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUnmanagedListResponse && equalTo((AccessCodesUnmanagedListResponse) other);
    }

    private boolean equalTo(AccessCodesUnmanagedListResponse other) {
        return accessCodes.equals(other.accessCodes) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodes, this.ok);
    }

    @Override
    public String toString() {
        return "AccessCodesUnmanagedListResponse{" + "accessCodes: " + accessCodes + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(AccessCodesUnmanagedListResponse other);
    }

    public interface _FinalStage {
        AccessCodesUnmanagedListResponse build();

        _FinalStage accessCodes(List<AccessCodesUnmanagedListResponseAccessCodesItem> accessCodes);

        _FinalStage addAccessCodes(AccessCodesUnmanagedListResponseAccessCodesItem accessCodes);

        _FinalStage addAllAccessCodes(List<AccessCodesUnmanagedListResponseAccessCodesItem> accessCodes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AccessCodesUnmanagedListResponseAccessCodesItem> accessCodes = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(AccessCodesUnmanagedListResponse other) {
            accessCodes(other.getAccessCodes());
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
        public _FinalStage addAllAccessCodes(List<AccessCodesUnmanagedListResponseAccessCodesItem> accessCodes) {
            this.accessCodes.addAll(accessCodes);
            return this;
        }

        @Override
        public _FinalStage addAccessCodes(AccessCodesUnmanagedListResponseAccessCodesItem accessCodes) {
            this.accessCodes.add(accessCodes);
            return this;
        }

        @Override
        @JsonSetter(value = "access_codes", nulls = Nulls.SKIP)
        public _FinalStage accessCodes(List<AccessCodesUnmanagedListResponseAccessCodesItem> accessCodes) {
            this.accessCodes.clear();
            this.accessCodes.addAll(accessCodes);
            return this;
        }

        @Override
        public AccessCodesUnmanagedListResponse build() {
            return new AccessCodesUnmanagedListResponse(accessCodes, ok);
        }
    }
}
