// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Workspace */
class WorkspaceImpl implements WorkspaceService {
  private final ApiClient apiClient;

  public WorkspaceImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void delete(Delete request) {
    String path = "/api/2.0/workspace/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public ExportResponse export(Export request) {
    String path = "/api/2.0/workspace/export";
    return apiClient.GET(path, request, ExportResponse.class);
  }

  @Override
  public ObjectInfo getStatus(GetStatus request) {
    String path = "/api/2.0/workspace/get-status";
    return apiClient.GET(path, request, ObjectInfo.class);
  }

  @Override
  public void importContent(Import request) {
    String path = "/api/2.0/workspace/import";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public ListResponse list(List request) {
    String path = "/api/2.0/workspace/list";
    return apiClient.GET(path, request, ListResponse.class);
  }

  @Override
  public void mkdirs(Mkdirs request) {
    String path = "/api/2.0/workspace/mkdirs";
    apiClient.POST(path, request, Void.class);
  }
}