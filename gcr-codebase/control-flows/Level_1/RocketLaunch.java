import java.util.Scanner;
public class RocketLaunch{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for counter
      System.out.println("Enter counter value :");
	  int counter = sc.nextInt();
	  
	  // counting using for loop
      	for(int count=counter;count>=1;count--){
           System.out.println(count);
		}		
	  
  }
}