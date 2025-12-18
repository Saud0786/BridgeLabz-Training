import java.util.Scanner;
public class FactorialFor{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for number
      System.out.println("Enter a number:");
	  int number = sc.nextInt();
	  int copyNumber=number;
	  
	  // finding factorial using while
	  int factorial = 1;
	  if(copyNumber>0){
	    for(int i=copyNumber;i>=1;i--){
		    factorial*=i;
		}
		System.out.println("The factorial of "+number+ " is "+factorial);
	  }else{
		  System.out.println("Please Enter positive number.");
	  }
  }
}