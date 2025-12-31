package com.inheritance.multilevelinheritance;

public class Order {

    protected int orderId;
    protected String orderDate;

    // Constructor to initialize order details
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}