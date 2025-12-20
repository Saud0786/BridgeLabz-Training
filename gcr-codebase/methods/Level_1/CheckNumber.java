import java.util.Scanner;
public class CheckNumber{
	 // create method for check number
	 public static void checkNumber(int number){
		 if(number>0){
			 System.out.println("The number positive.");
		 }else if(number==0){
			 System.out.println("The number Zero.");
		 }else{
			 System.out.println("The number negative.");
		 }
	 }
	
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
	  
      //  Get input value for number
      System.out.println("Enter a number: ");
	  int number = sc.nextInt();
	  
	  // method call for check Number
	  checkNumber(number);
  }
}