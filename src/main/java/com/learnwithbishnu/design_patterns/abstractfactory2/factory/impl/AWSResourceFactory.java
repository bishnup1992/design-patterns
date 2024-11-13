package com.learnwithbishnu.design_patterns.abstractfactory2.factory.impl;

import com.learnwithbishnu.design_patterns.abstractfactory2.factory.ResourceFactory;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.Instance;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.impl.Ec2Instance;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.impl.S3Storage;
import org.springframework.stereotype.Component;

@Component
public class AWSResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
}
