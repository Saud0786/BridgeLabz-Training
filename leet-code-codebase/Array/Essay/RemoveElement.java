import java.util.Scanner;

public class RemoveElement {
    // static method to remove all occurrences of given value
    public static int removeElement(int[] nums,int val){
        int index=0;

        // traverse array and keep only elements not equal to val
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums=new int[n];

        // Take array elements
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        // Take value to remove
        System.out.print("Enter value to remove: ");
        int val=sc.nextInt();

        // call static method
        int k=removeElement(nums,val);

        // print result
        System.out.println("Count of elements not equal to "+val+": "+k);
        System.out.print("Array after removal: ");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
