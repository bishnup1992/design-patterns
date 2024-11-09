package com.learnwithbishnu.design_patterns.prototype.service;

import com.learnwithbishnu.design_patterns.prototype.factory.DocumentFactory;
import com.learnwithbishnu.design_patterns.prototype.service.impl.InvoiceDocument;
import com.learnwithbishnu.design_patterns.prototype.service.impl.ReportDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    private final DocumentFactory documentFactory;

    @Autowired
    public DocumentService(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public DocumentPrototype createDocument(String type) {
        return documentFactory.getDocumentPrototype(type);
    }
}
