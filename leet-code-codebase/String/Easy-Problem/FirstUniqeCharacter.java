import java.util.Scanner;

public class FirstUniqeCharacter {

    // Method to find index of first non-repeating character
    public static int firstUniqChar(String s) {

         // Frequency array for all ASCII characters
        int[] freq = new int[256];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input  
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method
        int result = firstUniqChar(input);

        // Output
        System.out.println("Index of first unique character: " + result);
    }
}
