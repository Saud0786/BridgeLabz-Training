import java.util.Scanner;

public class QuotientAndRemainder {
   public static void main(String args[]) {

      // Creating variables to store two numbers
      int number1, number2;

      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

      // Taking numbers from user
      System.out.println("Enter first number: ");
      number1 = sc.nextInt();
      System.out.println("Enter second number: ");
      number2 = sc.nextInt();

      // Calculate quotient using division operator
      int quotient = number1 / number2;

      // Calculate remainder using modulus operator
      int remainder = number1 % number2;

      // Display the result
      System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +" of two numbers " + number1 +" and " + number2);
   }
}
