import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticDemo {
    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Take date input in YYYY-MM-DD format
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        // Date arithmetic operations
        LocalDate resultDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("\nOriginal Date : " + date);
        System.out.println("Final Date    : " + resultDate);
    }
}
