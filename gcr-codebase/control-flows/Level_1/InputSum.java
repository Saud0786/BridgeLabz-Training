import java.util.Scanner;
public class InputSum{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for number
      System.out.println("Enter a Number: ");
	  double total =0.0;
	  double number = sc.nextDouble();
	  while(number!=0){
	    total+=number;
	    System.out.println("Enter a Number: ");
		number= sc.nextDouble();
	  }
	  
	  // printing final sum
	  System.out.println(total);
  }
}