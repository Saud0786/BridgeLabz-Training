import java.util.Scanner;

public class ShortestLongestWord{

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to split sentence into words without using split()
   public static String[] splitWords(String text) {

    int length = getStringLength(text);
    int wordCount = 0;
    boolean inWord = false;

    // Count words using length
    for (int i = 0; i < length; i++) {
        char ch = text.charAt(i);

        if (ch != ' ' && !inWord) {
            wordCount++;
            inWord = true;
        } else if (ch == ' ') {
            inWord = false;
        }
    }

    String[] words = new String[wordCount];
    String temp = "";
    int index = 0;

    // Store words
    for (int i = 0; i < length; i++) {
        char ch = text.charAt(i);

        if (ch != ' ') {
            temp = temp + ch;
        } else if (!temp.equals("")) {
            words[index++] = temp;
            temp = "";
        }
    }

    // Store last word
      if (!temp.equals("")) {
        words[index] = temp;
       }

       return words;
    }
	
	
    // Method to create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] arr = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return arr;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestLongest(String[][] arr) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);

            if (len < Integer.parseInt(arr[shortest][1])) {
                shortest = i;
            }
            if (len > Integer.parseInt(arr[longest][1])) {
                longest = i;
            }
        }
        return new int[]{shortest, longest};
    }


    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLength = createWordLengthArray(words);
        int[] result = findShortestLongest(wordLength);

        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordLength.length; i++) {
            System.out.println(
                    wordLength[i][0] + "\t\t" +
                    Integer.parseInt(wordLength[i][1])
            );
        }

        System.out.println("\nShortest Word: " + wordLength[0][0]);

        System.out.println("Longest Word: " + wordLength[1][0]);
    }
}
