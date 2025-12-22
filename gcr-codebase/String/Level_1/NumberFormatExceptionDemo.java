import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled successfully.");
        } 
    }

    public static void main(String[] args) {
        // Create a string object
        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a value: ");
        String text = sc.next();

        // Calling method to generate exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException().");
        }

        // Calling method to handle exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);
    }
}
