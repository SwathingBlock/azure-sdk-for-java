// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.models.AnomalyAlert;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AlertResultList model. */
@Fluent
public final class AlertResultList {
    /*
     * The @nextLink property.
     */
    @JsonProperty(value = "@nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private List<AnomalyAlert> value;

    /** Creates an instance of AlertResultList class. */
    public AlertResultList() {}

    /**
     * Get the nextLink property: The @nextLink property.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<AnomalyAlert> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the AlertResultList object itself.
     */
    public AlertResultList setValue(List<AnomalyAlert> value) {
        this.value = value;
        return this;
    }
}
