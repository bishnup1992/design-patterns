package com.learnwithbishnu.design_patterns.prototype.service.impl;

import com.learnwithbishnu.design_patterns.prototype.service.DocumentPrototype;
import lombok.Data;

@Data
public class ReportDocument implements DocumentPrototype {
    private String title;
    private String content;

    public ReportDocument(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() throws CloneNotSupportedException {
        //shallow copy
        return new ReportDocument(title, content);
        // deep copy if needed
        // return new ReportDocument(new String(title), new String(content));
    }

}
