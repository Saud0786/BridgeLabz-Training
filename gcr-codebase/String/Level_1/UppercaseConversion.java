import java.util.Scanner;

public class UppercaseConversion {

    // Method to convert string to uppercase using charAt() and ASCII
    public static String convertToUppercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
				// covert to uppercase
                ch = (char) (ch - 32); 
            }
            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String userUpper = convertToUppercase(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean isSame = compareStrings(userUpper, builtInUpper);

        System.out.println("\nUppercase using user-defined method: " + userUpper);
        System.out.println("Uppercase using built-in method: " + builtInUpper);
        System.out.println("Are both strings equal? " + isSame);
    }
}
