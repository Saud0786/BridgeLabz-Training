import java.util.Scanner;

public class LeapYearCheck {
    // Method for check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
	    // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap year check valid only for year >= 1582");
        } else if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
