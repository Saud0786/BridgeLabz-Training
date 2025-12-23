import java.util.Scanner;
public class BasicCalculator{
    // method of add
    public static int add(int a, int b) { 
	return a + b; 
	}
	// method of subtract
    public static int subtract(int a, int b) { 
	return a - b; 
	}
	// method of multiply
    public static int multiply(int a, int b) { 
	return a * b; 
	}
	// method of divide
    public static double divide(int a, int b) { 
	return (double) a / b; 
	}

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value
      System.out.println("Enter first number:");
	  int number1= sc.nextInt();
	  System.out.println("Enter second number:");
	  int number2 = sc.nextInt();
	  
	  // Display result
	  System.out.println("Addition of two numbers:"+add(number1,number2));
	  System.out.println("Subtract of two numbers:"+subtract(number1,number2));
	  System.out.println("Multiply of two numbers:"+multiply(number1,number2));
	  System.out.println("Divide of two numbers:"+divide(number1,number2));
  }
}