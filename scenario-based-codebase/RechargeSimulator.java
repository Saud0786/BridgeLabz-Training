import java.util.*;

public class RechargeSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Each SIM Balance  		
        int airtelBalance = 0;
        int jioBalance = 0;
        int viBalance = 0;
        char choice;

        // Menu of SIM   
        do {
            System.out.println("---Phone Recharge Simulator---");
            System.out.println("Select Mobile Operator:");
            System.out.println("1. Airtel");
            System.out.println("2. Jio");
            System.out.println("3. VI");

            int operator = sc.nextInt();

            System.out.print("Enter Recharge Amount: ");
            int amount = sc.nextInt();

            // Choise which SIM to recharge
            switch (operator) {
                case 1:
                    airtelBalance += amount;
                    System.out.println("Airtel Offer: 2GB/day + Unlimited Calls");
                    System.out.println("Airtel Balance: " + airtelBalance);
                    break;
                case 2:
                    jioBalance += amount;
                    System.out.println("Jio Offer: 1.5GB/day + Free OTT Apps");
                    System.out.println("Jio Balance: " + jioBalance);
                    break;
                case 3:
                    viBalance += amount;
                    System.out.println("VI Offer: 3GB/day + Free OTT Apps + Unlimited Calls");
                    System.out.println("VI Balance: " + viBalance);
                    break;
                default:
                    System.out.println("Invalid Operator Selected");
            }

            // Ask Again for recharge
            System.out.println("\nDo you want to recharge again? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
		
        System.out.println("\nThank you for using Phone Recharge Simulator!");
    }
}
