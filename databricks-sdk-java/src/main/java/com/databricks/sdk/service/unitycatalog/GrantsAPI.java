// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * In Unity Catalog, data is secure by default. Initially, users have no access to data in a
 * metastore. Access can be granted by either a metastore admin, the owner of an object, or the
 * owner of the catalog or schema that contains the object. Securable objects in Unity Catalog are
 * hierarchical and privileges are inherited downward.
 *
 * <p>Securable objects in Unity Catalog are hierarchical and privileges are inherited downward.
 * This means that granting a privilege on the catalog automatically grants the privilege to all
 * current and future objects within the catalog. Similarly, privileges granted on a schema are
 * inherited by all current and future objects within that schema.
 */
public class GrantsAPI {
  private final GrantsService impl;

  /** Regular-use constructor */
  public GrantsAPI(ApiClient apiClient) {
    impl = new GrantsImpl(apiClient);
  }

  /** Constructor for mocks */
  public GrantsAPI(GrantsService mock) {
    impl = mock;
  }

  public PermissionsList get(SecurableType securableType, String fullName) {
    return get(new GetGrantRequest().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Get permissions.
   *
   * <p>Gets the permissions for a securable.
   */
  public PermissionsList get(GetGrantRequest request) {
    return impl.get(request);
  }

  public EffectivePermissionsList getEffective(SecurableType securableType, String fullName) {
    return getEffective(
        new GetEffectiveRequest().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Get effective permissions.
   *
   * <p>Gets the effective permissions for a securable.
   */
  public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
    return impl.getEffective(request);
  }

  public PermissionsList update(SecurableType securableType, String fullName) {
    return update(new UpdatePermissions().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Update permissions.
   *
   * <p>Updates the permissions for a securable.
   */
  public PermissionsList update(UpdatePermissions request) {
    return impl.update(request);
  }

  public GrantsService impl() {
    return impl;
  }
}
