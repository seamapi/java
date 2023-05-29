package com.seam.api;

import com.seam.api.resources.accesscodes.AccessCodesClient;
import com.seam.api.resources.actionattempts.ActionAttemptsClient;

public interface SeamApiClient {
    AccessCodesClient accessCodes();

    ActionAttemptsClient actionAttempts();

    static SeamApiClientBuilder builder() {
        return new SeamApiClientBuilder();
    }
}
