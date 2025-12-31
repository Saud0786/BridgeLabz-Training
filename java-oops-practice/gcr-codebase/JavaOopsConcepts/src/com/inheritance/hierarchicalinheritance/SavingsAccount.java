package com.inheritance.hierarchicalinheritance;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method specific to SavingsAccount
    public void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}