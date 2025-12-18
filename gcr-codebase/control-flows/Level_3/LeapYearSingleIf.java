import java.util.Scanner;
public class LeapYearSingleIf{
  public static void main(String args[]){
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take year input
	   System.out.println("Enter Year :");
	   int year = sc.nextInt();
	  
	  // check year is valid and leap year using logical operators
	  if(year >= 1582 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)){
		  System.out.println("Year is a Leap Year");
	  }else{
		  System.out.println("Year is not a Leap Year");
	  }
  }
}
