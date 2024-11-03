package com.learnwithbishnu.design_patterns.builder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private String orderId;
    private String customerDetails;
    private String shippingAddress;
    private String billingAddress;
    private List<OrderItem> orderItems;
    private Double totalAmount;


}
