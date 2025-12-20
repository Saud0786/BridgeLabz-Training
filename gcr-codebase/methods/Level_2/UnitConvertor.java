import java.util.Scanner;
public class UnitConvertor {
    
	// Km to Miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    // Miles to Km 
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
    // Meters to Feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    // Feet to Meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
	
	public static void main(String args[]){
		// Create object of Scanner
		Scanner sc = new Scanner(System.in);
		
		// Take input KM , Miles, Feet and Meters
		System.out.print("Enter distance in Kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Km to Miles = " + convertKmToMiles(km));

        System.out.println("Enter distance in Miles: ");
        double miles = sc.nextDouble();
        System.out.println("Miles to Km = " + convertMilesToKm(miles));

        System.out.println("Enter distance in Meters: ");
        double meters = sc.nextDouble();
        System.out.println("Meters to Feet = " + convertMetersToFeet(meters));

        System.out.println("Enter distance in Feet: ");
        double feet = sc.nextDouble();
		System.out.println("Feet to Meters = " + convertFeetToMeters(feet));
	}
}
