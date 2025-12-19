import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;

        // Store digits (already reversed)
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        // Print reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
