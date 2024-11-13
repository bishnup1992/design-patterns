package com.learnwithbishnu.design_patterns.abstractfactory.service.impl.report;

import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.Report;
import org.springframework.stereotype.Component;

@Component
public class PdfReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Generating PDF report");
    }
}
