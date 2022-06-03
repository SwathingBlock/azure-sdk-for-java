// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchDeploymentDataInner;
import com.azure.resourcemanager.machinelearning.models.PartialBatchDeploymentPartialTrackedResource;

/** An instance of this class provides access to all the operations defined in BatchDeploymentsClient. */
public interface BatchDeploymentsClient {
    /**
     * Lists Batch inference deployments in the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of BatchDeployment entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BatchDeploymentDataInner> list(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Lists Batch inference deployments in the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param orderBy Ordering of list.
     * @param top Top of list.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of BatchDeployment entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BatchDeploymentDataInner> list(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String orderBy,
        Integer top,
        String skip,
        Context context);

    /**
     * Delete Batch Inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName Inference deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Delete Batch Inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName Inference deployment identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Delete Batch Inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName Inference deployment identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Delete Batch Inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName Inference deployment identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Gets a batch inference deployment by id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName The identifier for the Batch deployments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference deployment by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchDeploymentDataInner get(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Gets a batch inference deployment by id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Endpoint name.
     * @param deploymentName The identifier for the Batch deployments.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a batch inference deployment by id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BatchDeploymentDataInner> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Update a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchDeploymentDataInner>, BatchDeploymentDataInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialBatchDeploymentPartialTrackedResource body);

    /**
     * Update a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchDeploymentDataInner>, BatchDeploymentDataInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialBatchDeploymentPartialTrackedResource body,
        Context context);

    /**
     * Update a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchDeploymentDataInner update(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialBatchDeploymentPartialTrackedResource body);

    /**
     * Update a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchDeploymentDataInner update(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialBatchDeploymentPartialTrackedResource body,
        Context context);

    /**
     * Creates/updates a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchDeploymentDataInner>, BatchDeploymentDataInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        BatchDeploymentDataInner body);

    /**
     * Creates/updates a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BatchDeploymentDataInner>, BatchDeploymentDataInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        BatchDeploymentDataInner body,
        Context context);

    /**
     * Creates/updates a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchDeploymentDataInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        BatchDeploymentDataInner body);

    /**
     * Creates/updates a batch inference deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The identifier for the Batch inference deployment.
     * @param body Batch inference deployment definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BatchDeploymentDataInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        BatchDeploymentDataInner body,
        Context context);
}