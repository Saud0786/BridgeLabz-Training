package com.budgetwise;
import java.util.HashMap;
import java.util.Scanner;

public class BudgetWiseApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");
        String month = scanner.nextLine();

        System.out.print("Enter monthly income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter overall expense limit: ");
        double limit = scanner.nextDouble();

        System.out.print("Enter number of categories: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        HashMap<String, Double> categoryLimits = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter category name: ");
            String category = scanner.nextLine();

            System.out.print("Enter limit for " + category + ": ");
            double catLimit = scanner.nextDouble();
            scanner.nextLine();

            categoryLimits.put(category, catLimit);
        }

        Budget budget = new MonthlyBudget(month, income, limit, categoryLimits);

        int choice;
        do {
            System.out.println("\n----- BUDGETWISE MENU -----");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Generate Report");
            System.out.println("4. Detect Overspending");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter income amount: ");
                    double inc = scanner.nextDouble();
                    scanner.nextLine();
                    budget.addTransaction(
                            new Transaction(inc, "Income", "N/A", "Income"));
                    break;

                case 2:
                    System.out.print("Enter expense amount: ");
                    double exp = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter category: ");
                    String cat = scanner.nextLine();

                    budget.addTransaction(
                            new Transaction(exp, "Expense", "N/A", cat));
                    break;

                case 3:
                    budget.generateReport();
                    break;

                case 4:
                    budget.detectOverspend();
                    break;

                case 5:
                    System.out.println("Exiting BudgetWise.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
