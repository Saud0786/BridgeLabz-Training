package com.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term;
    protected double interestRate;
    protected Applicant applicant;

    private String loanStatus;

    // Loan Application
    public LoanApplication(String loanType, int term, double interestRate, Applicant applicant) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.applicant = applicant;
        this.loanStatus = "PENDING";
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    // Base EMI
    protected double baseEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
