package com.smartcheckout;

import java.util.HashMap;
import java.util.Scanner;

public class SmartCheckoutSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();
        checkout.displayStock();
        System.out.println("\n");

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine(); 

            System.out.print("\nEnter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of items: ");
            int itemCount = sc.nextInt();

            HashMap<String, Integer> items = new HashMap<>();

            for (int j = 1; j <= itemCount; j++) {
                sc.nextLine(); 

                System.out.print("Enter item name: ");
                String itemName = sc.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                items.put(itemName, quantity);
            }

            Customer customer = new Customer(name, items);
            checkout.addCustomer(customer);
        }

        // Process all customers
        System.out.println("\n--- Processing Checkout Queue ---");
        while (true) {
            checkout.processCustomer();
            checkout.displayStock();

            System.out.print("\nProcess next customer? (yes/no): ");
            sc.nextLine();
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Thank you for using Smart Checkout app.");

        sc.close();
    }
}
