package com.learnwithbishnu.design_patterns.builder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    private String itemName;
    private Double price;
    private Integer count;
    private Double discount;
    private Double discountedPrice;
}