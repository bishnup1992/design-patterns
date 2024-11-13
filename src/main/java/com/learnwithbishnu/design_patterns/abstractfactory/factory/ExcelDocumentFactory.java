package com.learnwithbishnu.design_patterns.abstractfactory.factory;

import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Invoice;
import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Report;
import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.invoice.ExcelInvoice;
import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.report.ExcelReport;
import org.springframework.stereotype.Component;

@Component
public class ExcelDocumentFactory implements DocumentFactory{
    @Override
    public Report createReport() {
        return new ExcelReport();
    }

    @Override
    public Invoice createInvoice() {
        return new ExcelInvoice();
    }
}
