package com.learnwithbishnu.design_patterns.factory.factory;

import com.learnwithbishnu.design_patterns.factory.service.impl.CreditCardProcessor;
import com.learnwithbishnu.design_patterns.factory.service.impl.PayPalProcessor;
import com.learnwithbishnu.design_patterns.factory.service.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactory {

    private final Map<String, PaymentProcessor> processors;

    @Autowired
    public PaymentFactory(Map<String, PaymentProcessor> processors) {
        this.processors = processors;
    }

    public PaymentProcessor getPaymentProcessor(String paymentType) {
        PaymentProcessor paymentProcessor = processors.get(paymentType);
        if(paymentProcessor == null) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        return paymentProcessor;
    }

}
