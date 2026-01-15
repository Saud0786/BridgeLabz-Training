package com.budgetwise;

import java.util.HashMap;

class MonthlyBudget extends Budget {

    private String month;

    public MonthlyBudget(String month, double income, double limit,
                         HashMap<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
        this.month = month;
    }

    // generate report
    @Override
    public void generateReport() {
        System.out.println("\nMonthly Budget Report: " + month);
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    // detect over spend
    @Override
    public void detectOverspend() {
        HashMap<String, Double> spent = new HashMap<>();

        for (Transaction t : getTransactions()) {
            if (t.getType().equalsIgnoreCase("Expense")) {
                spent.put(t.getCategory(),
                        spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
            }
        }

        for (String category : categoryLimits.keySet()) {
            if (spent.getOrDefault(category, 0.0) > categoryLimits.get(category)) {
                System.out.println("Overspending in category: " + category);
            }
        }
    }
}
