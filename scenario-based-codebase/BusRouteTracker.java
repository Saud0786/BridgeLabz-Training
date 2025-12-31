import java.util.Scanner;
public class BusRouteTracker{

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalDistance = 0.0;
        int stopNumber = 1;

        System.out.print("Enter distance between each bus stop (in km): ");
        double distancePerStop = sc.nextDouble();

        System.out.print("Is the passenger on the bus? (yes/no): ");
        String choice = sc.next();

        // While loop runs until passenger gets off
        while (choice.equalsIgnoreCase("yes")) {

            totalDistance += distancePerStop;

            System.out.println("Stop " + stopNumber + " reached.");
            System.out.println("Total distance covered: " + totalDistance + " km");

            stopNumber++;

            System.out.print("Does the passenger want to get off at this stop? (yes/no): ");
            String exitChoice = sc.next();

            if (exitChoice.equalsIgnoreCase("yes")) {
                break;
            }

            System.out.print("Continue to next stop? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("\nPassenger got off the bus.");
        System.out.println("Final distance travelled: " + totalDistance + " km");
    }
}

