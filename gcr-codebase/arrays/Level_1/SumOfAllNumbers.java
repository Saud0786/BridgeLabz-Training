import java.util.Scanner;
public class SumOfAllNumbers{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);

       // intilaize the double array
       double array[] = new double[10];
	   int index = 0;
	   double total = 0.0;

      // Get input value for
      System.out.println("Enter a number: ");
	  double number = sc.nextDouble();
	  while(true){
	     if(number<0 || number==0){
		   break;
		 }
		 if(index==10){
		   break;
		 }
		 
		 array[index++] = number;
		 System.out.println("Enter a number: ");
		 number = sc.nextDouble();
	  }
	  
	  // calculate sum of all numbers and print
	  for(int i=0;i<10;i++){
	    total+=array[i];
	  }
	  System.out.println("Total sum of array is "+total);
	  
  }
}