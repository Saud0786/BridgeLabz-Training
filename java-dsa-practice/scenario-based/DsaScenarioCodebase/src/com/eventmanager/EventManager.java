package com.eventmanager;
import java.util.Scanner;

public class EventManager {
     
	public static int partition(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low; j<high; j++) {
			
			// swap
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		
		return i;
		
	}
	
	public static void quickSort(int arr[], int low, int high) {
		
		if(low < high) {
			int pivot = partition(arr, low, high);
			
			// recursion call
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	
	public static void displayElement(int arr[]) {
		
		System.out.println("Sorted list:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter of number tickets:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+ " num:");
			arr[i] = sc.nextInt();
		}
		
		// calling quickSort 
		quickSort(arr,0,n-1);
		
		// print sorted array
		displayElement(arr);
		
		
	}
}
