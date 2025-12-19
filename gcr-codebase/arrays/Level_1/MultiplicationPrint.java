import java.util.Scanner;
public class MultiplicationPrint{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input Number
      System.out.println("Enter a Number:");
	  int number = sc.nextInt();
	  
	  int multiplication[] = new int[4];
	  int index=0;
	  
	  // generate multiplication
	  for(int i=6;i<=9;i++){
	     multiplication[index++] = number*i;
	  }
	  
	  // print multiplication
	  System.out.println("Multiplication Table:");
	  for(int i=0;i<multiplication.length;i++){
	     System.out.println(number + " * " + (i+6) +" = "+ multiplication[i]);
	  }
  }
}