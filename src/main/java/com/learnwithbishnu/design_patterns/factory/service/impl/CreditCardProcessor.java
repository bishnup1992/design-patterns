package com.learnwithbishnu.design_patterns.factory.service.impl;

import com.learnwithbishnu.design_patterns.factory.service.PaymentProcessor;
import org.springframework.stereotype.Component;

@Component("creditcard")
public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        // Processing logic for credit card
        return "Processed " + amount + " via Credit Card.";
    }
}
