import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    // Method to remove duplicates and return new length
    public static int removeDuplicates(int[] nums) {
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {

            // Skip if current element is same as next element
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            // Store unique element at correct position
            nums[count] = nums[i];
            count++;
        }
        return count; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + k);
        sc.close();
    }
}
