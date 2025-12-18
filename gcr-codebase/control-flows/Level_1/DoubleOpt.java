import java.util.Scanner;
public class DoubleOpt  {
  public static void main(String args[]){
    // Creating variables to store a,b,c
       double a,b,c;
	
	// Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter decimal value of a: ");
	  a = sc.nextDouble();
	  System.out.println("Enter decimal value of b: ");	  
	  b = sc.nextDouble();
	  System.out.println("Enter decimal value of c: ");	  
	  c = sc.nextDouble();
	  
	// Integer Operation
	double operation1 = a + b *c;
	double operation2 = a * b + c;
	double operation3 = c + a / b;
	double operation4 = a % b + c;
	
	// Printing all result
    System.out.println("The results of Int Operations are "+ operation1 + ", " + operation2 + ", " + operation3 + " and " + operation4);
  }
}