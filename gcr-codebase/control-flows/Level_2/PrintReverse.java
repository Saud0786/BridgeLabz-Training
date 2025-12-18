import java.util.Scanner;
public class PrintReverse{
  public static void main(String args[]){
	  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take number input
	  System.out.println("Enter number : ");
	  int number = sc.nextInt();
	  
	  // check condition 
	  if(number > 0 && number < 100){
		  
		  // reverse loop
		  for(int i = 100; i >= 1; i--){
			  if(i % number == 0){
				  System.out.println(i);
			  }
		  }
	  }
  }
}
