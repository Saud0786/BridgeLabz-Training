import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove a specific character
   public static String removeCharacter(String str, char ch) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Take user input 
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        // Display result
        String modified = removeCharacter(input, ch);
        System.out.println("Modified String: " + modified );
    }
}
