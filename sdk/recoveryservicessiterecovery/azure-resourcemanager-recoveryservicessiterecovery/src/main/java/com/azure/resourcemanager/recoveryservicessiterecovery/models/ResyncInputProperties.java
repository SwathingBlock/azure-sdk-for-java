// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resync input properties. */
@Fluent
public final class ResyncInputProperties {
    /*
     * The provider specific details.
     */
    @JsonProperty(value = "providerSpecificDetails", required = true)
    private ResyncProviderSpecificInput providerSpecificDetails;

    /** Creates an instance of ResyncInputProperties class. */
    public ResyncInputProperties() {
    }

    /**
     * Get the providerSpecificDetails property: The provider specific details.
     *
     * @return the providerSpecificDetails value.
     */
    public ResyncProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific details.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the ResyncInputProperties object itself.
     */
    public ResyncInputProperties withProviderSpecificDetails(ResyncProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property providerSpecificDetails in model ResyncInputProperties"));
        } else {
            providerSpecificDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResyncInputProperties.class);
}
