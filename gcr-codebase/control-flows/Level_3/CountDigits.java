import java.util.Scanner;
public class CountDigits{
  public static void main(String args[]){ 
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take integer input
	  System.out.println("Enter a number :");
	  int number = sc.nextInt();
	  
	  // initialize count variable
	  int count = 0;
	  // count digit logic
	  while(number != 0){
		  number = number / 10;
		  count++;
	  }
	  
	  // display number of digits
	  System.out.println("Number of digits are : " + count);
  }
}
