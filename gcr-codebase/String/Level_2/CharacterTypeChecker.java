import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to check character type
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to analyze string and return 2D array
    public static String[][] analyzeString(String text) {

        int count = 0;

        // Count characters
        for (int i = 0; ; i++) {
            try {
                text.charAt(i);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        String[][] result = new String[count][2];

        // Store in 2D array
        for (int i = 0; i < count; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {

        System.out.println("Character\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = analyzeString(input);
        displayTable(result);
    }
}
