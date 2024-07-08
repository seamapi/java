/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.webhooks.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = WebhooksDeleteRequest.Builder.class)
public final class WebhooksDeleteRequest {
    private final String webhookId;

    private final Map<String, Object> additionalProperties;

    private WebhooksDeleteRequest(String webhookId, Map<String, Object> additionalProperties) {
        this.webhookId = webhookId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("webhook_id")
    public String getWebhookId() {
        return webhookId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksDeleteRequest && equalTo((WebhooksDeleteRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WebhooksDeleteRequest other) {
        return webhookId.equals(other.webhookId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.webhookId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
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

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(WebhooksDeleteRequest other) {
            webhookId(other.getWebhookId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("webhook_id")
        public _FinalStage webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        @java.lang.Override
        public WebhooksDeleteRequest build() {
            return new WebhooksDeleteRequest(webhookId, additionalProperties);
        }
    }
}
