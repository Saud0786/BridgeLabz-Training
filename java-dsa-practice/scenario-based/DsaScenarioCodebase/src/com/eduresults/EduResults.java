package com.eduresults;
import java.util.*;

public class EduResults {

    // Merge Sort
    public static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted parts (stable)
    public static void merge(Student[] arr, int left, int mid, int right) {

        Student[] temp = new Student[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].marks <= arr[j].marks) { 
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

        System.out.print("Enter number of states: ");
        int states = sc.nextInt();

        ArrayList<Student> allStudents = new ArrayList<>();

        for (int s = 1; s <= states; s++) {
            System.out.print("\nEnter number of students in State " + s + ": ");
            int n = sc.nextInt();

            System.out.println("Enter students (name & marks in sorted order):");

            for (int i = 0; i < n; i++) {
            	System.out.println("Enter Student name "+ (i+1)+ " :");
                String name = sc.next();
                System.out.println("Enter Student marks "+ (i+1)+ " :");
                int marks = sc.nextInt();
                allStudents.add(new Student(name, marks));
            }
        }

        // Convert list to array
        Student[] students = allStudents.toArray(new Student[0]);

        // Merge Sort final list
        mergeSort(students, 0, students.length - 1);

        System.out.println("\nFinal State-Wise Rank List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
