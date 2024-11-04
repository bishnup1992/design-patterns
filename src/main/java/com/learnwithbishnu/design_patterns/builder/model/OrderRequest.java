package com.learnwithbishnu.design_patterns.builder.model;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {
    private String orderId;
    private String customerDetails;
    private String shippingAddress;
    private String billingAddress;
    @Singular
    private List<OrderItem> orderItems;
    private Double totalAmount;


    public static OrderRequest createOrder(String CustomerDetails, String shippingAddress,
                                              String billingAddress, Map<String, ItemDetails> orderItemsMap) {

        List<OrderItem> orderItemList = orderItemsMap.entrySet().stream()
                .map(entry -> {
                    String itemName = entry.getKey(); // item name
                    ItemDetails details = entry.getValue();// item details
                    Double discount = (details.getCount() > 3 ? 0.5 : 0.1)*details.getPrice()*details.getCount();
                    Double discountedPrice = details.getPrice()*details.getCount() - discount;
                    return OrderItem.builder()
                            .itemName(itemName)
                            .price(details.getPrice())
                            .count(details.getCount())
                            .discount(discount)
                            .discountedPrice(discountedPrice)
                            .build();
                }).collect(Collectors.toList());
        Double totalAmount = orderItemList.stream().mapToDouble(OrderItem::getDiscountedPrice).sum();
        return OrderRequest.builder()
                .orderId(UUID.randomUUID().toString())
                .customerDetails(CustomerDetails)
                .shippingAddress(shippingAddress)
                .billingAddress(billingAddress)
                .orderItems(orderItemList)
                .totalAmount(totalAmount)
                .build();
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ItemDetails {
        private Double price;
        private Integer count;
    }

}
