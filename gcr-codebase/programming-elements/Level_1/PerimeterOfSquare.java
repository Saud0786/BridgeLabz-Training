import java.util.Scanner;
public class PerimeterOfSquare {

    public static void main(String[] args) {
        
       double side;

      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);
 
      // taking input height
      System.out.println("Enter side: ");
      side = sc.nextDouble();

      // printing  Perimeter of Square
      System.out.println("The length of the side is "+ side + " whose perimeter is "+ side*side*side*side);
    }
}