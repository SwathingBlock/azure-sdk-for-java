// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Databricks Compute Secrets. */
@Fluent
public class DatabricksComputeSecretsProperties {
    /*
     * access token for databricks account.
     */
    @JsonProperty(value = "databricksAccessToken")
    private String databricksAccessToken;

    /**
     * Get the databricksAccessToken property: access token for databricks account.
     *
     * @return the databricksAccessToken value.
     */
    public String databricksAccessToken() {
        return this.databricksAccessToken;
    }

    /**
     * Set the databricksAccessToken property: access token for databricks account.
     *
     * @param databricksAccessToken the databricksAccessToken value to set.
     * @return the DatabricksComputeSecretsProperties object itself.
     */
    public DatabricksComputeSecretsProperties withDatabricksAccessToken(String databricksAccessToken) {
        this.databricksAccessToken = databricksAccessToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}