package com.learnwithbishnu.design_patterns.builder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse2 {
    private String orderId;
    private String customerDetails;
    private String shippingAddress;
    private String billingAddress;
    private List<OrderItem> orderItems;
    private Double totalAmount;


}
