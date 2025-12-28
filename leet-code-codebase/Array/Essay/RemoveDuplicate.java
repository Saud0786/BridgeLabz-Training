import java.util.Scanner;

public class RemoveDuplicate {

    // static method to remove duplicates from sorted array
    public static int removeDuplicates(int[] nums){
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                nums[count]=nums[i];
                count++;
            }
        }
        // return count of unique elements
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // Take size of array
        System.out.print("Enter array size: ");
        int n=sc.nextInt();

        int[] nums=new int[n];

        // Take sorted array elements
        System.out.println("Enter sorted array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        // Call method
        int k=removeDuplicates(nums);

        // Print result
        System.out.println("Count of unique elements: "+k);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
