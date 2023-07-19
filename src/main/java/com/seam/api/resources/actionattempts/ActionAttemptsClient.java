package com.seam.api.resources.actionattempts;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.actionattempts.requests.ActionAttemptsGetRequest;
import com.seam.api.types.ActionAttemptsGetResponse;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ActionAttemptsClient {
    protected final ClientOptions clientOptions;

    public ActionAttemptsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ActionAttemptsGetResponse actionAttemptsGet(ActionAttemptsGetRequest request) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("action_attempts/get");
        _httpUrl.addQueryParameter("action_attempt_id", request.getActionAttemptId());
        RequestBody _requestBody = null;
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl.build())
                .method("GET", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ActionAttemptsGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
