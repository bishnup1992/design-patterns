package com.learnwithbishnu.design_patterns.factorybuilder.contoller;

import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingRequest;
import com.learnwithbishnu.design_patterns.factorybuilder.model.ShippingResponse;
import com.learnwithbishnu.design_patterns.factorybuilder.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shipping")
public class ShippingController {


    private  final ShippingService shippingService;

    @Autowired
    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @PostMapping("/create")
    public ResponseEntity<ShippingResponse> createShipment(@RequestBody ShippingRequest request) {
        return ResponseEntity.ok(shippingService.createShipment(request));
    }


}
