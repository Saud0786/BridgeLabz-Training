import java.util.Scanner;

public class ElectionBoothManager {

    static int candidate1 = 0;
    static int candidate2 = 0;
    static int candidate3 = 0;

    // Method to check eligibility
    public static boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    // Method to record vote
    public static void recordVote(int vote) {
        if (vote == 1) {
            candidate1++;
        } else if (vote == 2) {
            candidate2++;
        } else if (vote == 3) {
            candidate3++;
        } else {
            System.out.println("Invalid vote!");
        }
    }

    // Method to display final result
    public static void displayResult() {
        System.out.println("\nElection Result\n");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);
    }

    public static void main(String[] args) {
		// Scanner object
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter age (or -1 to exit): ");
            int age = sc.nextInt();

            // exit condition
            if (age == -1) {
                break;
            }

            if (isEligible(age)) {
                System.out.print("Vote (1, 2, or 3): ");
                int vote = sc.nextInt();
                recordVote(vote);
            } else {
                System.out.println("Not eligible to vote");
            }
        }

        displayResult();
    }
}
