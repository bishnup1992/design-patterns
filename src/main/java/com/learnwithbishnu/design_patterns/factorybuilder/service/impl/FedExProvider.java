package com.learnwithbishnu.design_patterns.factorybuilder.service.impl;


import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingRequest;
import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingResponse;
import com.learnwithbishnu.design_patterns.factorybuilder.service.ShippingProvider;
import org.springframework.stereotype.Component;

@Component
public class FedExProvider implements ShippingProvider {
    @Override
    public ShippingResponse createShipment(ShippingRequest shippingRequest) {
        double cost = calculateShippingCost(shippingRequest);
       return ShippingResponse.builder()
                .provider("FedEx")
                .cost(cost)
                .estimatedDelivery("3-5 Business days")
                .trackingCode("FEDX1234")
                .build();

    }

    private double calculateShippingCost(ShippingRequest shippingRequest) {
        return shippingRequest.getWeight() * 1*5 +(shippingRequest.isInsurance() ? 5 : 0);
    }
}
