import java.util.Scanner;
public class BMI{
  public static void main(String args[]){ 
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take weight input
	  System.out.println("Enter weight in kg :");
	   double weight = sc.nextDouble();
	   System.out.println("Enter height in cm : ");
	   double height = sc.nextDouble();
	  
	  // convert height from cm to meter
	    height = height / 100;
	  
	  // calculate BMI
	    double bmi = weight / (height * height);
	   System.out.println("BMI is : " + bmi);
	  
	  // check BMI status
	  if(bmi <= 18.4){
		  System.out.println("Status : Underweight");
	   } else if(bmi >= 18.5 && bmi <= 24.9){
		  System.out.println("Status : Normal");
	   }else if(bmi >= 25.0 && bmi <= 39.9){
		  System.out.println("Status : Overweight");
	   }else{
		  System.out.println("Status : Obese");
	   }
  }
}
