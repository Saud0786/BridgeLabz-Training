import java.util.Scanner;
public class LeapYear{
  public static void main(String args[]){  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take year input
	   System.out.println("Enter Year : ");
	   int year = sc.nextInt();
	  
	  // check year is valid for Gregorian calendar
	    if(year >= 1582){
		  
		  // check all condition for leap year
		  if(year % 400 == 0){
			  System.out.println("Year is a Leap Year");
		  }
		   else if(year % 100 == 0){
			  System.out.println("Year is not a Leap Year");
		  }
		   else if(year % 4 == 0){
			  System.out.println("Year is a Leap Year");
		  }
		   else{
			  System.out.println("Year is not a Leap Year");
		   }
	   }else{
		  System.out.println("Year should be greater than or equal to 1582");
	    }
  }
}
