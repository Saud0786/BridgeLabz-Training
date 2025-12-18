import java.util.Scanner;
public class FactorsWhile{
  public static void main(String args[]){
	  
	  // Create Scanner object
	    Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	    System.out.println("Enter number :");
	    int number = sc.nextInt();
	  
	  // initialize counter
	    int counter = 1;
	  
	  // check positive number
	   if(number > 0){
		  while(counter < number){
			  if(number % counter == 0){
				  System.out.println(counter);
			  }
			  counter++;
		  }
	  }
  }
}
