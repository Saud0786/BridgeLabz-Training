package com.medwarehouse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MedWarehouseApp {
	
	// Merge Sort
    public static void mergeSort(Medicine[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted parts (stable)
    public static void merge(Medicine[] arr, int left, int mid, int right) {

        Medicine[] temp = new Medicine[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].Expirydate.isBefore(arr[j].Expirydate)) { 
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


        System.out.print("Enter number of branches: ");
        int states = sc.nextInt();
        sc.nextLine(); 

        ArrayList<Medicine> allMedicines = new ArrayList<>();

        for (int s = 1; s <= states; s++) {
            System.out.print("\nEnter number medicine in branch " + s + ": ");
            int n = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter Medicine details:");

            for (int i = 0; i < n; i++) {
            	System.out.println("Enter Medicine name "+ (i+1)+ " :");
                String name = sc.nextLine();
                System.out.println("Enter Expiry Date (yyyy-MM-dd HH:mm):");
                String time = sc.nextLine(); 

                LocalDateTime ExpiryDate =
                        LocalDateTime.parse(time, formatter); 
                allMedicines.add(new Medicine(name, ExpiryDate));
            }
        }

        // Convert list to array
        Medicine[] medicines = allMedicines.toArray(new Medicine[0]);

        // Merge Sort final list
        mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nFinal list of medicines according to expiryDate:");
        for (Medicine s : medicines) {
            System.out.println(s);
        }
        
        sc.close();
    }
}
