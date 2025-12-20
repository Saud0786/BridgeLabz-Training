import java.util.Scanner;
public class SumOfNaturalNumber{
   // create a method for find sum of natural numbers
   public static int SumNartual(int n){
     int sum = 0;
	 for(int i=1;i<=n;i++){
	  sum+=i;
	 }
	 return sum;
   }

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for number
      System.out.println("Enter a number: ");
	  int number = sc.nextInt();
	  
	  // calling method for natural number sum
	  int sum = SumNartual(number);
	  System.out.println("Sum of n natural number is "+sum);
  }
}