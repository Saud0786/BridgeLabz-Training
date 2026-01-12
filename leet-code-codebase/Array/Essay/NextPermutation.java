import java.util.Scanner;

public class NextPermutation {

    // Method to generate the next permutation
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Find the first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If such element exists, find just larger element and swap
        if (i >= 0) {
            int j = n - 1;
            while (arr[i] >= arr[j]) {
                j--;
            }
            swap(arr, i, j);
        }

        // Reverse the remaining suffix
        reverse(arr, i + 1, n - 1);
    }

    //Method swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility method to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextPermutation(arr);
        System.out.println("Next Permutation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
