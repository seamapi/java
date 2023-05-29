package com.seam.api;

import com.seam.api.core.ClientOptions;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdatePutRequest;
import com.seam.api.resources.actionattempts.requests.ActionAttemptsGetRequest;
import com.seam.api.types.AccessCodesUpdatePutResponse;
import com.seam.api.types.ActionAttemptsGetResponse;
import com.seam.api.types.ActionAttemptsGetResponseActionAttemptSuccess;
import java.util.Map;

public class AccessCodesClient extends com.seam.api.resources.accesscodes.AccessCodesClient {

    private final SeamApiClient rootClient;

    public AccessCodesClient(ClientOptions clientOptions, SeamApiClient rootClient) {
        super(clientOptions);
        this.rootClient = rootClient;
    }

    public Object updateAndWaitUntilReady(AccessCodesUpdatePutRequest request) throws InterruptedException {
        AccessCodesUpdatePutResponse response = updatePut(request);

        if (response.getActionAttempt().isSuccess()) {
            String actionAttemptId =
                    response.getActionAttempt().getSuccess().get().getActionAttemptId();
            var actionAttempt = pollUntilReady(actionAttemptId);
            if (actionAttempt.getResult().isPresent()
                    && actionAttempt.getResult().get() instanceof Map) {
                var accessCode = ((Map<String, Object>) actionAttempt.getResult().get()).get("access_code");
                return accessCode;
            }
        }

        throw new RuntimeException("AccessCodeUpdate failed. See response=" + response);
    }

    private ActionAttemptsGetResponseActionAttemptSuccess pollUntilReady(String actionAttemptId)
            throws InterruptedException {
        ActionAttemptsGetResponse response = null;
        while (response == null || response.getActionAttempt().isPending()) {
            response = rootClient
                    .actionAttempts()
                    .get(ActionAttemptsGetRequest.builder()
                            .actionAttemptId(actionAttemptId)
                            .build());
            Thread.sleep(2500);
        }

        if (response.getActionAttempt().isError()) {
            var errorResponse = response.getActionAttempt().getError().get();
            throw new ActionAttemptFailedException(
                    errorResponse.getActionAttemptId(), errorResponse.getError().getMessage());
        }

        return response.getActionAttempt().getSuccess().get();
    }

    public static class ActionAttemptFailedException extends RuntimeException {

        public final String actionAttemptId;
        public final String errorMessage;

        public ActionAttemptFailedException(String actionAttemptId, String errorMessage) {
            this.actionAttemptId = actionAttemptId;
            this.errorMessage = errorMessage;
        }
    }
}
