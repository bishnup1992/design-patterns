package com.learnwithbishnu.design_patterns.prototype2.factory;

import com.learnwithbishnu.design_patterns.prototype2.service.EmployeeBeneficiaryPrototype;
import com.learnwithbishnu.design_patterns.prototype2.service.impl.DeveloperProfile;
import com.learnwithbishnu.design_patterns.prototype2.service.impl.ManagerProfile;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProfileFactory {
    private final ManagerProfile managerProfile = new ManagerProfile();
    private final DeveloperProfile developerProfile = new DeveloperProfile();

    public EmployeeBeneficiaryPrototype getProfile(String profileType) {
        switch (profileType) {
            case "Manager":
                return managerProfile.clone();
            case "Developer":
                return developerProfile.clone();
            default:
                throw new IllegalArgumentException("Invalid profile type");
        }
    }
}
