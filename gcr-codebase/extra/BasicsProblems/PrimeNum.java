import java.util.Scanner;
public class PrimeNum{
  // Check prime
  static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
	
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter num:");
	  int num = sc.nextInt();
	  
	  // print result
	  System.out.println("Is num prime? "+isPrime(num));
  }
}