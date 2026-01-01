package com.paymentsystem;

//Parent class (Inheritance)
class BasePayment {
 protected double amount;  // protected for child access

 // Constructor
 public BasePayment(double amount) {
     this.amount = amount;
 }
}
