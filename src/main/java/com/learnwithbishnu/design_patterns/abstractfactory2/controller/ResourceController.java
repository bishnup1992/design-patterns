package com.learnwithbishnu.design_patterns.abstractfactory2.controller;

import com.learnwithbishnu.design_patterns.abstractfactory2.model.ResouceRequest;
import com.learnwithbishnu.design_patterns.abstractfactory2.model.ResourceResponse;
import com.learnwithbishnu.design_patterns.abstractfactory2.service.ResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {
     private final ResourceService resourceService;

     public ResourceController(ResourceService resourceService) {
         this.resourceService = resourceService;
     }

     @PostMapping("/create")
        public ResponseEntity<ResourceResponse> createResource(@RequestBody ResouceRequest request) {
            return ResponseEntity.ok(resourceService.createResource(request));
        }


}
