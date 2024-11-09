package com.learnwithbishnu.design_patterns.prototype2.service.impl;

import com.learnwithbishnu.design_patterns.prototype2.service.EmployeeBeneficiaryPrototype;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
public class ManagerProfile extends EmployeeBeneficiaryPrototype {


    public ManagerProfile() {
        super ("Management", "Manager","Placeholder Name for Manager");
        log.info("ManagerProfile constructor called");
        addPermission("Approve_budget");
        addPermission("Approve_leave");
        addPermission("Access_employee_records");
        addBenefit("Company_car");
        addBenefit("Health_insurance");
    }
}
