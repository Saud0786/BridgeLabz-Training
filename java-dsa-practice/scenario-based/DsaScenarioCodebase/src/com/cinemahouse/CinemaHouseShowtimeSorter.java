package com.cinemahouse;
import java.util.*;

public class CinemaHouseShowtimeSorter {

    // Bubble Sort to sort movie showtimes
    public static void bubbleSort(int[] times) {

        int n = times.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if order is wrong
                if (times[j] > times[j + 1]) {
                    int temp = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movie shows: ");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        System.out.println("Enter show times (in minutes):");
        for (int i = 0; i < n; i++) {
            showTimes[i] = sc.nextInt();
        }

        // Sort showtimes using Bubble Sort
        bubbleSort(showTimes);

        System.out.println("Sorted Movie Show Times:");
        for (int t : showTimes) {
            System.out.print(t + " ");
        }

        sc.close();
    }
}

