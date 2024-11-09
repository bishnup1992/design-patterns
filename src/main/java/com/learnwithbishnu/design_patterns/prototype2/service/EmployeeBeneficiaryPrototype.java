package com.learnwithbishnu.design_patterns.prototype2.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Data
@Slf4j
@Component
@AllArgsConstructor
public abstract class EmployeeBeneficiaryPrototype implements Cloneable{


    private String department;
    private String role;
    private String name;
    private List<String> permissions;
    private List<String> benefits;

    public EmployeeBeneficiaryPrototype(String department, String role,String name) {
        this.department = department;
        this.role = role;
        this.name = name;
        this.permissions = new ArrayList<>();
        this.benefits = new ArrayList<>();
    }
    //override clone method
    @Override
    public EmployeeBeneficiaryPrototype clone() {
        log.info("Cloning EmployeeBeneficiaryPrototype");
        try {
            EmployeeBeneficiaryPrototype beneficiaryPrototypeClone = (EmployeeBeneficiaryPrototype) super.clone();

            beneficiaryPrototypeClone.permissions = new ArrayList<>(this.permissions);
            beneficiaryPrototypeClone.benefits = new ArrayList<>(this.benefits);
            log.info("Cloning EmployeeBeneficiaryPrototype done");
            return beneficiaryPrototypeClone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed");
        }

    }
    //Add permission to Employee profile
    public void addPermission(String permission) {
        this.permissions.add(permission);
    }
    //Add benefit to Employee profile
    public void addBenefit(String benefit) {
        this.benefits.add(benefit);
    }

}
