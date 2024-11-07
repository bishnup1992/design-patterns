package com.learnwithbishnu.design_patterns.factory.service;

import com.learnwithbishnu.design_patterns.factory.factory.PaymentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private final PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }


    public String processPayment(String paymentType, double amount) {
        PaymentProcessor processor = paymentFactory.getPaymentProcessor(paymentType);
        return processor.processPayment(amount);
    }
}
