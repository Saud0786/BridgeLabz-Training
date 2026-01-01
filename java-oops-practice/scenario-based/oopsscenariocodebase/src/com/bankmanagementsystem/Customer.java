package com.bankmanagementsystem;
import java.util.*;
//Customer class
class Customer {
  public String name;
  private Account account;

 // Constructor
 public Customer(String name, Account account) {
     this.name = name;
     this.account = account;
 }

 // Perform operations
 public void performTransactions() {
     System.out.println("Customer Name: " + name);
     Scanner sc = new Scanner(System.in);
     
     // Deposit
     System.out.println("Do you want to deposit?(y/n)");
     char depositChoise = sc.next().toLowerCase().charAt(0);
     if(depositChoise=='y') {
    	 System.out.println("Enter amount:");
    	 int amount = sc.nextInt();
    	 if(amount>0) {
    		 account.deposit(amount);
    	 }else {
    		 System.out.println("Invalid amount");
    	 }
     }
     
     // Withdraw
     System.out.println("Do you want to withdraw?(y/n)");
     char withdrawChoise = sc.next().toLowerCase().charAt(0);
     if(withdrawChoise=='y') {
    	 System.out.println("Enter amount:");
    	 int amount = sc.nextInt();
    	 if(amount>0) {
    		 account.withdraw(amount);
    	 }else {
    		 System.out.println("Invalid amount");
    	 }
     }
     
     // Balance check
     account.displayBalance();
 }
 
}
