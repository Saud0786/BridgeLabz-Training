import java.util.Scanner;

public class NumberChecker5 {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int num) {

        if (num <= 1){
		return 0;
        }
		
        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int num) {
        return num > 0 && sumOfProperDivisors(num) == num;
    }

    // Method to check Abundant Number
    public static boolean isAbundant(int num) {
        return num > 0 && sumOfProperDivisors(num) > num;
    }

    // Method to check Deficient Number
    public static boolean isDeficient(int num) {
        return num > 0 && sumOfProperDivisors(num) < num;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrong(int num) {

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        // Create object of Scanner 
        Scanner sc = new Scanner(System.in);
		
        // Take a number form user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
		// Print all result
        System.out.println("Perfect Number   : " + isPerfect(num));
        System.out.println("Abundant Number  : " + isAbundant(num));
        System.out.println("Deficient Number : " + isDeficient(num));
        System.out.println("Strong Number    : " + isStrong(num));

    }
}
