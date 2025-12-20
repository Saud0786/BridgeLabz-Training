import java.util.Scanner;
public class LargestSmallest{
  public static int smallestNum(int number1, int number2, int number3){
        int smallest = 0;
		if(number1<number2 && number1<number3){
		   smallest = number1;
		}else if(number2<number1 && number2<number3){
		   smallest = number2;
		}else{
		   smallest =  number3;
		}
		return smallest;
  }
  public static int largestNum(int number1, int number2, int number3){
        int largest = 0;
		if(number1>number2 && number1>number3){
		   largest = number1;
		}else if(number2>number1 && number2>number3){
		   largest = number2;
		}else{
		   largest =  number3;
		}
		return largest;
  }
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for numbers
      System.out.println("Enter number1:");
	  int number1 = sc.nextInt();
	  System.out.println("Enter number2:");
	  int number2 = sc.nextInt();
	  System.out.println("Enter number3:");
	  int number3 = sc.nextInt();
	  
	  // print largest and smallest number
	  System.out.println("largest: "+ largestNum(number1,number2,number3));
	  System.out.println("smallest: "+ smallestNum(number1,number2,number3));
  }
}