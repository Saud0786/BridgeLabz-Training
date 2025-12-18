import java.util.Scanner;
public class CheckLargest{
  public static void main(String args[]){
	  // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
	  
      //  Get input value for numbers
	   System.out.println("Enter Number1: ");
	   int number1 = sc.nextInt();
	   System.out.println("Enter one Number2: ");
       int number2 = sc.nextInt();
	   System.out.println("Enter one Number3: ");
       int number3 = sc.nextInt();
	   
	   // check which number is the largest one
	   boolean first=false;
	   boolean second =false;
	   boolean third = false;
	   if(number1>number2 && number1>number2){
            first=true;
	   }else if(number2>number1 && number2>number3){
		     second=true;
	   }else{
		     third=true;
	   } 
	  
      	  System.out.println("Is the first number the largest? "+first);
		  System.out.println("Is the second number the largest? "+second);
		  System.out.println("Is the third number the largest? "+third);
  }

}
