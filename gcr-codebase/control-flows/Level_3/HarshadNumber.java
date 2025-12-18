import java.util.Scanner;
public class HarshadNumber{
  public static void main(String args[]){  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	    // Take number input
	    System.out.println("Enter a number :");
	    int number = sc.nextInt();
	    int originalNumber = number;
	    int sum = 0;
	  
	  // loop to find sum of digits
	  while(number != 0){
		  int digit = number % 10;
		  sum = sum + digit;
		  number = number / 10;
	  }
	  
	  // check harshad number
	   if(originalNumber % sum == 0){
		  System.out.println("Harshad Number");
	   }else{
		  System.out.println("Not a Harshad Number");
	     }
  }
}
