package com.searching.challengeproblem;
import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearch {

    // Linear Search to find first missing positive integer
    public static int firstMissingPositive(int[] arr, int n) {
        boolean[] visited = new boolean[n + 1];

        // Mark visited positive numbers
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // Find first missing positive
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return n + 1;
    }

    // Binary Search to find target index
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search result
        int missing = firstMissingPositive(arr, n);
        System.out.println("First Missing Positive Integer: " + missing);

        // Binary Search part
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        Arrays.sort(arr); // required for Binary Search
        int index = binarySearch(arr, target);

        System.out.println("Target Index after sorting: " + index);
        sc.close();
    }
}
