package com.learnwithbishnu.design_patterns.abstractfactory2.factory.provider;

import com.learnwithbishnu.design_patterns.abstractfactory2.factory.ResourceFactory;
import com.learnwithbishnu.design_patterns.abstractfactory2.factory.impl.AWSResourceFactory;
import com.learnwithbishnu.design_patterns.abstractfactory2.factory.impl.AzureResourceFactory;
import org.springframework.stereotype.Component;

@Component
public class ResourceFactoryProvider {
    public ResourceFactory getFactory(String provider) {
        if ("aws".equalsIgnoreCase(provider)) {
            return new AWSResourceFactory();
        } else if ("azure".equalsIgnoreCase(provider)) {
            return new AzureResourceFactory();
        }
        throw new IllegalArgumentException("Invalid provider type: " + provider);
    }
}
