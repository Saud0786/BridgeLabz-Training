package com.icecreamrush;
import java.util.Arrays;
import java.util.Scanner;

public class IceCreamRushBubbleSort {

    // Bubble Sort based on sales
    public static void bubbleSort(Flavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].sales > flavors[j + 1].sales) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of flavors: ");
        int n = sc.nextInt();

        Flavor[] flavors = new Flavor[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter flavor name: ");
            String name = sc.next();

            System.out.print("Enter sales count: ");
            int sales = sc.nextInt();

            flavors[i] = new Flavor(name, sales);
        }

        bubbleSort(flavors);

        System.out.println("\nFlavors sorted by popularity:");
        System.out.println(Arrays.toString(flavors));

        sc.close();
    }
}
