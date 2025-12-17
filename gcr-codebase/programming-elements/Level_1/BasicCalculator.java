import java.util.Scanner;
public class BasicCalculator  {

    public static void main(String[] args) {
     //Creating variables to store  
      int number1,number2;
    
     // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

     // Taking input from user 
      System.out.println("Enter first Number: ");
      number1 = sc.nextInt();
      System.out.println("Enter second Number: ");
      number2 = sc.nextInt();

      // Perform addition, subtraction, multiplication and division
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;


      // Printing all calculated value
       System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1 +" and "+number2 +" is "+ addition +", "+subtraction+", "+multiplication+" and "+ division);  
     
    }
}