import java.util.Scanner;

public class FactorsOperations {

    // Method to find factors of a number
    public static int[] findFactors(int num) {

        int count = 0;

        // count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create array of required size
        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        // Create object of Scanner 
        Scanner sc = new Scanner(System.in);
		
        // Take a number form user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Find factors
        int[] factors = findFactors(num);

        // Display factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        // Perform operations and print result
        System.out.println("\nGreatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

    }
}
