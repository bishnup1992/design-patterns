package com.learnwithbishnu.design_patterns.factorybuilder.service.impl;

import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingRequest;
import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingResponse;
import com.learnwithbishnu.design_patterns.factorybuilder.service.ShippingProvider;
import org.springframework.stereotype.Component;

@Component
public class UPSProvider implements ShippingProvider {
    @Override
    public ShippingResponse createShipment(ShippingRequest shippingRequest) {
        double cost = calculateCost(shippingRequest);
        return ShippingResponse.builder()
                .provider("UPS")
                .cost(10.0)
                .estimatedDelivery("2-3 Business days")
                .trackingCode("UPS123")
                .build();
    }

    private double calculateCost(ShippingRequest request) {
        return request.getWeight() * 1.2 + (request.isInsurance() ? 7 : 0);
    }

}
