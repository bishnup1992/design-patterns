package com.learnwithbishnu.design_patterns.abstractfactory2.model;

import com.learnwithbishnu.design_patterns.abstractfactory2.service.Instance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResouceRequest {
    private String provider;         // "aws" or "azure"
    private Instance.Capacity instanceType;   // e.g., micro, small, large
    private int storageCapacity;     // in MiB
}
