import java.util.Scanner;
public class FizzBuzz{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      // take number input
	  System.out.println("Enter a numbers: ");
	  int number = sc.nextInt();
	  Object FizzBuzz[] = new Object[number];
	  
	  // generate multiplication
	  int Index=0;
	  if(number>0){
	   for(int i=1;i<=number;i++){
	     if(i%3==0 && i%5==0){
		  FizzBuzz[Index++] = "FizzBuzz";
		 }else if(i%3==0){
		  FizzBuzz[Index++] = "Fizz";
		 }else if(i%5==0){
		  FizzBuzz[Index++] = "Buzz";
		 }else{
		  FizzBuzz[Index++] = i;
		 }
	      
	   }
	  }else{
	    System.out.println("Invalid input.");
	  }
	  
	  
	  // Print result
	  System.out.println("Print Array of result: ");
	  for(int i=0;i<FizzBuzz.length;i++){
		  System.out.println(FizzBuzz[i]);
	  }
  }
}