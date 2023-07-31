package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = Webhook.Builder.class)
public final class Webhook {
    private final String webhookId;

    private final String url;

    private final Optional<List<String>> eventTypes;

    private final Optional<String> secret;

    private Webhook(String webhookId, String url, Optional<List<String>> eventTypes, Optional<String> secret) {
        this.webhookId = webhookId;
        this.url = url;
        this.eventTypes = eventTypes;
        this.secret = secret;
    }

    @JsonProperty("webhook_id")
    public String getWebhookId() {
        return webhookId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("event_types")
    public Optional<List<String>> getEventTypes() {
        return eventTypes;
    }

    @JsonProperty("secret")
    public Optional<String> getSecret() {
        return secret;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Webhook && equalTo((Webhook) other);
    }

    private boolean equalTo(Webhook other) {
        return webhookId.equals(other.webhookId)
                && url.equals(other.url)
                && eventTypes.equals(other.eventTypes)
                && secret.equals(other.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.webhookId, this.url, this.eventTypes, this.secret);
    }

    @Override
    public String toString() {
        return "Webhook{" + "webhookId: " + webhookId + ", url: " + url + ", eventTypes: " + eventTypes + ", secret: "
                + secret + "}";
    }

    public static WebhookIdStage builder() {
        return new Builder();
    }

    public interface WebhookIdStage {
        UrlStage webhookId(String webhookId);

        Builder from(Webhook other);
    }

    public interface UrlStage {
        _FinalStage url(String url);
    }

    public interface _FinalStage {
        Webhook build();

        _FinalStage eventTypes(Optional<List<String>> eventTypes);

        _FinalStage eventTypes(List<String> eventTypes);

        _FinalStage secret(Optional<String> secret);

        _FinalStage secret(String secret);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WebhookIdStage, UrlStage, _FinalStage {
        private String webhookId;

        private String url;

        private Optional<String> secret = Optional.empty();

        private Optional<List<String>> eventTypes = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Webhook other) {
            webhookId(other.getWebhookId());
            url(other.getUrl());
            eventTypes(other.getEventTypes());
            secret(other.getSecret());
            return this;
        }

        @Override
        @JsonSetter("webhook_id")
        public UrlStage webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        @Override
        @JsonSetter("url")
        public _FinalStage url(String url) {
            this.url = url;
            return this;
        }

        @Override
        public _FinalStage secret(String secret) {
            this.secret = Optional.of(secret);
            return this;
        }

        @Override
        @JsonSetter(value = "secret", nulls = Nulls.SKIP)
        public _FinalStage secret(Optional<String> secret) {
            this.secret = secret;
            return this;
        }

        @Override
        public _FinalStage eventTypes(List<String> eventTypes) {
            this.eventTypes = Optional.of(eventTypes);
            return this;
        }

        @Override
        @JsonSetter(value = "event_types", nulls = Nulls.SKIP)
        public _FinalStage eventTypes(Optional<List<String>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        @Override
        public Webhook build() {
            return new Webhook(webhookId, url, eventTypes, secret);
        }
    }
}
