import java.util.Scanner;
public class Factorial{
    // Factorial using Recursion
   public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value
      System.out.println("Enter a number:");
	  int n = sc.nextInt();
	  
	  // Display result
	  System.out.println("Factorial of "+n+" is "+factorial(n));
  }
}