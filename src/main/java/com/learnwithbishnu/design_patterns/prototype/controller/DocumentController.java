package com.learnwithbishnu.design_patterns.prototype.controller;

import com.learnwithbishnu.design_patterns.prototype.service.DocumentPrototype;
import com.learnwithbishnu.design_patterns.prototype.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/document")
public class DocumentController {


    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/create/{type}")
    public ResponseEntity<DocumentPrototype> createDocument(@PathVariable String type) {
        return ResponseEntity.ok(documentService.createDocument(type));
    }
}