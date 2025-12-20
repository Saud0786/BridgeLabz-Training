import java.util.Scanner;

public class UnitConvertorYardsToFeet {

    // Converts yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Converts feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Converts meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Converts inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Converts inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    
    public static void main(String[] args) {
        // Create object of Scanner  
        Scanner sc = new Scanner(System.in);

        // Perform all operation
        System.out.print("Enter value in Yards: ");
        double yards = sc.nextDouble();
        System.out.println("Yards to Feet = " + convertYardsToFeet(yards));

        System.out.print("\nEnter value in Feet: ");
        double feet = sc.nextDouble();
        System.out.println("Feet to Yards = " + convertFeetToYards(feet));

        System.out.print("\nEnter value in Meters: ");
        double meters = sc.nextDouble();
        System.out.println("Meters to Inches = " + convertMetersToInches(meters));

        System.out.print("\nEnter value in Inches: ");
        double inches = sc.nextDouble();
        System.out.println("Inches to Meters = " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters = " + convertInchesToCm(inches));
    }
}
