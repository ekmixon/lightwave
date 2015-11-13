/*
 *  Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *   use this file except in compliance with the License.  You may obtain a copy
 *   of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS, without
 *   warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 *   License for the specific language governing permissions and limitations
 *   under the License.
 */
package com.vmware.identity.wstrust.client.impl;

import org.w3c.dom.Element;

import com.vmware.identity.wstrust.client.Credential;
import com.vmware.identity.wstrust.client.SecurityTokenServiceConfig;
import com.vmware.identity.wstrust.client.TokenSpec;

/**
 * This class represents the factory implementation for creating the
 * {@link RequestParametersValidator}, {@link RequestBuilder},
 * {@link ResponseHandler} and {@link WsSecuritySignature} for request token
 * with certificate authentication.
 *
 * @param <Element>
 *            Type of the response from the Security Token Service
 */
class AcquireTokenByCertificateParserFactory extends RequestParserAbstractFactory<Element> {

    public AcquireTokenByCertificateParserFactory(SecurityTokenServiceConfig config) {
        super(config);
    }

    @Override
    public RequestParametersValidator createRequestParametersValidator() {
        return new CertificateParametersValidator(stsConfig);
    }

    @Override
    public RequestBuilder createRequestBuilder(Credential clientCredential, TokenSpec tokenSpec) {
        return new AcquireTokenByCertificateRequestBuilder(tokenSpec, jaxbContext,
                stsConfig.getRequestValidityInSeconds());
    }

    @Override
    public ResponseHandler<Element> createResponseHandler() {
        return new ExtractTokenResponseHandler(jaxbContext);
    }

    @Override
    public WsSecuritySignature createWsSecuritySignature(Credential clientCredential, TokenSpec tokenSpec) {

        return getWsDefaultSecuritySignature(tokenSpec);
    }
}
