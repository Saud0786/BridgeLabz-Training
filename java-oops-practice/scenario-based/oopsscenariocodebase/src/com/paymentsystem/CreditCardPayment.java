package com.paymentsystem;

//Credit card payment implementation
class CreditCardPayment extends BasePayment implements Payment {

 private String cardNumber;  // private for security

 // Constructor
 public CreditCardPayment(double amount, String cardNumber) {
     super(amount);  // initialize parent variable
     this.cardNumber = cardNumber;
 }

 // Polymorphic behavior
 public void processPayment() {
     System.out.println("Processing Credit Card payment of " + amount);
 }
}
