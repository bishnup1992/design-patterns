package com.learnwithbishnu.design_patterns.prototype2.service.impl;

import com.learnwithbishnu.design_patterns.prototype2.service.EmployeeBeneficiaryPrototype;
import org.springframework.stereotype.Component;

@Component
public class DeveloperProfile extends EmployeeBeneficiaryPrototype {
    public DeveloperProfile() {
        super ("Engineering", "Developer","Placeholder Name for Developer");
        addPermission("Access_source_code");
        addPermission("Access_documentation");
        addBenefit("Remote_work");
        addBenefit("Health_insurance");
    }
}
