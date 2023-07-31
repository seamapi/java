package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = AccessCodesListResponse.Builder.class)
public final class AccessCodesListResponse {
    private final List<AccessCode> accessCodes;

    private final boolean ok;

    private AccessCodesListResponse(List<AccessCode> accessCodes, boolean ok) {
        this.accessCodes = accessCodes;
        this.ok = ok;
    }

    @JsonProperty("access_codes")
    public List<AccessCode> getAccessCodes() {
        return accessCodes;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesListResponse && equalTo((AccessCodesListResponse) other);
    }

    private boolean equalTo(AccessCodesListResponse other) {
        return accessCodes.equals(other.accessCodes) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodes, this.ok);
    }

    @Override
    public String toString() {
        return "AccessCodesListResponse{" + "accessCodes: " + accessCodes + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(AccessCodesListResponse other);
    }

    public interface _FinalStage {
        AccessCodesListResponse build();

        _FinalStage accessCodes(List<AccessCode> accessCodes);

        _FinalStage addAccessCodes(AccessCode accessCodes);

        _FinalStage addAllAccessCodes(List<AccessCode> accessCodes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AccessCode> accessCodes = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(AccessCodesListResponse other) {
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
        public _FinalStage addAllAccessCodes(List<AccessCode> accessCodes) {
            this.accessCodes.addAll(accessCodes);
            return this;
        }

        @Override
        public _FinalStage addAccessCodes(AccessCode accessCodes) {
            this.accessCodes.add(accessCodes);
            return this;
        }

        @Override
        @JsonSetter(value = "access_codes", nulls = Nulls.SKIP)
        public _FinalStage accessCodes(List<AccessCode> accessCodes) {
            this.accessCodes.clear();
            this.accessCodes.addAll(accessCodes);
            return this;
        }

        @Override
        public AccessCodesListResponse build() {
            return new AccessCodesListResponse(accessCodes, ok);
        }
    }
}
