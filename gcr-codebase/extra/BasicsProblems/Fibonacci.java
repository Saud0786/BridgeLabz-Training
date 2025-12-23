import java.util.Scanner;
public class Fibonacci{
    //  Fibonacci Sequence
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter number for fibonacci series:");
	  int n = sc.nextInt();
	  
	  // print result
	  fibonacci(n);
  }
}