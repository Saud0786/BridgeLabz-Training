import java.util.Scanner;
public class MultiplesWhile{
  public static void main(String args[]){
	   // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	   System.out.println("Enter number : ");
	   int number = sc.nextInt();
	  
	  // initialize counter
	    int counter = 100;
	  
	  // check condition
	   if(number > 0 && number < 100){
		  while(counter > 1){
			   if(counter % number == 0){
				  System.out.println(counter);
			  }
			  counter--;
		  }
	   }
  }
}
