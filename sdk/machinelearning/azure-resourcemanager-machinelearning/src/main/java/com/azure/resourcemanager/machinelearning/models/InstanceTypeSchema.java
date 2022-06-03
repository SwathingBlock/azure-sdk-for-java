// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Instance type schema. */
@Fluent
public final class InstanceTypeSchema {
    /*
     * Node Selector
     */
    @JsonProperty(value = "nodeSelector")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> nodeSelector;

    /*
     * Resource requests/limits for this instance type
     */
    @JsonProperty(value = "resources")
    private InstanceTypeSchemaResources resources;

    /**
     * Get the nodeSelector property: Node Selector.
     *
     * @return the nodeSelector value.
     */
    public Map<String, String> nodeSelector() {
        return this.nodeSelector;
    }

    /**
     * Set the nodeSelector property: Node Selector.
     *
     * @param nodeSelector the nodeSelector value to set.
     * @return the InstanceTypeSchema object itself.
     */
    public InstanceTypeSchema withNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    /**
     * Get the resources property: Resource requests/limits for this instance type.
     *
     * @return the resources value.
     */
    public InstanceTypeSchemaResources resources() {
        return this.resources;
    }

    /**
     * Set the resources property: Resource requests/limits for this instance type.
     *
     * @param resources the resources value to set.
     * @return the InstanceTypeSchema object itself.
     */
    public InstanceTypeSchema withResources(InstanceTypeSchemaResources resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resources() != null) {
            resources().validate();
        }
    }
}