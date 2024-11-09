package com.learnwithbishnu.design_patterns.factorybuilder.service;

import com.learnwithbishnu.design_patterns.factorybuilder.factory.ShippingFactory;
import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingRequest;
import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @Autowired
    private ShippingFactory shippingFactory;
    public ShippingResponse createShipment(ShippingRequest request) {
        ShippingProvider shippingProvider = shippingFactory.getShippingProvider(request.getPriority());
        return shippingProvider.createShipment(request);
    }
}
