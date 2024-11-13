package com.learnwithbishnu.design_patterns.abstractfactory2.factory.impl;

import com.learnwithbishnu.design_patterns.abstractfactory2.factory.ResourceFactory;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.Instance;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.impl.AzureBlobStorage;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.impl.AzureVMInstance;
import org.springframework.stereotype.Component;

@Component
public class AzureResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new AzureVMInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new AzureBlobStorage(capacityInMib);
    }
}
