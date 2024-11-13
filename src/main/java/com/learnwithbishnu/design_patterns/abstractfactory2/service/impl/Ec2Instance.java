package com.learnwithbishnu.design_patterns.abstractfactory2.service.impl;

import com.learnwithbishnu.design_patterns.abstractfactory2.service.Instance;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;
import org.springframework.stereotype.Component;


public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        // TODO - implement Ec2Instance.Ec2Instance
      System.out.println("Ec2Instance created with capacity: " + capacity);
    }

    public void start() {
        System.out.println("Ec2Instance started");
    }

    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    public void stop() {
        System.out.println("Ec2Instance stopped");
    }
}
