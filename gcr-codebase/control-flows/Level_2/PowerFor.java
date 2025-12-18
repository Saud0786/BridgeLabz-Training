import java.util.Scanner;
public class PowerFor{
  public static void main(String args[]){  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number and power input
	   System.out.println("Enter number : ");
	   int number = sc.nextInt();
	   System.out.println("Enter power : ");
	   int power = sc.nextInt();
	  
	  // initialize result
	   int result = 1;
	  
	  // calculate power
	   for(int i = 1; i <= power; i++){
		  result = result * number;
	   }
	  
	  // print result
	   System.out.println("Result is " + result);
  }
}
