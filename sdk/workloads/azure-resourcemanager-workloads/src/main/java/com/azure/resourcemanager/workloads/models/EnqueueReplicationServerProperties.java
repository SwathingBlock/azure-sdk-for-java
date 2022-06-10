// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the SAP ERS Server properties. */
@Immutable
public final class EnqueueReplicationServerProperties {
    /*
     * Defines the type of Enqueue Replication Server.
     */
    @JsonProperty(value = "ersVersion", access = JsonProperty.Access.WRITE_ONLY)
    private EnqueueReplicationServerType ersVersion;

    /*
     * The ERS server instance id.
     */
    @JsonProperty(value = "instanceNo", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceNo;

    /*
     * The ERS server SAP host name.
     */
    @JsonProperty(value = "hostname", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The ERS server SAP kernel version.
     */
    @JsonProperty(value = "kernelVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kernelVersion;

    /*
     * The ERS server SAP kernel patch.
     */
    @JsonProperty(value = "kernelPatch", access = JsonProperty.Access.WRITE_ONLY)
    private String kernelPatch;

    /*
     * The ERS server SAP IP Address.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /*
     * Defines the SAP Instance health.
     */
    @JsonProperty(value = "health", access = JsonProperty.Access.WRITE_ONLY)
    private SapHealthState health;

    /**
     * Get the ersVersion property: Defines the type of Enqueue Replication Server.
     *
     * @return the ersVersion value.
     */
    public EnqueueReplicationServerType ersVersion() {
        return this.ersVersion;
    }

    /**
     * Get the instanceNo property: The ERS server instance id.
     *
     * @return the instanceNo value.
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Get the hostname property: The ERS server SAP host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the kernelVersion property: The ERS server SAP kernel version.
     *
     * @return the kernelVersion value.
     */
    public String kernelVersion() {
        return this.kernelVersion;
    }

    /**
     * Get the kernelPatch property: The ERS server SAP kernel patch.
     *
     * @return the kernelPatch value.
     */
    public String kernelPatch() {
        return this.kernelPatch;
    }

    /**
     * Get the ipAddress property: The ERS server SAP IP Address.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the health property: Defines the SAP Instance health.
     *
     * @return the health value.
     */
    public SapHealthState health() {
        return this.health;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}