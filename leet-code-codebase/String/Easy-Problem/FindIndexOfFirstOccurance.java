import java.util.Scanner;

public class FindIndexOfFirstOccurance {

    public static int strStr(String haystack, String needle) {

        int hayLength = haystack.length();
        int needleLength = needle.length();

        // If needle is longer than haystack, it cannot be found
        if (hayLength < needleLength) {
            return -1;
        }

        // Loop through haystack up to the point where needle can fit
        for (int i = 0; i <= hayLength - needleLength; i++) {

            int j = 0;

            // Compare characters of haystack and needle
            while (j < needleLength &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched, return starting index
            if (j == needleLength) {
                return i;
            }
        }

        return -1;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Take input from user
        System.out.print("Enter the haystack string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = sc.nextLine();
		
        int result = strStr(haystack, needle);

        // Display result
        System.out.println("Output index: " + result);

    }
}
