// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.util.Context;

/** Samples for JoinRequests Deny. */
public final class JoinRequestsDenySamples {
    /*
     * x-ms-original-file: specification/education/resource-manager/Microsoft.Education/preview/2021-12-01-preview/examples/JoinRequestApproveAndDeny.json
     */
    /**
     * Sample code: JoinRequestDeny.
     *
     * @param manager Entry point to EducationManager.
     */
    public static void joinRequestDeny(com.azure.resourcemanager.education.EducationManager manager) {
        manager
            .joinRequests()
            .denyWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                "{joinRequestName}",
                Context.NONE);
    }
}