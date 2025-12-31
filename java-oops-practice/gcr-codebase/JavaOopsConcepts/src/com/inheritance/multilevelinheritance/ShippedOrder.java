package com.inheritance.multilevelinheritance;

public class ShippedOrder extends Order {

    protected String trackingNumber;

    // Constructor to initialize order
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
    	// calling Order constructor
    	super(orderId, orderDate); 
        this.trackingNumber = trackingNumber;
    }

    // Overriding order status
    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}