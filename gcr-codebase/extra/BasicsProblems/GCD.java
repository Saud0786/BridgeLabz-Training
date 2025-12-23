import java.util.Scanner;
public class GCD{
    // GCD and LCM
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value
      System.out.println("Enter first number:");
	  int first = sc.nextInt();
	  System.out.println("Enter second number:");
	  int second = sc.nextInt();
	  
	  // Display result
	  System.out.println("GCD of two number: "+gcd(first,second));
	  System.out.println("LCM of two number: "+lcm(first,second));
  }
}