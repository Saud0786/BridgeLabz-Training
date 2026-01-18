import java.util.Scanner;

public class StringToIntegerApp {

    public static int myAtoi(String s) {
        int i = 0;
        int flag = 1;
        long digit = 0;

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            flag = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Convert digits
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            digit = (digit * 10) + (s.charAt(i) - '0');
            i++;

            if (digit * flag > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (digit * flag < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (digit * flag);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int result = myAtoi(input);
        System.out.println("Converted integer: " + result);

        sc.close();
    }
}
