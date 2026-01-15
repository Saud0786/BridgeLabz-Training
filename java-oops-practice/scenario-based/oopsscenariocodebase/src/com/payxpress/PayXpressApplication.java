package com.payxpress;

import java.util.Scanner;

public class PayXpressApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       

        System.out.print("Select Bill Type (1-Electricity, 2-Water, 3-Internet): ");
        int type = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter due date: ");
        String dueDate = sc.nextLine();

        System.out.print("Is bill already paid? (true/false): ");
        boolean alreadyPaid = sc.nextBoolean();

        Bill bill = null;

        if (type == 1) {
            bill = new ElectricityBill(amount, dueDate);
        } else if (type == 2) {
            bill = new WaterBill(amount, dueDate);
        } else if (type == 3) {
            bill = new InternetBill(amount, dueDate);
        } else {
            System.out.println("Invalid bill type");
            sc.close();
            return;
        }

        if (alreadyPaid) {
            System.out.println("Bill already paid. No action required.");
        } else {
            bill.sendReminder();
            bill.pay();
        }

        System.out.println("Payment status: " + bill.isPaid());
        System.out.println("Late fee amount: " + bill.calculateLateFee());

        sc.close();
    }
}
