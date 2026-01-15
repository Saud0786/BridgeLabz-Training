package com.examcell;
import java.util.*;

public class ExamCellApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // call mergeSort
        ExamCell.mergeSort(scores, 0, n - 1);

        System.out.println("Rank List:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + scores[i]);
        }

        sc.close();
    }
}





