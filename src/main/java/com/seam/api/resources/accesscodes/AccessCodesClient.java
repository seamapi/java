package com.seam.api.resources.accesscodes;

import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdatePutRequest;
import com.seam.api.types.AccessCodesCreateResponse;
import com.seam.api.types.AccessCodesDeleteResponse;
import com.seam.api.types.AccessCodesUpdatePutResponse;

public interface AccessCodesClient {
    AccessCodesCreateResponse create(AccessCodesCreateRequest request);

    AccessCodesDeleteResponse delete(AccessCodesDeleteRequest request);

    AccessCodesUpdatePutResponse updatePut(AccessCodesUpdatePutRequest request);
}
