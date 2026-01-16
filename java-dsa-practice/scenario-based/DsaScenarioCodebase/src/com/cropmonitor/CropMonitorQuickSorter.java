package com.cropmonitor;
import java.util.*;

public class CropMonitorQuickSorter {

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Sort left and right parts
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition based on pivot
    private static int partition(int[] arr, int low, int high) {
    	
    	// choose last element as pivot
        int pivot = arr[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        int[] timestamps = new int[n];

        System.out.println("Enter sensor timestamps:");
        for (int i = 0; i < n; i++) {
            timestamps[i] = sc.nextInt();
        }

        // Sort timestamps using Quick Sort
        quickSort(timestamps, 0, n - 1);

        System.out.println("Sorted Sensor Data by Timestamp:");
        for (int t : timestamps) {
            System.out.print(t + " ");
        }

        sc.close();
    }
}
