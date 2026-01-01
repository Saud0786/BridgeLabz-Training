package com.paymentsystem;

//UPI payment implementation
class UpiPayment extends BasePayment implements Payment {

 private String upiId;

 // Constructor
 public UpiPayment(double amount, String upiId) {
     super(amount);
     this.upiId = upiId;
 }

 // Polymorphic behavior
 public void processPayment() {
     System.out.println("Processing UPI payment of " + amount);
 }
}

