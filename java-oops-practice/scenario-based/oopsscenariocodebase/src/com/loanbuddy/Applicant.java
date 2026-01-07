package com.loanbuddy;

public class Applicant {
    private String name;
    private int creditScore;     
    private double income;
    private double loanAmount;

    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    protected int getCreditScore() {   
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
    
    public  void printApplicantDetails() {
    	System.out.println("----Applicant details-----");
    	System.out.println("Name: "+name);
    	System.out.println("Credit Score: "+creditScore);
    	System.out.println("Income: "+income);
    	System.out.println("Loan Amount: "+loanAmount);
    	
    }
}
