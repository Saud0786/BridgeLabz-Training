import java.util.Scanner;
public class FactorialWhile{
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
	    while(copyNumber>1){
		  factorial*=copyNumber;
		  copyNumber--;
		}
		System.out.println("The factorial of "+number+ " is "+factorial);
	  }else{
		  System.out.println("Please Enter positive number.");
	  }
  }
}