import java.util.Scanner;
public class NaturalNumbersSum {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 0){
			 return 0;
		}  
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
		
		// Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Take input number 
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int recSum = recursiveSum(n);
        int formSum = formulaSum(n);

        // Print results 
        System.out.println("Recursive Sum : " + recSum);
        System.out.println("Formula Sum : " + formSum);

        if (recSum == formSum) {
            System.out.println("Both results are equal.");
        }
    }
}
