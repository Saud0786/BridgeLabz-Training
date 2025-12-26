import java.util.Scanner;

public class CoffeePrice {

    // User Choise and return price
    public static int choiceCoffee(String s) {
        switch (s.toLowerCase()) {
            case "cold coffee": return 200;
            case "hot coffee": return 300;
            case "cappuccino": return 400;
            case "espresso": return 250;
            case "latte": return 350;
            case "mocha": return 380;
            case "americano": return 280;
            case "black coffee": return 150;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Store price of coffee
        int arr[] = new int[20];
        int i = 0;

        // Take user input until exit
        while (true) {
            System.out.println("\n---- Coffee Menu ----");
            System.out.println("Coffee Type    Rupees");
            System.out.println("Cold Coffee  - 200");
            System.out.println("Hot Coffee   - 300");
            System.out.println("Cappuccino   - 400");
            System.out.println("Espresso     - 250");
            System.out.println("Latte        - 350");
            System.out.println("Mocha        - 380");
            System.out.println("Americano    - 280");
            System.out.println("Black Coffee - 150");
            System.out.println("---------------------");

            System.out.print("Enter coffee type (or exit): ");
            String s = sc.nextLine();

            if (s.equalsIgnoreCase("exit")){
               break;
            } 

            int price = choiceCoffee(s);
            if (price == 0) {
                System.out.println("Invalid coffee type.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            arr[i++] = price * qty;
        }

        // Total coffee price
        double total = 0;
        for (int j = 0; j < i; j++){
           total += arr[j];
        }

        // GST calculation
        double gst = total * 0.05;

        System.out.println("\n--------- BILL SUMMARY ---------");
        System.out.printf("Total Orders          : %d%n", i);
        System.out.printf("Total Coffee Price    : %.2f%n", total);
        System.out.printf("GST (5%%)              : %.2f%n", gst);
        System.out.printf("Total Price with GST  : %.2f%n", total + gst);
    }
}
