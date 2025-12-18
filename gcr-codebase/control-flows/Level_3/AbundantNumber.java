import java.util.Scanner;
public class AbundantNumber{
  public static void main(String args[]){ 
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	  System.out.println("Enter a number :");
	  int number = sc.nextInt();
	  int sum = 0;
	  
	  // loop to find divisors
	  for(int i = 1; i < number; i++){
		  if(number % i == 0){
			  sum = sum + i;
		  }
	  }
	  
	  // check abundant condition
	  if(sum > number){
		  System.out.println("Abundant Number");
	  }else{
		  System.out.println("Not an Abundant Number");
	  }
  }
}
