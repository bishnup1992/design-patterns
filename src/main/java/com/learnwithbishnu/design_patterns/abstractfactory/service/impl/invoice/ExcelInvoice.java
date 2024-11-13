package com.learnwithbishnu.design_patterns.abstractfactory.service.impl.invoice;

import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Invoice;
import org.springframework.stereotype.Component;

@Component
public class ExcelInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating Excel invoice");
    }
}
