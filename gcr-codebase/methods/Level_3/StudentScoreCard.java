import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random PCM scores 2-digit
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; 
            scores[i][1] = (int) (Math.random() * 90) + 10; 
            scores[i][2] = (int) (Math.random() * 90) + 10; 
        }

        return scores;
    }

    // Method to calculate total, average & percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to display scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {

        System.out.println("\nSTUDENT SCORECARD");
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf(
                "%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                (i + 1),
                scores[i][0],
                scores[i][1],
                scores[i][2],
                results[i][0],
                results[i][1],
                results[i][2]
            );
        }

    }
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);

        displayScoreCard(pcmScores, results);

        sc.close();
    }
}
