package com.learnwithbishnu.design_patterns.abstractfactory2.service;

import com.learnwithbishnu.design_patterns.abstractfactory2.service.Storage;

public interface  Instance {
    enum Capacity {micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
