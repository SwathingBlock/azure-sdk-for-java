// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.azurestackhci.models.ArcSettingAggregateState;
import com.azure.resourcemanager.azurestackhci.models.PerNodeState;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ArcSetting details. */
@Fluent
public final class ArcSettingInner extends ProxyResource {
    /*
     * System data of ArcSetting resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * ArcSetting properties.
     */
    @JsonProperty(value = "properties")
    private ArcSettingProperties innerProperties;

    /**
     * Get the systemData property: System data of ArcSetting resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: ArcSetting properties.
     *
     * @return the innerProperties value.
     */
    private ArcSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Provisioning state of the ArcSetting proxy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid Compute
     * Machine resources.
     *
     * @return the arcInstanceResourceGroup value.
     */
    public String arcInstanceResourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().arcInstanceResourceGroup();
    }

    /**
     * Set the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid Compute
     * Machine resources.
     *
     * @param arcInstanceResourceGroup the arcInstanceResourceGroup value to set.
     * @return the ArcSettingInner object itself.
     */
    public ArcSettingInner withArcInstanceResourceGroup(String arcInstanceResourceGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcSettingProperties();
        }
        this.innerProperties().withArcInstanceResourceGroup(arcInstanceResourceGroup);
        return this;
    }

    /**
     * Get the aggregateState property: Aggregate state of Arc agent across the nodes in this HCI cluster.
     *
     * @return the aggregateState value.
     */
    public ArcSettingAggregateState aggregateState() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregateState();
    }

    /**
     * Get the perNodeDetails property: State of Arc agent in each of the nodes.
     *
     * @return the perNodeDetails value.
     */
    public List<PerNodeState> perNodeDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().perNodeDetails();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}