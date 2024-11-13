package com.learnwithbishnu.design_patterns.abstractfactory2.service.impl;

import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;
import org.springframework.stereotype.Component;


public class S3Storage implements Storage {
    private String id;
    private String capacity;

    public S3Storage(int capacityInMib) {
        this.id = "S3";
        this.capacity = capacityInMib + " MiB";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "S3Storage{" +
                "id='" + id + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
