import java.util.Scanner;
public class FizzBuzz{
  public static void main(String args[]){
	  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	  System.out.println("Enter number :");
	  int number = sc.nextInt();
	  
	  // check number is positive
	  if(number > 0){
		  
		  // loop from 1 to number
		  for(int i = 1; i <= number; i++){
			  
			  // check divisible by 3 and 5
			  if(i % 3 == 0 && i % 5 == 0){
				  System.out.println("FizzBuzz");
			  }else if(i % 3 == 0){
				  System.out.println("Fizz");
			  }else if(i % 5 == 0){
				  System.out.println("Buzz");
			  }else{
				  System.out.println(i);
			  }
		  }
	  }else{
		  System.out.println("Enter Positive Number");
	  }
  }
}
