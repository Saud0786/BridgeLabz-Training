import java.util.Scanner;
public class FactorsFor{
  public static void main(String args[]){
	  
	  // Create Scanner object
	    Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	   System.out.println("Enter number :");
	   int number = sc.nextInt();
	  
	  // check positive number
	    if(number > 0){
		  
		  // loop to find perfect factors
		  for(int i = 1; i < number; i++){
			  if(number % i == 0){
				  System.out.println(i);
			  }
		  }
	  }
  }
}
