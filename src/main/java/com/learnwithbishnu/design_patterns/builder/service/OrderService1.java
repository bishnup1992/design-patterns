package com.learnwithbishnu.design_patterns.builder.service;

import com.learnwithbishnu.design_patterns.builder.model.OrderItem;
import com.learnwithbishnu.design_patterns.builder.model.OrderRequest;
import com.learnwithbishnu.design_patterns.builder.model.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OrderService1 {
    public OrderResponse createOrder1(OrderRequest orderRequest) {
        Map<String, OrderRequest.ItemDetails> itemDetailsMap = orderRequest.getOrderItems().stream()
                .collect(Collectors.toMap(OrderItem::getItemName,
                        item -> OrderRequest.ItemDetails.builder()
                                .price(item.getPrice())
                                .count(item.getCount())
                                .build()));
        OrderRequest orderValue = OrderRequest.createOrder(
                orderRequest.getCustomerDetails(),
                orderRequest.getShippingAddress(),
                orderRequest.getBillingAddress(),
                itemDetailsMap);
        return OrderResponse.builder()
                .orderId(orderValue.getOrderId())
                .customerDetails(orderValue.getCustomerDetails())
                .shippingAddress(orderValue.getShippingAddress())
                .billingAddress(orderValue.getBillingAddress())
                .orderItems(orderValue.getOrderItems())
                .totalAmount(orderValue.getTotalAmount())
                .build();
    }
}
