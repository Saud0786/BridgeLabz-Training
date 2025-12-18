import java.util.Scanner;
public class PowerWhile{
  public static void main(String args[]){ 
	  // Create Scanner object
	   Scanner sc = new Scanner(System.in);
	  
	  // Take number and power input
	   System.out.println("Enter number : ");
	   int number = sc.nextInt();
	   System.out.println("Enter power : ");
	   int power = sc.nextInt();
	  
	  // initialize variables
	   int result = 1;
	   int counter = 0;
	  
	  // while loop
	  while(counter != power){
		  result = result * number;
		  counter++;
	  }
	  
	  // print result
	  System.out.println("Result is " + result);
  }
}
