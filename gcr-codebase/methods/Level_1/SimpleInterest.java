import java.util.Scanner;
public class SimpleInterest{
	
	// method for simpleInterest calculation
	 public static int calculateSimpleInterest(int principle,int rate,int time){
	     return (principle*rate*time)/100;
	 }
	
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for principle , rate, time
        System.out.println("Enter Principal: ");
		int principle = sc.nextInt();
		System.out.println("Enter Rate: ");
		int rate = sc.nextInt();
		System.out.println("Enter Time: ");
		int time = sc.nextInt();
		
	 // Calling simple interest method and print
       int simpleInterest = calculateSimpleInterest(principle,rate,time);
       System.out.println("The Simple Interest is "+ simpleInterest + " for Principal "+ principle + " ,Rate of Interest "+rate+" and time "+time +" years.");	   
  }
}