import java.util.Scanner;

public class WordLength2DArray {

    // Method for calculate length
    public static int getStringLength(String s){
    int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
           
        }
        return count;
   }

    // Method to split text into words without using split()
   public static String[] splitIntoWords(String text) {

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

    // Method to create 2D array of word and length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = getStringLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static void main(String[] args) {
		// Create object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display result
        System.out.println("\nWord\t\tLength");

        for (int i = 0; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(wordLengthArray[i][0] + "\t\t" + length);
        }
    }
}
