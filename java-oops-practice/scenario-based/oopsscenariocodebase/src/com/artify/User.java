package com.artify;
public class User {
    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }
    
    // Wallet Balance
    public double getWalletBalance() {
        return walletBalance;
    }

    // balance deduct
    public void deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
        } else {
            throw new RuntimeException("Insufficient wallet balance");
        }
    }

    public String getName() {
        return name;
    }
}
