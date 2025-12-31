package com.inheritance.hierarchicalinheritance;

public class BankManagementSystem {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount checking = new CheckingAccount("CA202", 30000, 10000);
        BankAccount fixedDeposit = new FixedDepositAccount("FD303", 100000, 5);

        System.out.println("----- Savings Account -----");
        savings.displayAccountDetails();
        ((SavingsAccount) savings).displayAccountType();

        System.out.println("\n----- Checking Account -----");
        checking.displayAccountDetails();
        ((CheckingAccount) checking).displayAccountType();

        System.out.println("\n----- Fixed Deposit Account -----");
        fixedDeposit.displayAccountDetails();
        ((FixedDepositAccount) fixedDeposit).displayAccountType();
    }
}