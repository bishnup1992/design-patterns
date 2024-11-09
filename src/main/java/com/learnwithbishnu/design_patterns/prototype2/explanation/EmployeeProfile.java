package com.learnwithbishnu.design_patterns.prototype2.explanation;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
public class EmployeeProfile implements Cloneable{
    private String department;
    private Map<String, String> configurations; // Example of a complex mutable structure
    private List<String> permissions;

    public EmployeeProfile(String department) {
        this.department = department;
        this.configurations = new HashMap<>();
        this.permissions = new ArrayList<>();
    }
    public void addConfiguration(String key, String value) {
        this.configurations.put(key, value);
    }

    public void addPermission(String permission) {
        this.permissions.add(permission);
    }


    // Shallow clone method
    @Override
    protected EmployeeProfile clone() throws CloneNotSupportedException {
        return (EmployeeProfile) super.clone();
    }

    // Deep clone method
    public EmployeeProfile deepClone() {
        try {
            EmployeeProfile clone = (EmployeeProfile) super.clone();
            clone.configurations = new HashMap<>(this.configurations);
            clone.permissions = new ArrayList<>(this.permissions);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error while cloning EmployeeProfile", e);
        }
    }
}
