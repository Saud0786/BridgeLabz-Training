import java.util.Scanner;

public class PlusOne {
    // method to add one to the number array
    public static int[] plusOne(int[] digits){
        int n=digits.length;

        // start from last digit and handle carry
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            // if digit is 9 make it 0
            digits[i]=0;
        }

        // if all digits were 9 create new array
        int[] newArray=new int[n+1];
        newArray[0]=1;
        return newArray;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // take size of digits array
        System.out.print("Enter number of digits: ");
        int n=sc.nextInt();
        int[] digits=new int[n];
        // Take digits input
        System.out.println("Enter digits:");
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }

        // plusOne method
        int[] result=plusOne(digits);

        // Print result array
        System.out.print("Result after plus one: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
