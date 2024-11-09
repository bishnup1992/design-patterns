package com.learnwithbishnu.design_patterns.prototype2.explanation;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeProfile original = new EmployeeProfile("Engineering");
        original.addConfiguration("region", "US");
        original.addPermission("Access_source_code");


        // Shallow clone
        EmployeeProfile shallowClone = original.clone();
        // Deep clone
        EmployeeProfile deepClone = original.deepClone();

        // Modifying the original object
        original.addConfiguration("tier", "Gold");
        original.addPermission("Access_dev_environment");


        // Displaying the configurations and permissions
        System.out.println("Original Configurations: " + original.getConfigurations());
        System.out.println("Shallow Clone Configurations: " + shallowClone.getConfigurations());
        System.out.println("Deep Clone Configurations: " + deepClone.getConfigurations());

        System.out.println("Original Permissions: " + original.getPermissions());
        System.out.println("Shallow Clone Permissions: " + shallowClone.getPermissions());
        System.out.println("Deep Clone Permissions: " + deepClone.getPermissions());



    }
}
