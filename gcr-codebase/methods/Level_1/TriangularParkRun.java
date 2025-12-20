import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; 
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
		
		// create object of scanner
        Scanner sc = new Scanner(System.in);


        // take input of sides
        System.out.print("Enter side 1 : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 : ");
        double side3 = sc.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        
		// print output
        System.out.println("Number of rounds required to complete 5 km: " + rounds);
    }
}
