import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static void findMostFrequentChar(String str) {

        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = freq[mostFrequent];

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static void main(String[] args) {
        // Create object of Scanner 
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Display result
        findMostFrequentChar(input);
    }
}
