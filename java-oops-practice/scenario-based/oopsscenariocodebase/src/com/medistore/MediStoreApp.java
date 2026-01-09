package com.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Medicine 1
        System.out.println("Enter details for Medicine 1");

        System.out.print("Enter medicine type (1 = Tablet, 2 = Syrup): ");
        int type1 = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter medicine name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter price: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter expiry date (yyyy-mm-dd): ");
        LocalDate expiry1 = LocalDate.parse(sc.next());

        Medicine m1;
        if (type1 == 1) {
            m1 = new Tablet(name1, price1, expiry1);
        } else {
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            m1 = new Syrup(name1, price1, expiry1, qty);
        }

        // Medicine 2
        System.out.println("\nEnter details for Medicine 2");

        System.out.print("Enter medicine type (1 = Tablet, 2 = Syrup): ");
        int type2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter medicine name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter price: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter expiry date (yyyy-mm-dd): ");
        LocalDate expiry2 = LocalDate.parse(sc.next());

        Medicine m2;
        if (type2 == 1) {
            m2 = new Tablet(name2, price2, expiry2);
        } else {
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            m2 = new Syrup(name2, price2, expiry2, qty);
        }

        // Selling 
        System.out.print("\nEnter quantity to sell Medicine 1: ");
        int sellQty1 = sc.nextInt();

        System.out.println("Expired? " + !m1.checkExpiry());
        System.out.println("Total Bill: " + m1.sell(sellQty1));

        System.out.print("\nEnter quantity to sell Medicine 2: ");
        int sellQty2 = sc.nextInt();

        System.out.println("Expired? " + !m2.checkExpiry());
        System.out.println("Total Bill: " + m2.sell(sellQty2));

        sc.close();
    }
}
