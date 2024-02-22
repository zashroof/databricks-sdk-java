// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Personal Compute enablement setting lets you control which users can use the Personal Compute
 * default policy to create compute resources. By default all users in all workspaces have access
 * (ON), but you can change the setting to instead let individual workspaces configure access
 * control (DELEGATE).
 *
 * <p>There is only one instance of this setting per account. Since this setting has a default
 * value, this setting is present on all accounts even though it's never set on a given account.
 * Deletion reverts the value of the setting back to the default value.
 */
@Generated
public class PersonalComputeEnablementAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PersonalComputeEnablementAPI.class);

  private final PersonalComputeEnablementService impl;

  /** Regular-use constructor */
  public PersonalComputeEnablementAPI(ApiClient apiClient) {
    impl = new PersonalComputeEnablementImpl(apiClient);
  }

  /** Constructor for mocks */
  public PersonalComputeEnablementAPI(PersonalComputeEnablementService mock) {
    impl = mock;
  }

  /**
   * Delete Personal Compute setting.
   *
   * <p>Reverts back the Personal Compute setting value to default (ON)
   */
  public DeletePersonalComputeSettingResponse deletePersonalComputeSetting(
      DeletePersonalComputeSettingRequest request) {
    return impl.deletePersonalComputeSetting(request);
  }

  /**
   * Get Personal Compute setting.
   *
   * <p>Gets the value of the Personal Compute setting.
   */
  public PersonalComputeSetting getPersonalComputeSetting(
      GetPersonalComputeSettingRequest request) {
    return impl.getPersonalComputeSetting(request);
  }

  public PersonalComputeSetting updatePersonalComputeSetting(
      boolean allowMissing, PersonalComputeSetting setting, String fieldMask) {
    return updatePersonalComputeSetting(
        new UpdatePersonalComputeSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update Personal Compute setting.
   *
   * <p>Updates the value of the Personal Compute setting.
   */
  public PersonalComputeSetting updatePersonalComputeSetting(
      UpdatePersonalComputeSettingRequest request) {
    return impl.updatePersonalComputeSetting(request);
  }

  public PersonalComputeEnablementService impl() {
    return impl;
  }
}
