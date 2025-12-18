import java.util.Scanner;
public class CheckSmallest{
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
	   

       // check first number is smallest or not
	    boolean isSmallest = (number1<number2 && number1<number3)?true:false;
        if(isSmallest){
          	System.out.println("Is the first number the smallest? " + isSmallest);
         } else {
            System.out.println("Is the first number the smallest? "+ isSmallest);
         } 			
	  
      
  }
}