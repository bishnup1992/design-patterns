package com.learnwithbishnu.design_patterns.prototype2.controller;

import com.learnwithbishnu.design_patterns.prototype2.service.EmployeeBeneficiaryPrototype;
import com.learnwithbishnu.design_patterns.prototype2.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeProfileService employeeProfileService;

    @Autowired
    public EmployeeController(EmployeeProfileService employeeProfileService) {
        this.employeeProfileService = employeeProfileService;
    }

    @PostMapping("/create")
    public ResponseEntity<EmployeeBeneficiaryPrototype> createProfile(@RequestParam String name, @RequestParam String profileType) {
       return ResponseEntity.ok(employeeProfileService.createProfile(name, profileType));
    }
}
