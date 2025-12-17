import java.util.Scanner;

public class TriangleArea {
   public static void main(String args[]) {

      // Creating variables to store base and height
      double base, height;

      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

      // Taking base and height from user in inches
      System.out.println("Enter base of the triangle: ");
      base = sc.nextDouble();
      System.out.println("Enter height of the triangle: ");
      height = sc.nextDouble();

      // Calculate area in square inches
      double areaInSqInches = 0.5 * base * height;

      // Conversion area in Cm
      double areaInSqCm = areaInSqInches * 6.4516;
    
      // Convert area into square feet
      double areaInSqFeet = areaInSqInches / 144;

      // Display the output
      System.out.println("Your Height in cm is "+ areaInSqCm  + " while in feet is "+ areaInSqFeet + " and inches is "+ areaInSqInches );
   }
}
