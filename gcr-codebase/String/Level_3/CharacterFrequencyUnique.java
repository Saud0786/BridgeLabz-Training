import java.util.Scanner;
public class CharacterFrequencyUnique {

    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = ch;
            }
        }

        // Create exact-size array for unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using ASCII and unique characters
    public static String[][] findFrequency(String text) {

        int[] freq = new int[256]; 

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create 2D array for result
        String[][] result = new String[uniqueChars.length][2];

        // Store unique characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create object of string
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}
