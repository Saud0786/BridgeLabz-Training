import java.util.Scanner;

public class LowercaseConversion {

    // Method to convert string to lowercase using charAt() and ASCII 
    public static String convertToLowercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
				// Convert to lowercase
                ch = (char) (ch + 32); 
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
        // Create object of Scanner 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        // User-defined lowercase conversion
        String userLower = convertToLowercase(text);

        // Built-in lowercase conversion
        String builtInLower = text.toLowerCase();

        // Compare both results
        boolean isSame = compareStrings(userLower, builtInLower);

        System.out.println("\nLowercase using user-defined method: " + userLower);
        System.out.println("Lowercase using built-in method: " + builtInLower);
        System.out.println("Are both strings equal? " + isSame);
    }
}
