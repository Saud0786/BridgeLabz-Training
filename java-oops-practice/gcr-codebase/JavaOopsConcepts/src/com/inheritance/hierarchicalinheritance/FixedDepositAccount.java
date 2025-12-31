package com.inheritance.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {

    private int duration; // in years

    public FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    // Method specific to FixedDepositAccount
    public void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Duration     : " + duration + " years");
    }
}