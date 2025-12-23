import java.util.Scanner;

public class AnagramCheck {

    // Method to check anagram
   public static boolean isAnagram(String s1, String s2) {

        // Remove spaces and convert to lowercase
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[256]; 

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
		// Display result
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

    }
}
