package com.learnwithbishnu.design_patterns.factory.controller;

import com.learnwithbishnu.design_patterns.factory.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payment")
public class PaymentController {


    @Autowired
    private PaymentService paymentService;



    @PostMapping("/process")
    public String processPayment(@RequestParam String paymentType, @RequestParam double amount) {
        return paymentService.processPayment(paymentType, amount);
    }
}
