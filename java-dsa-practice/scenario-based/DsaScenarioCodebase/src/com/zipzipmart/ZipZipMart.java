package com.zipzipmart;
import java.util.*;

public class ZipZipMart {

    // Merge Sort
    public static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves
    public static void merge(Transaction[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            // Compare by date first, then amount
            if (L[i].date.compareTo(R[j].date) < 0 ||
               (L[i].date.compareTo(R[j].date) == 0 && L[i].amount <= R[j].amount)) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();

        Transaction[] transactions = new Transaction[n];

        // User input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Enter transaction amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            transactions[i] = new Transaction(date, amount);
        }

        // Sort transactions
        mergeSort(transactions, 0, n - 1);

        // Display sorted report
        System.out.println("\nDaily Sales Summary (Sorted):");
        for (Transaction t : transactions) {
            System.out.println(t.date + " | ₹" + t.amount);
        }

        sc.close();
    }
}





