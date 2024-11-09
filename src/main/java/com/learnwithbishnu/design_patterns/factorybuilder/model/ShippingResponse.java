package com.learnwithbishnu.design_patterns.factorybuilder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShippingResponse {
    private String provider;
    private double cost;
    private String estimatedDelivery;
    private String trackingCode;
}
