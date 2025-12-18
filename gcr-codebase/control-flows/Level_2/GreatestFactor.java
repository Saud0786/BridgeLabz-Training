import java.util.Scanner;
public class GreatestFactor{
  public static void main(String args[]){
	  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	  System.out.println("Enter number :");
	   int number = sc.nextInt();
	  
	  // initialize greatest factor
	    int greatestFactor = 1;
	  
	  // find greatest factor using loop
	  for(int i = number - 1; i >= 1; i--){
		  if(number % i == 0){
			  greatestFactor = i;
			  break;
		  }
	  }
	  
	  // print greatestFactor
	  System.out.println("Greatest Factor is " + greatestFactor);
  }
}
