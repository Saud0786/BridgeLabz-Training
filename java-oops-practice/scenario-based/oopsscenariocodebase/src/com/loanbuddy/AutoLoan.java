package com.loanbuddy;
public class AutoLoan extends LoanApplication {

    public AutoLoan(int term, Applicant applicant) {
        super("Auto Loan", term, 10.5, applicant);
    }

    // EMI calculation
    @Override
    public double calculateEMI() {
        return baseEMI(); 
    }
}
