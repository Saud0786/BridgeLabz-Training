import java.util.Scanner;
public class MaxNum{
    // Maximum of Three Numbers
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for three number
      System.out.println("Enter first num:");
	  int first = sc.nextInt();
	  System.out.println("Enter second num:");
	  int second = sc.nextInt();
	  System.out.println("Enter third num:");
	  int third = sc.nextInt();
	  
	  // Display result
	  System.out.println("Maximum between three number is "+maxOfThree(first,second,third));
  }
}