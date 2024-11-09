package com.learnwithbishnu.design_patterns.prototype.service.impl;

import com.learnwithbishnu.design_patterns.prototype.service.DocumentPrototype;
import lombok.Data;

@Data
public class InvoiceDocument implements DocumentPrototype {
    private String clientName;
    private String invoiceNumber;
    private double amount;

   public InvoiceDocument(String clientName, String invoiceNumber, double amount) {
        this.clientName = clientName;
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    @Override
    public DocumentPrototype clone() throws CloneNotSupportedException {
       //shallow copy
        return new InvoiceDocument(clientName, invoiceNumber, amount);
        // deep copy if needed
        // return new InvoiceDocument(new String(clientName), new String(invoiceNumber), amount);
    }


}
