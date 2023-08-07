package com.seam.api.resources.connectwebviews.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.ConnectWebviewsCreateRequestAcceptedProvidersItem;
import com.seam.api.types.ConnectWebviewsCreateRequestCustomMetadataValue;
import com.seam.api.types.ConnectWebviewsCreateRequestDeviceSelectionMode;
import com.seam.api.types.ConnectWebviewsCreateRequestProviderCategory;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectWebviewsCreateRequest.Builder.class)
public final class ConnectWebviewsCreateRequest {
    private final Optional<ConnectWebviewsCreateRequestDeviceSelectionMode> deviceSelectionMode;

    private final Optional<String> customRedirectUrl;

    private final Optional<String> customRedirectFailureUrl;

    private final Optional<List<ConnectWebviewsCreateRequestAcceptedProvidersItem>> acceptedProviders;

    private final Optional<ConnectWebviewsCreateRequestProviderCategory> providerCategory;

    private final Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata;

    private ConnectWebviewsCreateRequest(
            Optional<ConnectWebviewsCreateRequestDeviceSelectionMode> deviceSelectionMode,
            Optional<String> customRedirectUrl,
            Optional<String> customRedirectFailureUrl,
            Optional<List<ConnectWebviewsCreateRequestAcceptedProvidersItem>> acceptedProviders,
            Optional<ConnectWebviewsCreateRequestProviderCategory> providerCategory,
            Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata) {
        this.deviceSelectionMode = deviceSelectionMode;
        this.customRedirectUrl = customRedirectUrl;
        this.customRedirectFailureUrl = customRedirectFailureUrl;
        this.acceptedProviders = acceptedProviders;
        this.providerCategory = providerCategory;
        this.customMetadata = customMetadata;
    }

    @JsonProperty("device_selection_mode")
    public Optional<ConnectWebviewsCreateRequestDeviceSelectionMode> getDeviceSelectionMode() {
        return deviceSelectionMode;
    }

    @JsonProperty("custom_redirect_url")
    public Optional<String> getCustomRedirectUrl() {
        return customRedirectUrl;
    }

    @JsonProperty("custom_redirect_failure_url")
    public Optional<String> getCustomRedirectFailureUrl() {
        return customRedirectFailureUrl;
    }

    @JsonProperty("accepted_providers")
    public Optional<List<ConnectWebviewsCreateRequestAcceptedProvidersItem>> getAcceptedProviders() {
        return acceptedProviders;
    }

    @JsonProperty("provider_category")
    public Optional<ConnectWebviewsCreateRequestProviderCategory> getProviderCategory() {
        return providerCategory;
    }

    @JsonProperty("custom_metadata")
    public Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> getCustomMetadata() {
        return customMetadata;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsCreateRequest && equalTo((ConnectWebviewsCreateRequest) other);
    }

    private boolean equalTo(ConnectWebviewsCreateRequest other) {
        return deviceSelectionMode.equals(other.deviceSelectionMode)
                && customRedirectUrl.equals(other.customRedirectUrl)
                && customRedirectFailureUrl.equals(other.customRedirectFailureUrl)
                && acceptedProviders.equals(other.acceptedProviders)
                && providerCategory.equals(other.providerCategory)
                && customMetadata.equals(other.customMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.deviceSelectionMode,
                this.customRedirectUrl,
                this.customRedirectFailureUrl,
                this.acceptedProviders,
                this.providerCategory,
                this.customMetadata);
    }

    @Override
    public String toString() {
        return "ConnectWebviewsCreateRequest{" + "deviceSelectionMode: " + deviceSelectionMode + ", customRedirectUrl: "
                + customRedirectUrl + ", customRedirectFailureUrl: " + customRedirectFailureUrl
                + ", acceptedProviders: " + acceptedProviders + ", providerCategory: " + providerCategory
                + ", customMetadata: " + customMetadata + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<ConnectWebviewsCreateRequestDeviceSelectionMode> deviceSelectionMode = Optional.empty();

        private Optional<String> customRedirectUrl = Optional.empty();

        private Optional<String> customRedirectFailureUrl = Optional.empty();

        private Optional<List<ConnectWebviewsCreateRequestAcceptedProvidersItem>> acceptedProviders = Optional.empty();

        private Optional<ConnectWebviewsCreateRequestProviderCategory> providerCategory = Optional.empty();

        private Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata =
                Optional.empty();

        private Builder() {}

        public Builder from(ConnectWebviewsCreateRequest other) {
            deviceSelectionMode(other.getDeviceSelectionMode());
            customRedirectUrl(other.getCustomRedirectUrl());
            customRedirectFailureUrl(other.getCustomRedirectFailureUrl());
            acceptedProviders(other.getAcceptedProviders());
            providerCategory(other.getProviderCategory());
            customMetadata(other.getCustomMetadata());
            return this;
        }

        @JsonSetter(value = "device_selection_mode", nulls = Nulls.SKIP)
        public Builder deviceSelectionMode(
                Optional<ConnectWebviewsCreateRequestDeviceSelectionMode> deviceSelectionMode) {
            this.deviceSelectionMode = deviceSelectionMode;
            return this;
        }

        public Builder deviceSelectionMode(ConnectWebviewsCreateRequestDeviceSelectionMode deviceSelectionMode) {
            this.deviceSelectionMode = Optional.of(deviceSelectionMode);
            return this;
        }

        @JsonSetter(value = "custom_redirect_url", nulls = Nulls.SKIP)
        public Builder customRedirectUrl(Optional<String> customRedirectUrl) {
            this.customRedirectUrl = customRedirectUrl;
            return this;
        }

        public Builder customRedirectUrl(String customRedirectUrl) {
            this.customRedirectUrl = Optional.of(customRedirectUrl);
            return this;
        }

        @JsonSetter(value = "custom_redirect_failure_url", nulls = Nulls.SKIP)
        public Builder customRedirectFailureUrl(Optional<String> customRedirectFailureUrl) {
            this.customRedirectFailureUrl = customRedirectFailureUrl;
            return this;
        }

        public Builder customRedirectFailureUrl(String customRedirectFailureUrl) {
            this.customRedirectFailureUrl = Optional.of(customRedirectFailureUrl);
            return this;
        }

        @JsonSetter(value = "accepted_providers", nulls = Nulls.SKIP)
        public Builder acceptedProviders(
                Optional<List<ConnectWebviewsCreateRequestAcceptedProvidersItem>> acceptedProviders) {
            this.acceptedProviders = acceptedProviders;
            return this;
        }

        public Builder acceptedProviders(List<ConnectWebviewsCreateRequestAcceptedProvidersItem> acceptedProviders) {
            this.acceptedProviders = Optional.of(acceptedProviders);
            return this;
        }

        @JsonSetter(value = "provider_category", nulls = Nulls.SKIP)
        public Builder providerCategory(Optional<ConnectWebviewsCreateRequestProviderCategory> providerCategory) {
            this.providerCategory = providerCategory;
            return this;
        }

        public Builder providerCategory(ConnectWebviewsCreateRequestProviderCategory providerCategory) {
            this.providerCategory = Optional.of(providerCategory);
            return this;
        }

        @JsonSetter(value = "custom_metadata", nulls = Nulls.SKIP)
        public Builder customMetadata(
                Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        public Builder customMetadata(
                Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>> customMetadata) {
            this.customMetadata = Optional.of(customMetadata);
            return this;
        }

        public ConnectWebviewsCreateRequest build() {
            return new ConnectWebviewsCreateRequest(
                    deviceSelectionMode,
                    customRedirectUrl,
                    customRedirectFailureUrl,
                    acceptedProviders,
                    providerCategory,
                    customMetadata);
        }
    }
}
