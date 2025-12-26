import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);
		
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Input from user
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        // Call anagram check method
        boolean result = isAnagram(s, t);
		
        // Result
        System.out.println("Are Anagrams? " + result);

    }
}
