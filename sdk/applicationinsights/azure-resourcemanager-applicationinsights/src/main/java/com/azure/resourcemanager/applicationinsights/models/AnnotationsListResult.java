// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.applicationinsights.fluent.models.AnnotationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Annotations list result. */
@Immutable
public final class AnnotationsListResult {
    /*
     * An array of annotations.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<AnnotationInner> value;

    /**
     * Get the value property: An array of annotations.
     *
     * @return the value value.
     */
    public List<AnnotationInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
