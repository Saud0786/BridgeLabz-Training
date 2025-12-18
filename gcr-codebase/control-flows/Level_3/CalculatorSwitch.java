import java.util.Scanner;
public class CalculatorSwitch{
  public static void main(String args[]){  
	  // Create Scanner object
	    Scanner sc = new Scanner(System.in);
	  
	 // Take first number input
	  System.out.println("Enter first number :");
	  double first = sc.nextDouble();
	  System.out.println("Enter second number :");
	  double second = sc.nextDouble();
	  
	  // Take operator input
	   System.out.println("Enter operator (+ , - , * , /) :");
	    String op = sc.next();
	  
	  // switch case to perform operation
	    switch(op){
		  case "+":
			  System.out.println("Result = " + (first + second));
			  break;
			  
		  case "-":
			  System.out.println("Result = " + (first - second));
			  break;
			  
		  case "*":
			  System.out.println("Result = " + (first * second));
			  break;
			  
		  case "/":
			  if(second != 0){
				  System.out.println("Result = " + (first / second));
			  }else{
				  System.out.println("Division by zero not allowed");
			  }
			  break;
			  
		  default:
			  System.out.println("Invalid Operator");
	  }
  }
}
