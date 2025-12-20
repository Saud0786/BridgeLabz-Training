import java.util.Scanner;

public class FriendsComparison {

    // Method to find youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find tallest friend
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Friends names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        // Finding youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println("\nYoungest friend is: " + friends[youngestIndex]);
        System.out.println("Tallest friend is: " + friends[tallestIndex]);

    }
}
