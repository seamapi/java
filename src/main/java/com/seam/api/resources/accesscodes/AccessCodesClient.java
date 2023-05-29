package com.seam.api.resources.accesscodes;

import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdatePutRequest;
import com.seam.api.types.AccessCodesCreateResponse;
import com.seam.api.types.AccessCodesDeleteResponse;
import com.seam.api.types.AccessCodesUpdatePutResponse;

public interface AccessCodesClient {
    AccessCodesCreateResponse accessCodesCreate(AccessCodesCreateRequest request);

    AccessCodesDeleteResponse accessCodesDelete(AccessCodesDeleteRequest request);

    AccessCodesUpdatePutResponse accessCodesUpdatePut(AccessCodesUpdatePutRequest request);
}
