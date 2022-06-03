// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A DataFactory compute. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("Databricks")
@Fluent
public final class Databricks extends Compute {
    /*
     * Properties of Databricks
     */
    @JsonProperty(value = "properties")
    private DatabricksProperties properties;

    /**
     * Get the properties property: Properties of Databricks.
     *
     * @return the properties value.
     */
    public DatabricksProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of Databricks.
     *
     * @param properties the properties value to set.
     * @return the Databricks object itself.
     */
    public Databricks withProperties(DatabricksProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Databricks withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Databricks withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Databricks withDisableLocalAuth(Boolean disableLocalAuth) {
        super.withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}