package com.learnwithbishnu.design_patterns.builder.model;

import lombok.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest2 {
    private String orderId;
    private String customerDetails;
    private String shippingAddress;
    private String billingAddress;
    @Singular
    private List<OrderItem> orderItems;
    private Double totalAmount;

    public static OrderRequest2 createOrder2(String customerDetails, String shippingAddress, String billingAddress,
                                    List<ItemDetails> itemDetailsList) {

        List<OrderItem> items = itemDetailsList.stream()
                .map(details -> {
                    Double discount = (details.getCount() > 3 ? 0.50 : 0.10) * details.getPrice() * details.getCount();
                    Double discountedPrice = details.getPrice() * details.getCount() - discount;

                    return OrderItem.builder()
                            .itemName(details.getItemName())
                            .price(details.getPrice())
                            .count(details.getCount())
                            .discount(discount)
                            .discountedPrice(discountedPrice)
                            .build();
                })
                .collect(Collectors.toList());

        Double totalAmount = items.stream()
                .mapToDouble(OrderItem::getDiscountedPrice)
                .sum();

        return OrderRequest2.builder()
                .orderId(UUID.randomUUID().toString())
                .customerDetails(customerDetails)
                .shippingAddress(shippingAddress)
                .billingAddress(billingAddress)
                .orderItems(items)
                .totalAmount(totalAmount)
                .build();
    }
}

