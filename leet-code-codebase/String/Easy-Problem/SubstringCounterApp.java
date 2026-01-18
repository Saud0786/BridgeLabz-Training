import java.util.Scanner;

public class SubstringCounterApp {

    public static int numOfStrings(String[] patterns, String word) {

        int c = 0;
        for (int i = 0; i < patterns.length; i++) {
            String w = patterns[i];
            if (word.indexOf(w) != -1) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input word
        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        // Input number of patterns
        System.out.print("Enter number of patterns: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] patterns = new String[n];

        // Input patterns
        for (int i = 0; i < n; i++) {
            System.out.print("Enter pattern " + (i + 1) + ": ");
            patterns[i] = sc.nextLine();
        }

        int result = numOfStrings(patterns, word);
        System.out.println("Number of matching patterns: " + result);

        sc.close();
    }
}
