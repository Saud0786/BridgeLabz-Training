import java.util.Scanner;

public class SearchInsertPosition {

    // static method to find index 
    public static int searchInsert(int[] nums,int target){
        int start=0;
        int end=nums.length-1;

        // binary search
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        // Take sorted array elements
        System.out.println("Enter sorted array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        // Take target value
        System.out.print("Enter target value: ");
        int target=sc.nextInt();

        // Call searchInsert
        int index=searchInsert(nums,target);

        // Print result
        System.out.println("Search insert position: "+index);
    }
}
