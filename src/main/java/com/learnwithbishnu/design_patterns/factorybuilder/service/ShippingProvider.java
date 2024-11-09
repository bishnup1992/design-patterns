package com.learnwithbishnu.design_patterns.factorybuilder.service;

import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingRequest;
import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingResponse;

public interface ShippingProvider {
    ShippingResponse createShipment(ShippingRequest shippingRequest);
}
