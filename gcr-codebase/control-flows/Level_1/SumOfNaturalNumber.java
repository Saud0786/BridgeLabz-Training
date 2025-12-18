import java.util.Scanner;
public class SumOfNaturalNumber{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
	  
      //  Get input value for number
	   System.out.println("Enter Number: ");
	   int number = sc.nextInt();
	   
	  // check the number is positive or not
        if(number>=0){
		  int sum = number*(number+1)/2;
		  System.out.println("The sum of "+ number  +" natural numbers is "+ sum);
		}else {
		 System.out.println("The number "+ number  +" is not a natural number");
		 }	  
	   
      
  }
}