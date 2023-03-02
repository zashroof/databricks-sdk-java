// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EndpointState {
    /**
     * The state of an endpoint's config update. This informs the user if the
     * pending_config is in progress, if the update failed, or if there is no
     * update in progress. Note that if the endpoint's config_update state value
     * is IN_PROGRESS, another update can not be made until the update completes
     * or fails."
     */
    @JsonProperty("config_update")
    private EndpointStateConfigUpdate configUpdate;
    
    /**
     * The state of an endpoint, indicating whether or not the endpoint is
     * queryable. An endpoint is READY if all of the served models in its active
     * configuration are ready. If any of the actively served models are in a
     * non-ready state, the endpoint state will be NOT_READY.
     */
    @JsonProperty("ready")
    private EndpointStateReady ready;
    
    public EndpointState setConfigUpdate(EndpointStateConfigUpdate configUpdate) {
        this.configUpdate = configUpdate;
        return this;
    }

    public EndpointStateConfigUpdate getConfigUpdate() {
        return configUpdate;
    }
    
    public EndpointState setReady(EndpointStateReady ready) {
        this.ready = ready;
        return this;
    }

    public EndpointStateReady getReady() {
        return ready;
    }
    
}
