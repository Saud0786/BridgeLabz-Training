package com.ambulanceroute;
import java.util.*;

public class AmbulanceRouteMain {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();
        Scanner sc = new Scanner(System.in);

        // Initial circular hospital units
        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        int choice;
        do {
            System.out.println("\n------ AMBULANCE ROUTE SYSTEM ------");
            System.out.println("1. Display Hospital Route");
            System.out.println("2. Find Available Unit");
            System.out.println("3. Remove Unit (Maintenance)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    route.displayRoute();
                    break;
                case 2:
                    route.findAvailableUnit();
                    break;
                case 3:
                    System.out.print("Enter unit name to remove: ");
                    String name = sc.nextLine();
                    route.removeUnit(name);
                    break;
                case 0:
                    System.out.println("System Closed.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
