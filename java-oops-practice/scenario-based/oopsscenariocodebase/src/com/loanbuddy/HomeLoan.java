package com.loanbuddy;
public class HomeLoan extends LoanApplication {

    public HomeLoan(int term, Applicant applicant) {
        super("Home Loan", term, 8.5, applicant);
    }

    // discount 0.95%
    @Override
    public double calculateEMI() {
        return baseEMI() * 0.95; 
    }
}
