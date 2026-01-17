package com.fleetmanager;
import java.util.Arrays;
import java.util.Scanner;


public class FleetManagerMergeSort {

    // Merge Sort
    public static void mergeSort(Vehicle[] vehicles, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid + 1, right);

            merge(vehicles, left, mid, right);
        }
    }

    // Merge function
    public static void merge(Vehicle[] vehicles, int left, int mid, int right) {

        Vehicle[] leftArr = Arrays.copyOfRange(vehicles, left, mid + 1);
        Vehicle[] rightArr = Arrays.copyOfRange(vehicles, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i].mileage <= rightArr[j].mileage) {
                vehicles[k++] = leftArr[i++];
            } else {
                vehicles[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length) {
            vehicles[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            vehicles[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Vehicle ID: ");
            String id = sc.next();

            System.out.print("Enter Mileage: ");
            int mileage = sc.nextInt();

            vehicles[i] = new Vehicle(id, mileage);
        }

        mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println("\nMaster Vehicle Maintenance Schedule:");
        System.out.println(Arrays.toString(vehicles));

        sc.close();
    }
}
