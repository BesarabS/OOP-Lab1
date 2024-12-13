package ua.edu.kibit;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order.OrderBuilder(1, Arrays.asList("Headphones", "MP3 Player"), 1800)
                .setDeliveryAddress("Київ, вул. Мельникова, 1")
                .setGiftWrap(true)
                .setNote("Будь ласка, доставте після 18 години")
                .setDeliveryDate(new Date(2024, Calendar.DECEMBER, 18))
                .setCouponCode("DISCOUNT 20%")
                .build();

        Order order2 = new Order.OrderBuilder(2, Arrays.asList("Notebook", "Mouse"), 3400)
                .setDeliveryAddress("Чернігів, вул. Тараса Шевченкаб 14")
                .setGiftWrap(false)
                .setCouponCode("DISCOUNT 15%")
                .build();

        Order order3 = new Order.OrderBuilder(3, Arrays.asList("Keyboard", "Mouse"), 1500)
                .setDeliveryAddress("Кропивницький, пл. Лук'янівськаб 17")
                .setGiftWrap(true)
                .setNote("Будь ласка передзвоніть мені після 17 години")
                .build();

        printOrderDetails(order1);
        printOrderDetails(order2);
        printOrderDetails(order3);
    }

    private static void printOrderDetails(Order order) {
        System.out.println("Order ID: " + order.getId());
        System.out.println("Items: " + order.getItems());
        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        System.out.println("Gift Wrap: " + order.isGiftWrap());
        System.out.println("Note: " + order.getNote());
        System.out.println("Delivery Date: " + order.getDeliveryDate());
        System.out.println("Coupon Code: " + order.getCouponCode());
        System.out.println("---------------------------");
    }
}