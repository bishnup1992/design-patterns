package com.learnwithbishnu.design_patterns.prototype.service;

public interface DocumentPrototype extends Cloneable {
    DocumentPrototype clone() throws CloneNotSupportedException;

}
