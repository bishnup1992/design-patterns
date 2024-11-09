package com.learnwithbishnu.design_patterns.factorybuilder.service.impl;

import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingRequest;
import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingResponse;
import com.learnwithbishnu.design_patterns.factorybuilder.service.ShippingProvider;
import org.springframework.stereotype.Component;

@Component
public class DHLProvider implements ShippingProvider {
    @Override
    public ShippingResponse createShipment(ShippingRequest shippingRequest) {
        double cost = calculateCost(shippingRequest);
        return ShippingResponse.builder()
                .provider("DHL")
                .cost(cost)
                .estimatedDelivery("3-5 Business days")
                .trackingCode("DHL123")
                .build();
    }

    private double calculateCost(ShippingRequest request) {
        return request.getWeight() * 2.0 + (request.isInsurance() ? 10 : 0);
    }

}
