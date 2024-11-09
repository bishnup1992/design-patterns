package com.learnwithbishnu.design_patterns.factorybuilder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingRequest {
    private String destination;
    private double weight;
    private String packageType;
    private boolean insurance;
    private String priority;
}
