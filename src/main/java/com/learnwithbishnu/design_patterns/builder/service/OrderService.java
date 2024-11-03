package com.learnwithbishnu.design_patterns.builder.service;

import com.learnwithbishnu.design_patterns.builder.model.Order;
import com.learnwithbishnu.design_patterns.builder.model.OrderItem;
import com.learnwithbishnu.design_patterns.builder.model.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class OrderService {
    public OrderResponse createOrder(Order orderRequest) {
        Map<String, Order.ItemDetails> itemDetailsMap = new HashMap<>();
        for (OrderItem item : orderRequest.getOrderItems()) {
            itemDetailsMap.put(item.getItemName(), new Order.ItemDetails(item.getPrice(), item.getCount()));
        }

        Order order = new Order.OrderBuilder(UUID.randomUUID().toString())
                .customerDetails(orderRequest.getCustomerDetails())
                .shippingAddress(orderRequest.getShippingAddress())
                .billingAddress(orderRequest.getBillingAddress())
                .orderItems(itemDetailsMap)
                .build();

        return new OrderResponse(
                order.getOrderId(),
                order.getCustomerDetails(),
                order.getShippingAddress(),
                order.getBillingAddress(),
                order.getOrderItems(),
                order.getTotalAmount()
        );
    }
}