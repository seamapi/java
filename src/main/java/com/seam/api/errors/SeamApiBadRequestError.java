/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.errors;

import com.seam.api.core.SeamApiApiError;

public final class SeamApiBadRequestError extends SeamApiApiError {
    /**
     * The body of the response that triggered the exception.
     */
    private final Object body;

    public SeamApiBadRequestError(Object body) {
        super("BadRequestError", 400, body);
        this.body = body;
    }

    /**
     * @return the body
     */
    @Override
    public Object body() {
        return this.body;
    }
}
