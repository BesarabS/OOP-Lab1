package ua.edu.kibit;

import java.util.Date;
import java.util.List;

public class Order {
    // Обов'язкові параметри
    private final int id;
    private final List<String> items;
    private final double totalPrice;

    // Опціональні параметри
    private final String deliveryAddress;
    private final boolean giftWrap;
    private final String note;
    private final Date deliveryDate;
    private final String couponCode;

    // Приватний конструктор, який приймає об'єкт OrderBuilder
    private Order(OrderBuilder builder) {
        this.id = builder.id;
        this.items = builder.items;
        this.totalPrice = builder.totalPrice;
        this.deliveryAddress = builder.deliveryAddress;
        this.giftWrap = builder.giftWrap;
        this.note = builder.note;
        this.deliveryDate = builder.deliveryDate;
        this.couponCode = builder.couponCode;
    }

    public static class OrderBuilder {
        // Обов'язкові параметри
        private final int id;
        private final List<String> items;
        private final double totalPrice;

        private String deliveryAddress = "";
        private boolean giftWrap = false;
        private String note = "";
        private Date deliveryDate = null;
        private String couponCode = "";

        public OrderBuilder(int id, List<String> items, double totalPrice) {
            this.id = id;
            this.items = items;
            this.totalPrice = totalPrice;
        }

        public OrderBuilder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public OrderBuilder setGiftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public OrderBuilder setNote(String note) {
            this.note = note;
            return this;
        }

        public OrderBuilder setDeliveryDate(Date deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        public OrderBuilder setCouponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public int getId() {
        return id;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public String getNote() {
        return note;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public String getCouponCode() {
        return couponCode;
    }
}
