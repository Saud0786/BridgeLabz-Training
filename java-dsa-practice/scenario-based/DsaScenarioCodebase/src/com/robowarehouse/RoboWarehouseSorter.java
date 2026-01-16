package com.robowarehouse;
import java.util.*;

public class RoboWarehouseSorter {

    // Insertion Sort to maintain ascending order of package weights
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
        	// current package weight
            int key = arr[i];      
            int j = i - 1;

            // shift heavier packages to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert package at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        // Sort weights using insertion sort
        insertionSort(weights);

        System.out.println("Packages arranged in ascending order:");
        for (int w : weights) {
            System.out.print(w + " ");
        }

        sc.close();
    }
}
