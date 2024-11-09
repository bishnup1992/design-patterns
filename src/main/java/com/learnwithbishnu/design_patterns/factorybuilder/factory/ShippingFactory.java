package com.learnwithbishnu.design_patterns.factorybuilder.factory;

import com.learnwithbishnu.design_patterns.factorybuilder.service.ShippingProvider;
import com.learnwithbishnu.design_patterns.factorybuilder.service.impl.DHLProvider;
import com.learnwithbishnu.design_patterns.factorybuilder.service.impl.FedExProvider;
import com.learnwithbishnu.design_patterns.factorybuilder.service.impl.UPSProvider;
import org.springframework.stereotype.Component;

@Component
public class ShippingFactory {
    public ShippingProvider getShippingProvider(String priority) {
        switch (priority) {
            case "standard":
                return new UPSProvider();
            case "express":
                return new FedExProvider();
            case "overnight":
                return new DHLProvider();
            default:
                throw new IllegalArgumentException("Invalid priority" + priority);
        }

    }
}
