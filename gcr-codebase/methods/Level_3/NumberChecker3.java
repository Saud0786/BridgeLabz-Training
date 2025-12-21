import java.util.Scanner;

public class NumberChecker3 {

    // Method to count digits
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] getDigitsArray(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    // Method to check Palindrome Number
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create object of Scanner 
        Scanner sc = new Scanner(System.in);
		
        // Take a number form user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        // Reverse digits
        int[] reversed = reverseArray(digits);
        System.out.print("\nReversed digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }

        // Compare arrays
        System.out.println("\nArrays are equal: " + compareArrays(digits, reversed));

        // Palindrome check
        System.out.println("Palindrome Number: " + isPalindrome(digits));

        // Duck number check
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
}
