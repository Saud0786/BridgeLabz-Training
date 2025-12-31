import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {
        // Object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {
            System.out.print("Enter lucky draw number for Visitor " + i + ": ");

            // Check for invalid input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue; 
            }

            int number = sc.nextInt();

            // Lucky draw condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You win a gift.");
            } else {
                System.out.println("Better luck next time.");
            }
        }
    }
}
