import java.util.Scanner;

public class RajResultGenerator {

    // Method to calculate average
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / 5.0;
    }

    // Method to assign grade using switch
    public static void assignGrade(double average) {
        int gradeKey = (int) average / 10;

        switch (gradeKey) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        double average = calculateAverage(marks);

        System.out.println("\nAverage Marks: " + average);
        assignGrade(average);
    }
}
