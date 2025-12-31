package com.inheritance.hierarchicalinheritance;

public class BankAccount {

    protected String accountNumber;
    protected double balance;

    // Constructor to initialize common account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display basic account information
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
    
}