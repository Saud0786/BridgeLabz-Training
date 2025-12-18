import java.util.Scanner;
public class GreatestFactorWhile{
  public static void main(String args[]){
	 // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	  System.out.println("Enter number :");
	   int number = sc.nextInt();
	  
	  // initialize greatest factor
	    int greatestFactor = 1;
		int counter = number-1;
	  
	  // find greatest factor using loop
	 // while loop
	   while(counter >= 1){
		  if(number % counter == 0){
			  greatestFactor = counter;
			  break;
		  }
		  counter--;
	   }
	  
	  // print greatestFactor
	  System.out.println("Greatest Factor is " + greatestFactor);
  }
}
