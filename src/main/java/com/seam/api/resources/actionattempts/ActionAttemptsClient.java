package com.seam.api.resources.actionattempts;

import com.seam.api.resources.actionattempts.requests.ActionAttemptsGetRequest;
import com.seam.api.types.ActionAttemptsGetResponse;

public interface ActionAttemptsClient {
    ActionAttemptsGetResponse get(ActionAttemptsGetRequest request);
}
