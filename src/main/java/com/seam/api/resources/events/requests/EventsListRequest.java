/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.events.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.events.types.EventsListRequestBetweenItem;
import com.seam.api.types.EventType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EventsListRequest.Builder.class)
public final class EventsListRequest {
    private final Optional<String> since;

    private final Optional<List<EventsListRequestBetweenItem>> between;

    private final Optional<String> deviceId;

    private final Optional<List<String>> deviceIds;

    private final Optional<String> accessCodeId;

    private final Optional<List<String>> accessCodeIds;

    private final Optional<EventType> eventType;

    private final Optional<List<EventType>> eventTypes;

    private final Optional<String> connectedAccountId;

    private final Optional<Double> limit;

    private final Map<String, Object> additionalProperties;

    private EventsListRequest(
            Optional<String> since,
            Optional<List<EventsListRequestBetweenItem>> between,
            Optional<String> deviceId,
            Optional<List<String>> deviceIds,
            Optional<String> accessCodeId,
            Optional<List<String>> accessCodeIds,
            Optional<EventType> eventType,
            Optional<List<EventType>> eventTypes,
            Optional<String> connectedAccountId,
            Optional<Double> limit,
            Map<String, Object> additionalProperties) {
        this.since = since;
        this.between = between;
        this.deviceId = deviceId;
        this.deviceIds = deviceIds;
        this.accessCodeId = accessCodeId;
        this.accessCodeIds = accessCodeIds;
        this.eventType = eventType;
        this.eventTypes = eventTypes;
        this.connectedAccountId = connectedAccountId;
        this.limit = limit;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("since")
    public Optional<String> getSince() {
        return since;
    }

    @JsonProperty("between")
    public Optional<List<EventsListRequestBetweenItem>> getBetween() {
        return between;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_ids")
    public Optional<List<String>> getDeviceIds() {
        return deviceIds;
    }

    @JsonProperty("access_code_id")
    public Optional<String> getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("access_code_ids")
    public Optional<List<String>> getAccessCodeIds() {
        return accessCodeIds;
    }

    @JsonProperty("event_type")
    public Optional<EventType> getEventType() {
        return eventType;
    }

    @JsonProperty("event_types")
    public Optional<List<EventType>> getEventTypes() {
        return eventTypes;
    }

    @JsonProperty("connected_account_id")
    public Optional<String> getConnectedAccountId() {
        return connectedAccountId;
    }

    @JsonProperty("limit")
    public Optional<Double> getLimit() {
        return limit;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EventsListRequest && equalTo((EventsListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EventsListRequest other) {
        return since.equals(other.since)
                && between.equals(other.between)
                && deviceId.equals(other.deviceId)
                && deviceIds.equals(other.deviceIds)
                && accessCodeId.equals(other.accessCodeId)
                && accessCodeIds.equals(other.accessCodeIds)
                && eventType.equals(other.eventType)
                && eventTypes.equals(other.eventTypes)
                && connectedAccountId.equals(other.connectedAccountId)
                && limit.equals(other.limit);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.since,
                this.between,
                this.deviceId,
                this.deviceIds,
                this.accessCodeId,
                this.accessCodeIds,
                this.eventType,
                this.eventTypes,
                this.connectedAccountId,
                this.limit);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> since = Optional.empty();

        private Optional<List<EventsListRequestBetweenItem>> between = Optional.empty();

        private Optional<String> deviceId = Optional.empty();

        private Optional<List<String>> deviceIds = Optional.empty();

        private Optional<String> accessCodeId = Optional.empty();

        private Optional<List<String>> accessCodeIds = Optional.empty();

        private Optional<EventType> eventType = Optional.empty();

        private Optional<List<EventType>> eventTypes = Optional.empty();

        private Optional<String> connectedAccountId = Optional.empty();

        private Optional<Double> limit = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EventsListRequest other) {
            since(other.getSince());
            between(other.getBetween());
            deviceId(other.getDeviceId());
            deviceIds(other.getDeviceIds());
            accessCodeId(other.getAccessCodeId());
            accessCodeIds(other.getAccessCodeIds());
            eventType(other.getEventType());
            eventTypes(other.getEventTypes());
            connectedAccountId(other.getConnectedAccountId());
            limit(other.getLimit());
            return this;
        }

        @JsonSetter(value = "since", nulls = Nulls.SKIP)
        public Builder since(Optional<String> since) {
            this.since = since;
            return this;
        }

        public Builder since(String since) {
            this.since = Optional.of(since);
            return this;
        }

        @JsonSetter(value = "between", nulls = Nulls.SKIP)
        public Builder between(Optional<List<EventsListRequestBetweenItem>> between) {
            this.between = between;
            return this;
        }

        public Builder between(List<EventsListRequestBetweenItem> between) {
            this.between = Optional.of(between);
            return this;
        }

        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public Builder deviceId(Optional<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        @JsonSetter(value = "device_ids", nulls = Nulls.SKIP)
        public Builder deviceIds(Optional<List<String>> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        public Builder deviceIds(List<String> deviceIds) {
            this.deviceIds = Optional.of(deviceIds);
            return this;
        }

        @JsonSetter(value = "access_code_id", nulls = Nulls.SKIP)
        public Builder accessCodeId(Optional<String> accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        public Builder accessCodeId(String accessCodeId) {
            this.accessCodeId = Optional.of(accessCodeId);
            return this;
        }

        @JsonSetter(value = "access_code_ids", nulls = Nulls.SKIP)
        public Builder accessCodeIds(Optional<List<String>> accessCodeIds) {
            this.accessCodeIds = accessCodeIds;
            return this;
        }

        public Builder accessCodeIds(List<String> accessCodeIds) {
            this.accessCodeIds = Optional.of(accessCodeIds);
            return this;
        }

        @JsonSetter(value = "event_type", nulls = Nulls.SKIP)
        public Builder eventType(Optional<EventType> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder eventType(EventType eventType) {
            this.eventType = Optional.of(eventType);
            return this;
        }

        @JsonSetter(value = "event_types", nulls = Nulls.SKIP)
        public Builder eventTypes(Optional<List<EventType>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        public Builder eventTypes(List<EventType> eventTypes) {
            this.eventTypes = Optional.of(eventTypes);
            return this;
        }

        @JsonSetter(value = "connected_account_id", nulls = Nulls.SKIP)
        public Builder connectedAccountId(Optional<String> connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = Optional.of(connectedAccountId);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Double> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Double limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        public EventsListRequest build() {
            return new EventsListRequest(
                    since,
                    between,
                    deviceId,
                    deviceIds,
                    accessCodeId,
                    accessCodeIds,
                    eventType,
                    eventTypes,
                    connectedAccountId,
                    limit,
                    additionalProperties);
        }
    }
}
