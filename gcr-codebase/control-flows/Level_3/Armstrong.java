import java.util.Scanner;
public class Armstrong{
  public static void main(String args[]){ 
	  // Create Scanner object
	   Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	   System.out.println("Enter a number :");
	   int number = sc.nextInt();
	  
	  // initialize variables
	   int sum = 0;
	   int originalNumber = number;
	  
	  // while loop till originalNumber is not zero
	   while(originalNumber != 0){
		  int digit = originalNumber % 10;
		  sum = sum + (digit * digit * digit);
		  originalNumber = originalNumber / 10;
	      }
	  
	  // check armstrong condition
	   if(sum == number){
		  System.out.println(number + " is an Armstrong Number");
	   }else{
		  System.out.println(number + " is not an Armstrong Number");
	    }
  }
}
