import java.util.Scanner;

public class IsomorphicString {

    // Method to check if two strings are isomorphic 
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // Arrays to store last seen positions of characters
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // If previous positions do not match, mapping is invalid
            if (mapS[sChar] != mapT[tChar]) {
                return false;
            }

            // Store current position + 1
            mapS[sChar] = i + 1;
            mapT[tChar] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input 
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        // Call isomorphic check method
        boolean result = isIsomorphic(s, t);

        // Output 
        System.out.println("Are Isomorphic? " + result);
    }
}
