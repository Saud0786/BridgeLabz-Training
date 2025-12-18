import java.util.Scanner;
public class Multiplication{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for number
      System.out.println("Enter a number:");
	  int number = sc.nextInt();
	  
	  
	  // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
		
  }
}