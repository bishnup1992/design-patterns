package com.learnwithbishnu.design_patterns.abstractfactory2.factory;

import com.learnwithbishnu.design_patterns.abstractfactory2.service.Instance;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMib);
}
