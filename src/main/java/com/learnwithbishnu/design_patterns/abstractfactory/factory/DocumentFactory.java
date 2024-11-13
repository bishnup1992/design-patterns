package com.learnwithbishnu.design_patterns.abstractfactory.factory;

import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Invoice;
import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Report;

public interface DocumentFactory {
    public Report createReport();
    public Invoice createInvoice();
}
