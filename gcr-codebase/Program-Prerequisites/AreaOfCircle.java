import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        // Area calculation
        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);
    }
}
