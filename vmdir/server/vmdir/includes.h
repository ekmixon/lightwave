/*
 * Copyright © 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */



/*
 * Module Name: Directory main
 *
 * Filename: includes.h
 *
 * Abstract:
 *
 * Directory main module include file
 *
 */
#ifndef _WIN32
#include <net/if.h>
#include <ifaddrs.h>

#include <config.h>
#include <limits.h>

#include <vmdirsys.h>

#include <sys/time.h>
#include <sys/resource.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <sys/prctl.h>
#include <dirent.h>

// OpenLDAP ber library include files
#include <lber.h>
#include <ldap.h>
#include <ldap_log.h>
#include <lber_pvt.h>
#include <lber-int.h>

#include <lwrpcrt/lwrpcrt.h>
#include <dce/rpc.h>
#include <reg/lwreg.h>
#include <lwstr.h>

#include <vmregconfig.h>

#include <vmdir.h>
#include <vmdirtypes.h>
#include <vmdirdefines.h>
#include <vmdirerrors.h>
#include <vmdirerrorcode.h>
#include <vmdirclient.h>

#include <vmdircommon.h>
#include <srvcommon.h>
#include <schema.h>
#include <vmacl.h>
#include <indexcfg.h>
#include <backend.h>
#include <mdbstore.h>
#include <middlelayer.h>
#include <vmdirserver.h>
#include <replication.h>
#include <vmkdcserver.h>
#include <ldaphead.h>
#include <resthead.h>
#include <vmevent.h>

#include "defines.h"
#include "structs.h"

#include "vmdir_h.h"
#include "vmdirftp_h.h"
#include "vmdirdbcp_h.h"
#include "srp_verifier_h.h"
#include "vmdirsuperlog_h.h"

#include "prototypes.h"
#include "externs.h"

#else

#pragma once

#include "targetver.h"

#include <windows.h>
#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>
#include <stddef.h>
#include <tchar.h>
#include <errno.h>
#include <sys/stat.h>
#include <dce/rpc.h>
#include <assert.h>
#include <Ws2tcpip.h>
#include <Sddl.h>

#include "topdefines.h" // this one has to come before lber.h

// OpenLDAP ber library include files
#include <lber.h>
#include <ldap.h>
#include <ldap_log.h>
#include <lber_pvt.h>
#include <lber-int.h>

#define LW_STRICT_NAMESPACE
#include <lw/types.h>
#include <lw/hash.h>
#include <lw/security-types.h>
#include <lw/lwstr.h>

#include <vmdir.h>
#include <vmdirtypes.h>
#include <vmdirdefines.h>
#include <vmdirerrors.h>
#include <vmdirerrorcode.h>
#include <vmdirclient.h>

#include <vmdircommon.h>

#include <srvcommon.h>
#include <schema.h>
#include <vmacl.h>
#include <indexcfg.h>
#include <backend.h>
#include <mdbstore.h>
#include <middlelayer.h>
#include <replication.h>
#include <vmkdcserver.h>
#include <vmdirserver.h>
#include <ldaphead.h>
#include <vmevent.h>

#include "defines.h"
#include "structs.h"

#include "vmdir_h.h"
#include "vmdirftp_h.h"
#include "vmdirdbcp_h.h"
#include "srp_verifier_h.h"
#include "vmdirsuperlog_h.h"

#include "prototypes.h"

#include "externs.h"

#include "banned.h"

#endif

