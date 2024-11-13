package com.learnwithbishnu.design_patterns.abstractfactory2.service.impl;

import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;


public class AzureBlobStorage implements Storage  {
    private String id;
    private String capacity;

    public AzureBlobStorage(int capacityInMib) {
        this.id = "AzureBlob";
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
        return "AzureBlobStorage{" +
                "id='" + id + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
