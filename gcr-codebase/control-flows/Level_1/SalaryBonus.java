import java.util.Scanner;
public class SalaryBonus{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for year and salary
      System.out.println("Enter your salary: ");
	  double salary = sc.nextInt();
	  System.out.println("Enter your Service Year: ");
	  double serviceYear = sc.nextInt();
      
      if(serviceYear>=5){
	    double bonus = salary*0.05;
		System.out.println("Your salary is "+ salary + " and bonus is "+ bonus);
	   
	  }else{
	     System.out.println("You are not eligible for bonus.");
	  }	  
  }
}