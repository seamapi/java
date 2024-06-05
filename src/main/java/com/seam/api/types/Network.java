/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Network.Builder.class)
public final class Network {
    private final String networkId;

    private final String workspaceId;

    private final String displayName;

    private final OffsetDateTime createdAt;

    private final Map<String, Object> additionalProperties;

    private Network(
            String networkId,
            String workspaceId,
            String displayName,
            OffsetDateTime createdAt,
            Map<String, Object> additionalProperties) {
        this.networkId = networkId;
        this.workspaceId = workspaceId;
        this.displayName = displayName;
        this.createdAt = createdAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("network_id")
    public String getNetworkId() {
        return networkId;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Network && equalTo((Network) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Network other) {
        return networkId.equals(other.networkId)
                && workspaceId.equals(other.workspaceId)
                && displayName.equals(other.displayName)
                && createdAt.equals(other.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.networkId, this.workspaceId, this.displayName, this.createdAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NetworkIdStage builder() {
        return new Builder();
    }

    public interface NetworkIdStage {
        WorkspaceIdStage networkId(String networkId);

        Builder from(Network other);
    }

    public interface WorkspaceIdStage {
        DisplayNameStage workspaceId(String workspaceId);
    }

    public interface DisplayNameStage {
        CreatedAtStage displayName(String displayName);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        Network build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements NetworkIdStage, WorkspaceIdStage, DisplayNameStage, CreatedAtStage, _FinalStage {
        private String networkId;

        private String workspaceId;

        private String displayName;

        private OffsetDateTime createdAt;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Network other) {
            networkId(other.getNetworkId());
            workspaceId(other.getWorkspaceId());
            displayName(other.getDisplayName());
            createdAt(other.getCreatedAt());
            return this;
        }

        @Override
        @JsonSetter("network_id")
        public WorkspaceIdStage networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        @Override
        @JsonSetter("workspace_id")
        public DisplayNameStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        @JsonSetter("display_name")
        public CreatedAtStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        public Network build() {
            return new Network(networkId, workspaceId, displayName, createdAt, additionalProperties);
        }
    }
}
