package com.learnwithbishnu.design_patterns.abstractfactory.controller;

import com.learnwithbishnu.design_patterns.abstractfactory.service.impl.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("abstractFactoryDocumentController")
@RequestMapping("/api/document")
public class DocumentController {
    @Autowired
    @Qualifier("abstractFactoryDocumentService")
    private DocumentService documentService;

    @GetMapping("/generate")
    public ResponseEntity<String> generateDocuments(@RequestParam String documentType) {
        try {
            documentService.generateDocuments(documentType);
            return ResponseEntity.ok(documentType+" Documents generated successfully");
        }catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
