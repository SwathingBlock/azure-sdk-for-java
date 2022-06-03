// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Counts of various compute node states on the amlCompute. */
@Immutable
public final class NodeStateCounts {
    /*
     * Idle node count. Number of compute nodes in idle state.
     */
    @JsonProperty(value = "idleNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer idleNodeCount;

    /*
     * Running node count. Number of compute nodes which are running jobs.
     */
    @JsonProperty(value = "runningNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer runningNodeCount;

    /*
     * Preparing node count. Number of compute nodes which are being prepared.
     */
    @JsonProperty(value = "preparingNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer preparingNodeCount;

    /*
     * Unusable node count. Number of compute nodes which are in unusable
     * state.
     */
    @JsonProperty(value = "unusableNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer unusableNodeCount;

    /*
     * Leaving node count. Number of compute nodes which are leaving the
     * amlCompute.
     */
    @JsonProperty(value = "leavingNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer leavingNodeCount;

    /*
     * Preempted node count. Number of compute nodes which are in preempted
     * state.
     */
    @JsonProperty(value = "preemptedNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer preemptedNodeCount;

    /**
     * Get the idleNodeCount property: Idle node count. Number of compute nodes in idle state.
     *
     * @return the idleNodeCount value.
     */
    public Integer idleNodeCount() {
        return this.idleNodeCount;
    }

    /**
     * Get the runningNodeCount property: Running node count. Number of compute nodes which are running jobs.
     *
     * @return the runningNodeCount value.
     */
    public Integer runningNodeCount() {
        return this.runningNodeCount;
    }

    /**
     * Get the preparingNodeCount property: Preparing node count. Number of compute nodes which are being prepared.
     *
     * @return the preparingNodeCount value.
     */
    public Integer preparingNodeCount() {
        return this.preparingNodeCount;
    }

    /**
     * Get the unusableNodeCount property: Unusable node count. Number of compute nodes which are in unusable state.
     *
     * @return the unusableNodeCount value.
     */
    public Integer unusableNodeCount() {
        return this.unusableNodeCount;
    }

    /**
     * Get the leavingNodeCount property: Leaving node count. Number of compute nodes which are leaving the amlCompute.
     *
     * @return the leavingNodeCount value.
     */
    public Integer leavingNodeCount() {
        return this.leavingNodeCount;
    }

    /**
     * Get the preemptedNodeCount property: Preempted node count. Number of compute nodes which are in preempted state.
     *
     * @return the preemptedNodeCount value.
     */
    public Integer preemptedNodeCount() {
        return this.preemptedNodeCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}