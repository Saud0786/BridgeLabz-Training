package com.bankmanagementsystem;

//Main class
public class BankMain {
 public static void main(String[] args) {

     // Savings account customer
     SavingsAccount savings = new SavingsAccount(5000, 5);
     Customer customer1 = new Customer("Saud", savings);

     customer1.performTransactions();
     savings.calculateInterest();
     savings.displayBalance();

     System.out.println("--------------------");

     // Current account customer
     CurrentAccount current = new CurrentAccount(3000);
     Customer customer2 = new Customer("Ashif", current);

     customer2.performTransactions();
 }
}
