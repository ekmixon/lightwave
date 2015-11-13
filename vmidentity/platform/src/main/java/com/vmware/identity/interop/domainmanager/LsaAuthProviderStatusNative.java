/*
 * Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.vmware.identity.interop.domainmanager;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class LsaAuthProviderStatusNative extends Structure
{
    public String pszId;
    public int mode;
    public int subMode;
    public int status;
    public String pszDomain;
    public String pszDomainSid;
    public String pszForest;
    public String pszSite;
    public String pszCell;
    public int dwNetworkCheckInterval;
    public int dwNumTrustedDomains;
    public Pointer pTrustedDomainInfoArray;

    public LsaAuthProviderStatusNative(Pointer p)
    {
        useMemory(p);
        read();
    }

    @Override
    protected List<String> getFieldOrder()
    {
        return Arrays.asList(new String[] {
                "pszId", "mode", "subMode", "status", "pszDomain",
                "pszDomainSid", "pszForest", "pszSite",
                "pszCell", "dwNetworkCheckInterval", "dwNumTrustedDomains", "pTrustedDomainInfoArray"
        });
    }
}
