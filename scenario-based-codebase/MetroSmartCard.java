import java.util.Scanner;

public class MetroSmartCard {

    static double balance = 1000.0; 

    // Method to calculate fare using ternary operator
    public static double calculateFare(double distance) {
        return (distance <= 5) ? 10 : 20;
    }

    // Method to deduct fare from balance
    public static void deductFare(double fare) {
        balance = balance - fare;
        System.out.println("Fare deducted: " + fare);
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (balance > 0) {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.print("Enter distance in km (or -1 to exit): ");
            double distance = sc.nextDouble();

            // exit condition
            if (distance == -1) {
                break;
            }

            double fare = calculateFare(distance);

            if (fare <= balance) {
                deductFare(fare);
            } else {
                System.out.println("Insufficient balance. Please recharge.");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro Smart Card.");
    }
}
