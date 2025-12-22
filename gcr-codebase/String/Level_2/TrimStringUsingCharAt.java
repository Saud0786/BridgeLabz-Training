import java.util.Scanner;

public class TrimStringUsingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;

        // Find length without using length()
        try {
            while (true) {
                text.charAt(end);
                end++;
            }
        } catch (IndexOutOfBoundsException e) {
            end = end - 1;
        }

        // Trim leading spaces
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) != ' ') {
                    start = i;
                    break;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        // Trim trailing spaces
        for (int i = end; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        int i = 0;

        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            try {
                s1.charAt(i);
                return false;
            } catch (IndexOutOfBoundsException ex) {
                try {
                    s2.charAt(i);
                    return false;
                } catch (IndexOutOfBoundsException ex2) {
                    return true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String customTrimmed = createSubstring(input, indexes[0], indexes[1]);

        String builtInTrimmed = input.trim();

        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("Trimmed String (charAt): " + customTrimmed);
        System.out.println("Trimmed String (trim): " + builtInTrimmed );
        System.out.println("Are both strings equal? " + isSame);
    }
}
