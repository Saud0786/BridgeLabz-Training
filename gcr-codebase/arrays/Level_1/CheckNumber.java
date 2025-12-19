import java.util.Scanner;
public class CheckNumber{
  public static void main(String args[]){
	     // Create a Scanner Object
         Scanner sc = new Scanner(System.in);
	  
	     // Declare the elements of array(1D)
	     int numbers[] = new int[5];
	  
         //  Get input value for list of students
	     System.out.println("Enter 5 Numbers: ");
	     for(int i=0;i<numbers.length;i++){
		  numbers[i] = sc.nextInt();
		 }
		 
		 //  Check Numbers is positive,negative,and zero then print  
		 for(int i=0;i<numbers.length;i++){
		    if(numbers[i]>0){
			   // check odd and even
			   if(numbers[i]%2==0){
			     System.out.println("The number is "+ numbers[i] +" positive and even. ");
			   }else{
			     System.out.println("The number is "+ numbers[i] +" positive and odd. ");
			   }
			}else if(numbers[i]==0){
			  System.out.println("The number is "+ numbers[i]);
			}else {
			  System.out.println("The number is "+ numbers[i] +" negative.");
			}
		 }
		 
		 if(numbers[0]==numbers[numbers.length-1]){
		   System.out.println("The first and last number is equal.");
		 }else if(numbers[0] > numbers[numbers.length-1]){
		   System.out.println("The first number is greater than last number.");
		 }else{
		   System.out.println("The first number is less than last number.");
		 }
		 
		 
  }
}