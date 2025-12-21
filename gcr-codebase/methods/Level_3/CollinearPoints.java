import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        // Avoid division by zero by using cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(int x1, int y1,int x2, int y2,int x3, int y3) {
      
            double area = 0.5 * ( x1 * (y2 - y3) +
                                  x2 * (y3 - y1) +
                                  x3 * (y1 - y2));

           return area == 0;
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check using slope method
        boolean slopeResult = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check using area method
        boolean areaResult = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("Using Slope Formula: " + (slopeResult ? "Collinear" : "Not Collinear"));

        System.out.println("Using Area Formula: " + (areaResult ? "Collinear" : "Not Collinear"));

    }
}
