package com.learnwithbishnu.design_patterns.prototype2.service;

import com.learnwithbishnu.design_patterns.prototype2.factory.EmployeeProfileFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeProfileService {
    private final EmployeeProfileFactory employeeProfileFactory;

    @Autowired
    public EmployeeProfileService(EmployeeProfileFactory employeeProfileFactory) {
        this.employeeProfileFactory = employeeProfileFactory;
    }

    /**
     * Create a new profile based on the profile type
     * @param name
     * @param profileType
     * @return
     */

    public EmployeeBeneficiaryPrototype createProfile(String name,String profileType) {
        EmployeeBeneficiaryPrototype profile = employeeProfileFactory.getProfile(profileType);
        log.info("Creating profile for {} with type {}", name, profileType);
        log.info("Profile created: {}", profile);
        profile.setName(name);

        //Additional permissions based on role
        if("Manager".equals(profileType)) {
            profile.addPermission("Stock_options");

        } else if("Developer".equals(profileType)) {
            profile.addPermission("Access_dev_environment");
        }
        log.info("Profile after adding permissions: {}", profile);
        return profile;
    }
}
