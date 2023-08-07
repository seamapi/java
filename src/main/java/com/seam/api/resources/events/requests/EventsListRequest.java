package com.seam.api.resources.events.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.EventsListRequestBetweenItem;
import com.seam.api.types.EventsListRequestEventType;
import com.seam.api.types.EventsListRequestEventTypesItem;
import java.util.List;
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

    private final Optional<EventsListRequestEventType> eventType;

    private final Optional<List<EventsListRequestEventTypesItem>> eventTypes;

    private final Optional<String> connectedAccountId;

    private EventsListRequest(
            Optional<String> since,
            Optional<List<EventsListRequestBetweenItem>> between,
            Optional<String> deviceId,
            Optional<List<String>> deviceIds,
            Optional<String> accessCodeId,
            Optional<List<String>> accessCodeIds,
            Optional<EventsListRequestEventType> eventType,
            Optional<List<EventsListRequestEventTypesItem>> eventTypes,
            Optional<String> connectedAccountId) {
        this.since = since;
        this.between = between;
        this.deviceId = deviceId;
        this.deviceIds = deviceIds;
        this.accessCodeId = accessCodeId;
        this.accessCodeIds = accessCodeIds;
        this.eventType = eventType;
        this.eventTypes = eventTypes;
        this.connectedAccountId = connectedAccountId;
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
    public Optional<EventsListRequestEventType> getEventType() {
        return eventType;
    }

    @JsonProperty("event_types")
    public Optional<List<EventsListRequestEventTypesItem>> getEventTypes() {
        return eventTypes;
    }

    @JsonProperty("connected_account_id")
    public Optional<String> getConnectedAccountId() {
        return connectedAccountId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EventsListRequest && equalTo((EventsListRequest) other);
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
                && connectedAccountId.equals(other.connectedAccountId);
    }

    @Override
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
                this.connectedAccountId);
    }

    @Override
    public String toString() {
        return "EventsListRequest{" + "since: " + since + ", between: " + between + ", deviceId: " + deviceId
                + ", deviceIds: " + deviceIds + ", accessCodeId: " + accessCodeId + ", accessCodeIds: " + accessCodeIds
                + ", eventType: " + eventType + ", eventTypes: " + eventTypes + ", connectedAccountId: "
                + connectedAccountId + "}";
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

        private Optional<EventsListRequestEventType> eventType = Optional.empty();

        private Optional<List<EventsListRequestEventTypesItem>> eventTypes = Optional.empty();

        private Optional<String> connectedAccountId = Optional.empty();

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
        public Builder eventType(Optional<EventsListRequestEventType> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder eventType(EventsListRequestEventType eventType) {
            this.eventType = Optional.of(eventType);
            return this;
        }

        @JsonSetter(value = "event_types", nulls = Nulls.SKIP)
        public Builder eventTypes(Optional<List<EventsListRequestEventTypesItem>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        public Builder eventTypes(List<EventsListRequestEventTypesItem> eventTypes) {
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
                    connectedAccountId);
        }
    }
}
