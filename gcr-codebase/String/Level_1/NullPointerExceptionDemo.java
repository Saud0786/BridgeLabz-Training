public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;          
        System.out.println(text.length()); 
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;         

        try {
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
        }
    }

    public static void main(String[] args) {

        // Calling method to generate exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException().");
        }

        // Calling method to handle exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
