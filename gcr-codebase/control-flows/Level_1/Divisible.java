import java.util.Scanner;
public class Divisible{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for number
	  System.out.println("Enter one Number: ");
	  int number = sc.nextInt();
	  
	  // check number is divisible by 5 or not
	  if(number%5==0){
         System.out.println("Is the number "+ number + " divisible by 5? true");
	   }else{
         System.out.println(" Is the number"+ number + " divisible by 5? false");
       } 		 
  }
}