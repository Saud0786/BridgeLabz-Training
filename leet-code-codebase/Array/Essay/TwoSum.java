import java.util.Scanner;

public class TwoSum {

    // static method to find indices of two numbers whose sum equals target
    public static int[] twoSum(int[] nums,int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums=new int[n];

        // Take input array elements
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        // Target value
        System.out.print("Enter target sum: ");
        int target=sc.nextInt();

        // Calling twoSum method
        int[] result=twoSum(nums,target);

        // printing result indices
        System.out.println("Output indices: "+result[0]+" "+result[1]);
    }
}
