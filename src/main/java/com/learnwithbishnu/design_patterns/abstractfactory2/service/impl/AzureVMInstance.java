package com.learnwithbishnu.design_patterns.abstractfactory2.service.impl;

import com.learnwithbishnu.design_patterns.abstractfactory2.service.Instance;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;


public class AzureVMInstance implements Instance {

    public AzureVMInstance(Instance.Capacity capacity) {
        System.out.println("AzureVMInstance created with capacity: " + capacity);
    }

    public void start() {
        System.out.println("AzureVMInstance started");
    }

    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to AzureVMInstance");
    }

    public void stop() {
        System.out.println("AzureVMInstance stopped");
    }
}
