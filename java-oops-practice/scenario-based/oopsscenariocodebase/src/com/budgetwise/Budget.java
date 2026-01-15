package com.budgetwise;

import java.util.ArrayList;
import java.util.HashMap;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected HashMap<String, Double> categoryLimits;

    private ArrayList<Transaction> transactions;

    public Budget(double income, double limit, HashMap<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // add transaction
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // total expenses
    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // calculate net saving
    public double calculateNetSavings() {
        return income - getTotalExpenses();
    }

    protected ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
