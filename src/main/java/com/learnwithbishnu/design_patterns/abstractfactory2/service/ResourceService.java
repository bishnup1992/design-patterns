package com.learnwithbishnu.design_patterns.abstractfactory2.service;

import com.learnwithbishnu.design_patterns.abstractfactory2.factory.ResourceFactory;
import com.learnwithbishnu.design_patterns.abstractfactory2.factory.provider.ResourceFactoryProvider;
import com.learnwithbishnu.design_patterns.abstractfactory2.model.ResouceRequest;
import com.learnwithbishnu.design_patterns.abstractfactory2.model.ResourceResponse;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {

    private final ResourceFactoryProvider factoryProvider;

    public ResourceService(ResourceFactoryProvider factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public ResourceResponse createResource(ResouceRequest request) {


        ResourceFactory factory = factoryProvider.getFactory(request.getProvider());
        Instance instance = factory.createInstance(request.getInstanceType());
        Storage storage = factory.createStorage(request.getStorageCapacity());

        instance.start();
        instance.attachStorage(storage);
        instance.stop();

        return ResourceResponse.builder()
                .message("Resource created successfully")
                .instanceId(instance.toString())
                .instanceType(request.getInstanceType().toString())
                .storageId(storage.getId())
                .storageCapacity(storage.getCapacity())
                .build();

    }

}
