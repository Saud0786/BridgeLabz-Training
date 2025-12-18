import java.util.Scanner;
public class ValidVoter{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
	  
      //  Get input value for age
      System.out.println("Enter Your Age: ");
	  int age = sc.nextInt();
	  
	  // check user can vote or not
	  if(age>=18){
	   System.out.println("The person's age is "+ age + " and can vote.");
	  }else{
	   System.out.println("The person's age is "+ age + " and cannot vote.");
	  }
  }
}