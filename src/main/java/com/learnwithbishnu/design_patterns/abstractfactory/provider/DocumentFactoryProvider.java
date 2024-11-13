package com.learnwithbishnu.design_patterns.abstractfactory.provider;

import com.learnwithbishnu.design_patterns.abstractfactory.factory.DocumentFactory;
import com.learnwithbishnu.design_patterns.abstractfactory.factory.ExcelDocumentFactory;
import com.learnwithbishnu.design_patterns.abstractfactory.factory.PdfDocumentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocumentFactoryProvider {
    @Autowired
    private PdfDocumentFactory pdfDocumentFactory;

    @Autowired
    private ExcelDocumentFactory excelDocumentFactory;

    public DocumentFactory getDocumentFactory(String type) {
        if ("pdf".equalsIgnoreCase(type)) {
            return pdfDocumentFactory;
        } else if ("excel".equalsIgnoreCase(type)) {
            return excelDocumentFactory;
        } else {
            throw new IllegalArgumentException("Invalid document type");
        }
    }

}
