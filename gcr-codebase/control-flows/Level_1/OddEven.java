import java.util.Scanner;
public class OddEven{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
	  
      //  Get input value for number
      System.out.println("Enter a Natural number:");
	  int number = sc.nextInt();
	  if(number>0){
	     for(int num = 1;num<=number;num++){
		   if(num%2==0){
		     System.out.println(num+" is even.");
		   }else{
		     System.out.println(num+" is odd.");
		   }
		   
		 }
	  }else{
	      System.out.println("Please eneter valid number.");
	  }
	  
  }
}