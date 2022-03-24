// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for ContentKeyPolicies Get. */
public final class ContentKeyPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/content-key-policies-get-by-name.json
     */
    /**
     * Sample code: Get a Content Key Policy by name.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void getAContentKeyPolicyByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .getWithResponse("contoso", "contosomedia", "PolicyWithMultipleOptions", Context.NONE);
    }
}