// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.EntityClient;
import com.azure.analytics.purview.catalog.EntityClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityAddCustomAttribute {
    public static void main(String[] args) {
        EntityClient entityClient =
                new EntityClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.entitycreateorupdate.entityaddcustomattribute
        BinaryData entity =
                BinaryData.fromString(
                        "{\"entity\":{\"attributes\":{\"name\":\"ExampleStorageAccount\",\"description\":null,\"createTime\":0,\"modifiedTime\":0,\"owner\":\"ExampleOwner\",\"publicAccessLevel\":null,\"qualifiedName\":\"https://exampleaccount.core.windows.net\"},\"customAttributes\":{\"custAttr1\":\"attr1\",\"custAttr2\":\"attr2\"},\"typeName\":\"azure_storage_account\"},\"referredEntities\":{}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = entityClient.createOrUpdateWithResponse(entity, requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.entitycreateorupdate.entityaddcustomattribute
    }
}