package com.learnwithbishnu.design_patterns.factory.service.impl;

import com.learnwithbishnu.design_patterns.factory.service.PaymentProcessor;
import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalProcessor implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        // Processing logic for PayPal
        return "Processed " + amount + " via PayPal.";
    }
}
