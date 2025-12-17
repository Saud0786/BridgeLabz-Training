import java.util.Scanner;

public class DistanceConversion {
   public static void main(String args[]) {

      // Creating variable to store distance in feet
      double distanceInFeet;

      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

      // Taking distance input from user (in feet)
      System.out.println("Enter distance in feet: ");
      distanceInFeet = sc.nextDouble();

      // Convert feet to yards
      double distanceInYards = distanceInFeet / 3;

      // Convert yards to miles
      double distanceInMiles = distanceInYards / 1760;

      // Display the result
      System.out.println("Your Height in feet is "+ distanceInFeet +" while in Yards is " + distanceInYards + " and Miles is "+ distanceInMiles);
     
   }
}
