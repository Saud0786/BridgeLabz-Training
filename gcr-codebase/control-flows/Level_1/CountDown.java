import java.util.Scanner;
public class CountDown{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for counter
      System.out.println("Enter counter value :");
	  int counter = sc.nextInt();
	  
	  // counting using while loop
      while(counter>=1){
	   System.out.println(counter);
	   counter--; 
	  }		  
	  
  }
}