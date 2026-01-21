package com.tailorshop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TailorShopApp {

    public static void insertionSort(Order[] orders) {
        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;

            while (j >= 0 && orders[j].date.isAfter(key.date)) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Enter number of clothes:");
        int n = sc.nextInt();
        sc.nextLine(); 

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter name:");
            String name = sc.nextLine();

            System.out.println("Enter DateTime (yyyy-MM-dd HH:mm):");
            String time = sc.nextLine(); 

            LocalDateTime fr =
                    LocalDateTime.parse(time, formatter); 

            orders[i] = new Order(name, fr);
        }

        insertionSort(orders);

        System.out.println("\nSorted data:");
        for (Order or : orders) {
            System.out.println(or);
        }

        sc.close();
    }
}
