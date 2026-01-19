package com.fitnesstracker;
import java.util.*;

public class FitnessTrackerApp {
	
	public static void bubbleSort(User arr[]) {
		// bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				// swap
				if(arr[j].steps > arr[j+1].steps) {
					User temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of user:");
		int n= sc.nextInt();
		
	   User users[] = new User[n];
	   
	   for(int i=0;i<n;i++) {
		   System.out.print("Enter user name: ");
           String name = sc.next();

           System.out.print("Enter step count: ");
           int steps = sc.nextInt();

           users[i] = new User(name, steps);
	   }
	   
	   // calling bubble sorting
	   bubbleSort(users);
	   
	   System.out.println("Sorted user data accorting to steps:");
	   System.out.println(Arrays.toString(users));
	}
}
