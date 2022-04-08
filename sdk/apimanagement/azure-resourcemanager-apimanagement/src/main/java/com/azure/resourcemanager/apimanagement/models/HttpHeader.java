// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HTTP header and it's value. */
@Fluent
public final class HttpHeader {
    /*
     * Header name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Header value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: Header name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Header name.
     *
     * @param name the name value to set.
     * @return the HttpHeader object itself.
     */
    public HttpHeader withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Header value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Header value.
     *
     * @param value the value value to set.
     * @return the HttpHeader object itself.
     */
    public HttpHeader withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model HttpHeader"));
        }
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model HttpHeader"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HttpHeader.class);
}