package com.hospitalpatientmanagementsystem;

//Implements billing calculation logic
public class Bill implements Payable{
 private double amount;
 private double taxRate;
 private double discount;

 public Bill(double amount,double taxRate,double discount){
     this.amount=amount;
     this.taxRate=taxRate;
     this.discount=discount;
 }

 // Calculate payment
 @Override
 public double calculatePayment(){
     double tax=amount*taxRate;
     return amount+tax-discount;
 }
}
