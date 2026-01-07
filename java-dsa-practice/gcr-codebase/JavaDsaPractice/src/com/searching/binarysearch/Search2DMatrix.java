package com.searching.binarysearch;
import java.util.Scanner;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int rows, int cols, int target) {

        // Treat the matrix as a 1D array
        int left = 0;
        int right = rows * cols - 1;

        // Binary search on the virtual 1D array
        while (left <= right) {
            int mid = (left + right) / 2;

            // Convert 1D index to 2D indices
            int row = mid / cols;
            int col = mid % cols;

            // Check middle element
            if (matrix[row][col] == target) {
                return true;
            }

            // Search left half
            if (matrix[row][col] > target) {
                right = mid - 1;
            }
            // Search right half
            else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Method call
        boolean found = searchMatrix(matrix, rows, cols, target);
        System.out.println(found);
        sc.close();
    }
}
