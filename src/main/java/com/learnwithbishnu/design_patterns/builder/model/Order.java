package com.learnwithbishnu.design_patterns.builder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String orderId;
    private String customerDetails;
    private String shippingAddress;
    private String billingAddress;
    private List<OrderItem> orderItems;
    private Double totalAmount;

    private Order(OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.customerDetails = builder.customerDetails;
        this.shippingAddress = builder.shippingAddress;
        this.billingAddress = builder.billingAddress;
        this.orderItems = builder.orderItems;
        this.totalAmount = builder.totalAmount;
    }

    public static class OrderBuilder {
        private final String orderId;
        private String customerDetails;
        private String shippingAddress;
        private String billingAddress;
        private List<OrderItem> orderItems;
        private Double totalAmount = 0.0;

        public OrderBuilder(String orderId) {
            this.orderId = orderId;
        }

        public OrderBuilder customerDetails(String customerDetails) {
            this.customerDetails = customerDetails;
            return this;
        }

        public OrderBuilder shippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public OrderBuilder billingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public OrderBuilder orderItems(Map<String, ItemDetails> orderItems) {
            this.orderItems = calculateDiscountedItems(orderItems);
            this.totalAmount = calculateTotalAmount(this.orderItems);
            return this;
        }

        private List<OrderItem> calculateDiscountedItems(Map<String, ItemDetails> items) {
            List<OrderItem> discountedItems = new ArrayList<>();
            for (Map.Entry<String, ItemDetails> entry : items.entrySet()) {
                String itemName = entry.getKey();
                Double price = entry.getValue().getPrice();
                Integer count = entry.getValue().getCount();

                Double discount = (count > 3 ? 0.50 : 0.10) * price * count;
                Double discountedPrice = price * count - discount;
                discountedItems.add(new OrderItem(itemName, price, count, discount, discountedPrice));
            }
            return discountedItems;
        }

        private Double calculateTotalAmount(List<OrderItem> items) {
            return items.stream()
                    .mapToDouble(OrderItem::getDiscountedPrice)
                    .sum();
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ItemDetails {
        private Double price;
        private Integer count;
    }
}