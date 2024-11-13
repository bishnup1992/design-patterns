package com.learnwithbishnu.design_patterns.abstractfactory2.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResourceResponse {
    private String message;
    private String instanceId;
    private String instanceType;
    private String storageId;
    private String storageCapacity;
}
