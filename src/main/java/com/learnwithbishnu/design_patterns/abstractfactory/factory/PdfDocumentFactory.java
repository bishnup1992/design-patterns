package com.learnwithbishnu.design_patterns.abstractfactory.factory;

import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Invoice;
import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Report;
import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.invoice.PdfInvoice;
import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.report.PdfReport;
import org.springframework.stereotype.Component;

@Component
public class PdfDocumentFactory implements DocumentFactory {
    @Override
    public Report createReport() {
        return new PdfReport();
    }

    @Override
    public Invoice createInvoice() {
        return new PdfInvoice();
    }
}
