package com.learnwithbishnu.design_patterns.builder.controller;

import com.learnwithbishnu.design_patterns.builder.model.Order;
import com.learnwithbishnu.design_patterns.builder.model.OrderRequest;
import com.learnwithbishnu.design_patterns.builder.model.OrderResponse;
import com.learnwithbishnu.design_patterns.builder.service.OrderService;
import com.learnwithbishnu.design_patterns.builder.service.OrderService1;
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
}