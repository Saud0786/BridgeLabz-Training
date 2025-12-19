import java.util.Scanner;
public class MultiplicationTable{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input Number
      System.out.println("Enter a Number:");
	  int number = sc.nextInt();
	  
	  int multiplication[] = new int[10];
	  int index=0;
	  
	  // generate multiplication
	  for(int i=1;i<=10;i++){
	     multiplication[index++] = number*i;
	  }
	  
	  // print multiplication
	  System.out.println("Multiplication Table:");
	  for(int i=0;i<multiplication.length;i++){
	     System.out.println(number + " * " + (i+1) +" = "+ multiplication[i]);
	  }
  }
}