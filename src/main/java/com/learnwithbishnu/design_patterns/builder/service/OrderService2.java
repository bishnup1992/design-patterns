package com.learnwithbishnu.design_patterns.builder.service;

import com.learnwithbishnu.design_patterns.builder.model.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OrderService2 {
    public OrderResponse2 createOrder2(OrderRequest2 orderRequest2) {

        List<OrderItem> collectOrderItemList = orderRequest2.getOrderItems();
        //convert collectOrderItemList to List<ItemDetails>
        List<ItemDetails> collectOrderItems = collectOrderItemList.stream()
                .map(orderItem -> ItemDetails.builder()
                        .itemName(orderItem.getItemName())
                        .price(orderItem.getPrice())
                        .count(orderItem.getCount())
                        .build())
                .collect(Collectors.toList());

        OrderRequest2 order = OrderRequest2.createOrder2(
                orderRequest2.getCustomerDetails(),
                orderRequest2.getShippingAddress(),
                orderRequest2.getBillingAddress(),
                collectOrderItems);

        return OrderResponse2.builder()
                .orderId(order.getOrderId())
                .customerDetails(order.getCustomerDetails())
                .shippingAddress(order.getShippingAddress())
                .billingAddress(order.getBillingAddress())
                .orderItems(order.getOrderItems())
                .totalAmount(order.getTotalAmount())
                .build();
    }
}
