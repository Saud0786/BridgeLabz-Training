import java.util.Scanner;
public class NumberCheck{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for number
      System.out.println("Enter a number: ");
	  int number = sc.nextInt();
	  
	  // check number is positive, negative or zero
	  if(number==0){
	     System.out.println("The number is zero.");
	  }else if(number>=1){
	     System.out.println("The number is positive.");
	  }else{
	     System.out.println("The number is negative.");
	  }
  }
}