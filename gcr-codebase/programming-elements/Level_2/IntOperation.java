import java.util.Scanner;
public class IntOperation {
  public static void main(String args[]){
    // Creating variables to store a,b,c
       int a,b,c;
	
	// Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter integer value of a: ");
	  a = sc.nextInt();
	  System.out.println("Enter integer value of b: ");	  
	  b = sc.nextInt();
	  System.out.println("Enter integer value of c: ");	  
	  c = sc.nextInt();
	  
	// Integer Operation
	int operation1 = a + b *c;
	int operation2 = a * b + c;
	int operation3 = c + a / b;
	int operation4 = a % b + c;
	
	// Printing all result
    System.out.println("The results of Int Operations are "+ operation1 + ", " + operation2 + ", " + operation3 + " and " + operation4);
  }
}