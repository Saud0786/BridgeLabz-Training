import java.util.Scanner;
public class FizzBuzzWhile{
  public static void main(String args[]){
	  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	  System.out.println("Enter number :");
	  int number = sc.nextInt();
	  
	  // initialize counter
	  int i = 1;
	  
	  // check positive number
	  if(number > 0){
		  while(i <= number){
			  if(i % 3 == 0 && i % 5 == 0){
				  System.out.println("FizzBuzz");
			  }else if(i % 3 == 0){
				  System.out.println("Fizz");
			  }else if(i % 5 == 0){
				  System.out.println("Buzz");
			  }else{
				  System.out.println(i);
			  }
			  i++;
		  }
	  }
  }
}
