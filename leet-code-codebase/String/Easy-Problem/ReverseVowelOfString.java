import java.util.Scanner;

public class ReverseVowelOfString {

    // Method to reverse only vowels in a string
    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {

            // Check if left character is vowel
            if (isVowel(arr[i])) {

                // Check if right character is vowel
                if (isVowel(arr[j])) {
                    // Swap vowels
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return String.valueOf(arr);
    }

    // Helper method to check vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		// Take input 
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call reverse vowels method
        String result = reverseVowels(input);

         // output
        System.out.println("String after reversing vowels: " + result);
    }
}
