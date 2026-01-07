package com.loanbuddy;
import java.util.Scanner;

public class LoanBuddyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        System.out.println("------Welcome to Loan Buddy-------");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();
        
        System.out.println("Enter Loan Type(Personal Loan/Auto Loan/Home Loan):");
        sc.nextLine();
        String loanType = sc.nextLine();
        loanType.toLowerCase().trim();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        LoanApplication loan;
        
        if(loanType.equals("home loan")) {
            loan = new HomeLoan(term, applicant);
        }else if(loanType.equals("auto loan")) {
        	loan = new AutoLoan(term, applicant);	
        }else {
        	loan = new PersonalLoan(term, applicant);
        }

        if (loan.approveLoan()) {
        	applicant.printApplicantDetails();
            System.out.println("\nLoan Approved!");
            System.out.println("Loan Type: "+loanType);
            System.out.println("Monthly EMI: ₹" + loan.calculateEMI());
        } else {
            System.out.println("\nLoan Rejected!");
        }

        System.out.println("Final Status: " + loan.getLoanStatus());
        sc.close();
    }
}
