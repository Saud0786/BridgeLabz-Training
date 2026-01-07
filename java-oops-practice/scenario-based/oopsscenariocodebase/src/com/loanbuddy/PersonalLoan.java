package com.loanbuddy;
public class PersonalLoan extends LoanApplication {

    public PersonalLoan(int term, Applicant applicant) {
        super("Personal Loan", term, 13.0, applicant);
    }

    // discount for personal loan
    @Override
    public double calculateEMI() {
        return baseEMI() * 1.10; 
    }
}
