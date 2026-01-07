package com.bookbaazar;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private User user;
    private Map<Book, Integer> items = new HashMap<>();
    private double totalAmount;
    private String orderStatus;

    // Restricted constructor
    protected Order(User user) {
        this.user = user;
        this.orderStatus = "CREATED";
    }

    // User adds books to order
    public void addBook(Book book, int quantity) {
        if (book.isAvailable(quantity)) {
            items.put(book, quantity);
            book.reduceStock(quantity);
        } else {
            System.out.println("Not enough stock for " + book.getTitle());
        }
    }

    // price × quantity − discount
    public void calculateTotal() {
        totalAmount = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double base = book.getPrice() * qty;
            double discount = ((IDiscountable) book).applyDiscount(qty);

            totalAmount += base - discount;
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Only system/admin can update
    protected void updateOrderStatus(String status) {
        orderStatus = status;
    }
}
