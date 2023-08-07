package com.seam.api.resources.events;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.events.requests.EventsGetRequest;
import com.seam.api.resources.events.requests.EventsListRequest;
import com.seam.api.types.EventsGetResponse;
import com.seam.api.types.EventsListResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EventsClient {
    protected final ClientOptions clientOptions;

    public EventsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public EventsGetResponse get(EventsGetRequest request) {
        return get(request, null);
    }

    public EventsGetResponse get(EventsGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getEventId().isPresent()) {
            _requestBodyProperties.put("event_id", request.getEventId());
        }
        if (request.getEventType().isPresent()) {
            _requestBodyProperties.put("event_type", request.getEventType());
        }
        if (request.getDeviceId().isPresent()) {
            _requestBodyProperties.put("device_id", request.getDeviceId());
        }
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), EventsGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public EventsListResponse list(EventsListRequest request) {
        return list(request, null);
    }

    public EventsListResponse list(EventsListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getSince().isPresent()) {
            _requestBodyProperties.put("since", request.getSince());
        }
        if (request.getBetween().isPresent()) {
            _requestBodyProperties.put("between", request.getBetween());
        }
        if (request.getDeviceId().isPresent()) {
            _requestBodyProperties.put("device_id", request.getDeviceId());
        }
        if (request.getDeviceIds().isPresent()) {
            _requestBodyProperties.put("device_ids", request.getDeviceIds());
        }
        if (request.getAccessCodeId().isPresent()) {
            _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
        }
        if (request.getAccessCodeIds().isPresent()) {
            _requestBodyProperties.put("access_code_ids", request.getAccessCodeIds());
        }
        if (request.getEventType().isPresent()) {
            _requestBodyProperties.put("event_type", request.getEventType());
        }
        if (request.getEventTypes().isPresent()) {
            _requestBodyProperties.put("event_types", request.getEventTypes());
        }
        if (request.getConnectedAccountId().isPresent()) {
            _requestBodyProperties.put("connected_account_id", request.getConnectedAccountId());
        }
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), EventsListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
