import java.util.Scanner;
public class PrimeNumber{
  public static void main(String args[]){
	  // Create Scanner object
	    Scanner sc = new Scanner(System.in);
	  
	  // take number input from user
	   System.out.println("Enter a number : ");
	  int number = sc.nextInt();
	  
	  // initialize isPrime variable
	  boolean isPrime = true;
	  
	  // prime number check
	   if(number > 1){
		  for(int i = 2; i < number; i++){
			  if(number % i == 0){
				  isPrime = false;
				  break;
			  }
		  }
		  // print result
		  if(isPrime){
			  System.out.println(number + " is a Prime Number");
		  }else{
			  System.out.println(number + " is not a Prime Number");
		  }
	   }else{
		  System.out.println("Prime number is greater than 1");
	   }
  }
}
