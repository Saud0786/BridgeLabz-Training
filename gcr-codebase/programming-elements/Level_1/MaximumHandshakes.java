import java.util.Scanner;

public class MaximumHandshakes {
   public static void main(String args[]) {

      // Creating variable to store number of students
      int numberOfStudents;

      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

      // Taking number of students from user
      System.out.println("Enter number of students: ");
      numberOfStudents = sc.nextInt();

      // Calculate maximum number of handshakes
      int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

      // Display the result
      System.out.println("The maximum number of possible handshakes among " +
         numberOfStudents + " students is " + handshakes);
   }
}
