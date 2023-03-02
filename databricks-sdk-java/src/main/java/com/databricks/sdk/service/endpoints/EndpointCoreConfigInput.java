// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EndpointCoreConfigInput {
    /**
     * The name of the serving endpoint to update. This field is required.
     */
    
    private String name;
    
    /**
     * A list of served models for the endpoint to serve. A serving endpoint can
     * have up to 10 served models.
     */
    @JsonProperty("served_models")
    private java.util.List<ServedModelInput> servedModels;
    
    /**
     * The traffic config defining how invocations to the serving endpoint
     * should be routed.
     */
    @JsonProperty("traffic_config")
    private TrafficConfig trafficConfig;
    
    public EndpointCoreConfigInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public EndpointCoreConfigInput setServedModels(java.util.List<ServedModelInput> servedModels) {
        this.servedModels = servedModels;
        return this;
    }

    public java.util.List<ServedModelInput> getServedModels() {
        return servedModels;
    }
    
    public EndpointCoreConfigInput setTrafficConfig(TrafficConfig trafficConfig) {
        this.trafficConfig = trafficConfig;
        return this;
    }

    public TrafficConfig getTrafficConfig() {
        return trafficConfig;
    }
    
}
