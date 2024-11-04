package com.learnwithbishnu.design_patterns.builder.controller;

import com.learnwithbishnu.design_patterns.builder.model.*;
import com.learnwithbishnu.design_patterns.builder.service.OrderService;
import com.learnwithbishnu.design_patterns.builder.service.OrderService1;
import com.learnwithbishnu.design_patterns.builder.service.OrderService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderService1 orderService1;

    @Autowired
    private OrderService2 orderService2;

    @PostMapping("/create")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody Order orderRequest) {
        OrderResponse orderResponse = orderService.createOrder(orderRequest);
        return ResponseEntity.ok(orderResponse);
    }

    @PostMapping("/create1")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
        OrderResponse orderResponse = orderService1.createOrder1(orderRequest);
        return ResponseEntity.ok(orderResponse);
    }

    @PostMapping("/create-order")
    public ResponseEntity<OrderResponse2> createOrder2(@RequestBody OrderRequest2 orderRequest2) {
        OrderResponse2 orderResponse2 = orderService2.createOrder2(orderRequest2);
        return ResponseEntity.ok(orderResponse2);
    }
}