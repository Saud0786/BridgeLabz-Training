import java.util.Scanner;
public class RemainderQuotiend{
   public static int[] findRemainderAndQuotient(int number, int divisor){
       int arr[] = new int[2];
	   int remainder = number%divisor;
	   int quotient = number/divisor;
	   arr[0]= remainder;
	   arr[1] = quotient;
	   return arr;
   } 

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter number:");
	  int number = sc.nextInt();
	  System.out.println("Enter divisor:");
	  int divisor = sc.nextInt();
	  
	  // call method for RemainderQuotiend
	  int arr[] = findRemainderAndQuotient(number,divisor);
	  System.out.println("Remainder: "+ arr[0] +" quotient: "+ arr[1]);
  }
}