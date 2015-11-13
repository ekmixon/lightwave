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

package com.vmware.identity.saml;

/**
 * Indicates for missing or invalid principal.
 */
public final class InvalidPrincipalException extends RuntimeException {

   private static final long serialVersionUID = 6655784496093813224L;

   public InvalidPrincipalException(String message) {
      super(message);
   }

   public InvalidPrincipalException(Throwable cause) {
      super(cause);
   }

   public InvalidPrincipalException(String message, Throwable cause) {
      super(message, cause);
   }

}
