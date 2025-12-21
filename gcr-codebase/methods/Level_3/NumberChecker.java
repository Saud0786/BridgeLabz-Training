import java.util.Scanner;

public class NumberChecker {
    // Method to find count of digits
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

    // Method to store digits in an array
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

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Take a number form user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        // Duck Number check
        System.out.println("\nDuck Number: " + isDuckNumber(digits));

        // Armstrong Number check
        System.out.println("Armstrong Number: " +
                isArmstrongNumber(number, digits));

        // Largest & Second Largest
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second Largest digit: " + largest[1]);

        // Smallest & Second Smallest
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second Smallest digit: " + smallest[1]);
    }
}
