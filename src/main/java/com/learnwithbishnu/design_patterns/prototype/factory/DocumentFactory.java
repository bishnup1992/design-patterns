package com.learnwithbishnu.design_patterns.prototype.factory;

import com.learnwithbishnu.design_patterns.prototype.service.DocumentPrototype;
import com.learnwithbishnu.design_patterns.prototype.service.impl.InvoiceDocument;
import com.learnwithbishnu.design_patterns.prototype.service.impl.ReportDocument;
import org.springframework.stereotype.Component;

@Component
public class DocumentFactory {
    public static DocumentPrototype getDocumentPrototype(String type) {
        if ("invoice".equalsIgnoreCase(type)) {
            //Assume client and invoice number are dynamic by making another api call
            return new InvoiceDocument("Client", "123", 100.0);
        } else if ("report".equalsIgnoreCase(type)) {
            //Assume title and content are dynamic by making another api call
            return new ReportDocument("Title", "Content");
        }
        return null;
    }
}
