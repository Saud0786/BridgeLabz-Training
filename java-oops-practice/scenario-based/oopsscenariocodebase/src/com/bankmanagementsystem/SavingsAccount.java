package com.bankmanagementsystem;

//SavingsAccount inherits Account
class SavingsAccount extends Account {
   private double interestRate;

   // Constructor
   public SavingsAccount(double balance, double interestRate) {
     super(balance); // Call parent constructor
     this.interestRate = interestRate;
   }

   // Calculate interest
   public void calculateInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added: " + interest);
   }
   
}
