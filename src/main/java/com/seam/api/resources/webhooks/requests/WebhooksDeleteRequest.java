package com.seam.api.resources.webhooks.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = WebhooksDeleteRequest.Builder.class)
public final class WebhooksDeleteRequest {
    private final String webhookId;

    private WebhooksDeleteRequest(String webhookId) {
        this.webhookId = webhookId;
    }

    @JsonProperty("webhook_id")
    public String getWebhookId() {
        return webhookId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksDeleteRequest && equalTo((WebhooksDeleteRequest) other);
    }

    private boolean equalTo(WebhooksDeleteRequest other) {
        return webhookId.equals(other.webhookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.webhookId);
    }

    @Override
    public String toString() {
        return "WebhooksDeleteRequest{" + "webhookId: " + webhookId + "}";
    }

    public static WebhookIdStage builder() {
        return new Builder();
    }

    public interface WebhookIdStage {
        _FinalStage webhookId(String webhookId);

        Builder from(WebhooksDeleteRequest other);
    }

    public interface _FinalStage {
        WebhooksDeleteRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WebhookIdStage, _FinalStage {
        private String webhookId;

        private Builder() {}

        @Override
        public Builder from(WebhooksDeleteRequest other) {
            webhookId(other.getWebhookId());
            return this;
        }

        @Override
        @JsonSetter("webhook_id")
        public _FinalStage webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        @Override
        public WebhooksDeleteRequest build() {
            return new WebhooksDeleteRequest(webhookId);
        }
    }
}
