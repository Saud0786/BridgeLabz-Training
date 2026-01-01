package com.paymentsystem;

public class PaymentSystem {
    public static void main(String[] args) {

        // Polymorphism: interface reference
        Payment payment1 = new CreditCardPayment(5000, "1234-XXXX-XXXX");
        Payment payment2 = new UpiPayment(1500, "user@upi");

        payment1.processPayment();
        payment2.processPayment();
    }
}

