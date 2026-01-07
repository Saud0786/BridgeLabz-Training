package com.searching.binarysearch;
import java.util.Scanner;

public class FirstLastOccurrence {

    // Find first occurrence of target
    public static int firstOccurrence(int[] arr, int n, int target) {
        int left = 0, right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
            	 // store index
                result = mid;   
                // search right side
                right = mid - 1;       
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // Find last occurrence of target
    public static int lastOccurrence(int[] arr, int n, int target) {
        int left = 0, right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
            	 // store index
                result = mid;    
             // search right side
                left = mid + 1;        
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take input
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        // method call
        int first = firstOccurrence(arr, n, target);
        int last = lastOccurrence(arr, n, target);

        if (first == -1) {
            System.out.println("-1");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        }
        sc.close();
    }
}
