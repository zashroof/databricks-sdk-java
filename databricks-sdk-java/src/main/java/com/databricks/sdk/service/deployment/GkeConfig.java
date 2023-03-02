// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The configurations for the GKE cluster of a Databricks workspace.
 */
@Generated("databricks-sdk-generator")
public class GkeConfig {
    /**
     * Specifies the network connectivity types for the GKE nodes and the GKE
     * master network. \n
     * 
     * Set to `PRIVATE_NODE_PUBLIC_MASTER` for a private GKE cluster for the
     * workspace. The GKE nodes will not have public IPs.\n
     * 
     * Set to `PUBLIC_NODE_PUBLIC_MASTER` for a public GKE cluster. The nodes of
     * a public GKE cluster have public IP addresses.
     */
    @JsonProperty("connectivity_type")
    private GkeConfigConnectivityType connectivityType;
    
    /**
     * The IP range from which to allocate GKE cluster master resources. This
     * field will be ignored if GKE private cluster is not enabled.
     * 
     * It must be exactly as big as `/28`.
     */
    @JsonProperty("master_ip_range")
    private String masterIpRange;
    
    public GkeConfig setConnectivityType(GkeConfigConnectivityType connectivityType) {
        this.connectivityType = connectivityType;
        return this;
    }

    public GkeConfigConnectivityType getConnectivityType() {
        return connectivityType;
    }
    
    public GkeConfig setMasterIpRange(String masterIpRange) {
        this.masterIpRange = masterIpRange;
        return this;
    }

    public String getMasterIpRange() {
        return masterIpRange;
    }
    
}
