import java.util.*;

public class JumpGameChecker {

    // This method checks if we can reach the last index
    public static boolean canReachEnd(int[] arr) {

        // Last index we need to reach
        int lastIndex = arr.length - 1;

        // Traverse array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {

            // If current index can reach or cross lastIndex
            if (arr[i] + i >= lastIndex) {
                lastIndex = i;
            }
        }
	
        return lastIndex == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check jump possibility
        boolean result = canReachEnd(arr);

        // Output result
        if (result) {
            System.out.println("Can reach the last index");
        } else {
            System.out.println("Cannot reach the last index");
        }
        sc.close();
    }
}
