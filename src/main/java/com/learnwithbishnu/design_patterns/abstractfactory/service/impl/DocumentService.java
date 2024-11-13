package com.learnwithbishnu.design_patterns.abstractfactory.service.impl;

import com.learnwithbishnu.design_patterns.abstractfactory.factory.DocumentFactory;
import com.learnwithbishnu.design_patterns.abstractfactory.provider.DocumentFactoryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("abstractFactoryDocumentService")
public class DocumentService {
    @Qualifier("documentFactoryProvider")
    @Autowired
    private DocumentFactoryProvider documentFactoryProvider;

    public void generateDocuments(String documentType) {
        DocumentFactory documentFactory = documentFactoryProvider.getDocumentFactory(documentType);
        Report report = documentFactory.createReport();
        Invoice invoice = documentFactory.createInvoice();
        report.generateReport();
        invoice.generateInvoice();
    }

}
