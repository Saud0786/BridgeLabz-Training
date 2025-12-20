
import java.util.*;
public class TrigonometricCalculator {
    // Create method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
	    // create object of scanner
	    Scanner sc = new Scanner(System.in);
		
		// take input angle
		System.out.println("Enter angle: ");
        double angle = sc.nextInt();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
