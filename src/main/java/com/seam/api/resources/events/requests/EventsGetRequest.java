package com.seam.api.resources.events.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EventsGetRequest.Builder.class)
public final class EventsGetRequest {
    private final Optional<String> eventId;

    private final Optional<String> eventType;

    private final Optional<String> deviceId;

    private EventsGetRequest(Optional<String> eventId, Optional<String> eventType, Optional<String> deviceId) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.deviceId = deviceId;
    }

    @JsonProperty("event_id")
    public Optional<String> getEventId() {
        return eventId;
    }

    @JsonProperty("event_type")
    public Optional<String> getEventType() {
        return eventType;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EventsGetRequest && equalTo((EventsGetRequest) other);
    }

    private boolean equalTo(EventsGetRequest other) {
        return eventId.equals(other.eventId) && eventType.equals(other.eventType) && deviceId.equals(other.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.eventId, this.eventType, this.deviceId);
    }

    @Override
    public String toString() {
        return "EventsGetRequest{" + "eventId: " + eventId + ", eventType: " + eventType + ", deviceId: " + deviceId
                + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> eventId = Optional.empty();

        private Optional<String> eventType = Optional.empty();

        private Optional<String> deviceId = Optional.empty();

        private Builder() {}

        public Builder from(EventsGetRequest other) {
            eventId(other.getEventId());
            eventType(other.getEventType());
            deviceId(other.getDeviceId());
            return this;
        }

        @JsonSetter(value = "event_id", nulls = Nulls.SKIP)
        public Builder eventId(Optional<String> eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder eventId(String eventId) {
            this.eventId = Optional.of(eventId);
            return this;
        }

        @JsonSetter(value = "event_type", nulls = Nulls.SKIP)
        public Builder eventType(Optional<String> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder eventType(String eventType) {
            this.eventType = Optional.of(eventType);
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

        public EventsGetRequest build() {
            return new EventsGetRequest(eventId, eventType, deviceId);
        }
    }
}
