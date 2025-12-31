package com.inheritance.multilevelinheritance;

public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    // Constructor to initialize order 
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
    	// calling ShippedOrder constructor
    	super(orderId, orderDate, trackingNumber); 
        this.deliveryDate = deliveryDate;
    }

    // Overriding order status
    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}