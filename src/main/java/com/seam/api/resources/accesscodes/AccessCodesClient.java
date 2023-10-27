/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.accesscodes;

import com.seam.api.core.ApiError;
import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateMultipleRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesGetRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesListRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesPullBackupAccessCodeRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdateRequest;
import com.seam.api.resources.accesscodes.simulate.SimulateClient;
import com.seam.api.resources.accesscodes.unmanaged.UnmanagedClient;
import com.seam.api.types.AccessCode;
import com.seam.api.types.AccessCodesCreateMultipleResponse;
import com.seam.api.types.AccessCodesCreateResponse;
import com.seam.api.types.AccessCodesDeleteResponse;
import com.seam.api.types.AccessCodesGetResponse;
import com.seam.api.types.AccessCodesListResponse;
import com.seam.api.types.AccessCodesPullBackupAccessCodeResponse;
import com.seam.api.types.AccessCodesUpdateResponse;
import com.seam.api.types.ActionAttempt;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AccessCodesClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<SimulateClient> simulateClient;

    protected final Supplier<UnmanagedClient> unmanagedClient;

    public AccessCodesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.simulateClient = Suppliers.memoize(() -> new SimulateClient(clientOptions));
        this.unmanagedClient = Suppliers.memoize(() -> new UnmanagedClient(clientOptions));
    }

    public AccessCode create(AccessCodesCreateRequest request) {
        return create(request, null);
    }

    public AccessCode create(AccessCodesCreateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/create")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                AccessCodesCreateResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AccessCodesCreateResponse.class);
                return parsedResponse.getAccessCode();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<AccessCode> createMultiple(AccessCodesCreateMultipleRequest request) {
        return createMultiple(request, null);
    }

    public List<AccessCode> createMultiple(AccessCodesCreateMultipleRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/create_multiple")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                AccessCodesCreateMultipleResponse parsedResponse = ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), AccessCodesCreateMultipleResponse.class);
                return parsedResponse.getAccessCodes();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ActionAttempt delete(AccessCodesDeleteRequest request) {
        return delete(request, null);
    }

    public ActionAttempt delete(AccessCodesDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/delete")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                AccessCodesDeleteResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AccessCodesDeleteResponse.class);
                return parsedResponse.getActionAttempt();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCode getById(String accessCodeId) {
        return get(AccessCodesGetRequest.builder().accessCodeId(accessCodeId).build());
    }

    public AccessCode get(AccessCodesGetRequest request) {
        return get(request, null);
    }

    public AccessCode get(AccessCodesGetRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/get")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                AccessCodesGetResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AccessCodesGetResponse.class);
                return parsedResponse.getAccessCode();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCode get() {
        return get(AccessCodesGetRequest.builder().build());
    }

    public List<AccessCode> list(AccessCodesListRequest request) {
        return list(request, null);
    }

    public List<AccessCode> list(AccessCodesListRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/list")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                AccessCodesListResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AccessCodesListResponse.class);
                return parsedResponse.getAccessCodes();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCode pullBackupAccessCode(AccessCodesPullBackupAccessCodeRequest request) {
        return pullBackupAccessCode(request, null);
    }

    public AccessCode pullBackupAccessCode(
            AccessCodesPullBackupAccessCodeRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/pull_backup_access_code")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                AccessCodesPullBackupAccessCodeResponse parsedResposne = ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), AccessCodesPullBackupAccessCodeResponse.class);
                return parsedResposne.getBackupAccessCode();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ActionAttempt update(AccessCodesUpdateRequest request) {
        return update(request, null);
    }

    public ActionAttempt update(AccessCodesUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/update")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                AccessCodesUpdateResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AccessCodesUpdateResponse.class);
                return parsedResponse.getActionAttempt();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public SimulateClient simulate() {
        return this.simulateClient.get();
    }

    public UnmanagedClient unmanaged() {
        return this.unmanagedClient.get();
    }
}
