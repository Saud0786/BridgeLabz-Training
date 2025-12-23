import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonDemo {

    public static void main(String[] args) {
        // Create object of Scanner 
        Scanner sc = new Scanner(System.in);

        // Input first date
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        // Input second date
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        System.out.println("\nComparison Result:");

        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        } 
        else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }
    }
}
