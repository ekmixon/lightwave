/*
 *  Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License.  You may obtain a copy
 *  of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, without
 *  warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

package com.vmware.identity.openidconnect.client;

import java.util.HashMap;
import java.util.Map;

/**
 * OIDC Server Error
 *
 * @author Jun Sun
 */
public enum OIDCServerError {
    INVALID_REQUEST("invalid_request"),
    UNAUTHORIZED_CLIENT("unauthorized_client"),
    INVALID_CLIENT("invalid_client"),
    INVALID_SCOPE("invalid_scope"),
    UNSUPPORTED_RESPONSE_TYPE("unsupported_response_type"),
    UNSUPPORTED_GRANT_TYPE("unsupported_grant_type"),
    INVALID_GRANT("invalid_grant"),
    ACCESS_DENIED("access_denied"),
    SERVER_ERROR("server_error"),
    TEMPORARILY_UNAVAILABLE("temporarily_unavailable");

    private static final Map<String, OIDCServerError> map = new HashMap<String, OIDCServerError>();
    static {
        for (OIDCServerError v : OIDCServerError.values()) {
            map.put(v.getValue(), v);
        }
    }

    private String value;

    private OIDCServerError(String value) {
        this.value = value;
    }

    /**
     * Get OIDC server error value
     *
     * @return                          String value of OIDC server error
     */
    public String getValue() {
        return this.value;
    }

    static OIDCServerError getOIDCServerError(String value) {
        return map.get(value);
    }

}
