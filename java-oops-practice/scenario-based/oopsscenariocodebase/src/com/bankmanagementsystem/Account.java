package com.bankmanagementsystem;

//Base class Account
class Account {
 protected double balance;

    // Constructor
    public Account(double balance) {
      this.balance = balance;
    }

     // Deposit money
    public void deposit(double amount) {
    	
       if(amount>0) {
    	 balance += amount;
    	 System.out.println("Deposited: " + amount);
       }else {
    	 System.out.println("Invalid amount");  
       }
     
    }

    // Withdraw money
    public void withdraw(double amount) {
    	
       if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
       } else {
         System.out.println("Insufficient balance");
       }
       
    }

    // Display balance
    public void displayBalance() {
       System.out.println("Current Balance: " + balance);
    }
    
}
