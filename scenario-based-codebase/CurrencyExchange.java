import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {
            // Input INR amount
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();
            double convertedValue = 0.0;

            // Currency options
            System.out.println("\nChoose currency to convert into:");
            System.out.println("1. US Dollar");
            System.out.println("2. Saudi Riyal");
            System.out.println("3. Euro");
            System.out.println("4. Canadian Dollar");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            // Switch case for conversion
        switch (choice) {
            case 1:
                    convertedValue = inr / 89.82;
                    System.out.println("Converted Amount (USD): " + convertedValue);
                    break;

             case 2:
                    convertedValue = inr / 23.95;
                    System.out.println("Converted Amount (Riyal): " + convertedValue);
                    break;

             case 3:
                    convertedValue = inr / 97.50;
                    System.out.println("Converted Amount (Euro): " + convertedValue);
                    break;

             case 4:
                    convertedValue = inr / 66.30;
                    System.out.println("Converted Amount (CAD): " + convertedValue);
                    break;

              default:
                    System.out.println("Invalid choice! Please select 1 to 4.");
            }

            // Ask user to continue
            System.out.print("\nDo you want to convert another amount? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("\nThank you for using Currency Exchange Kiosk");
    }
}
