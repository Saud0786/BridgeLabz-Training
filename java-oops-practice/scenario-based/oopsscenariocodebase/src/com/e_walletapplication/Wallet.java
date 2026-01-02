package com.e_walletapplication;

// Base wallet with encapsulated balance
public abstract class Wallet implements Transferrable{
    private double balance;

    public Wallet(double initialBalance){
        this.balance=initialBalance;
    }

    // Optional referral bonus
    public Wallet(double initialBalance,double referralBonus){
        this.balance=initialBalance+referralBonus;
    }

    protected double getInternalBalance(){
        return balance;
    }

    protected void credit(double amount){
        balance+=amount;
    }

    protected void debit(double amount){
        balance-=amount;
    }

    // Public read-only access
    public double getBalance(){
        return balance;
    }
}

