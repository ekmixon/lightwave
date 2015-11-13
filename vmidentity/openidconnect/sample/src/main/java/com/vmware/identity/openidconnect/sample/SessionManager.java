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

package com.vmware.identity.openidconnect.sample;

import java.util.concurrent.ConcurrentHashMap;

import com.vmware.identity.openidconnect.client.OIDCTokens;

/**
 * @author Yehia Zayour
 */
public class SessionManager {
    private final ConcurrentHashMap<String, OIDCTokens> map;

    public SessionManager() {
        this.map = new ConcurrentHashMap<String, OIDCTokens>();
    }

    public void add(String sessionId, OIDCTokens tokens) {
        this.map.put(sessionId, tokens);
    }

    public void remove(String sessionId) {
        this.map.remove(sessionId);
    }

    public OIDCTokens get(String sessionId) {
        return this.map.get(sessionId);
    }
}
