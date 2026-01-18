package com.linecomparison;
import java.util.*;

public class LineComparisonApp {

    // compares two line lengths
    public static void compareLines(Line l1, Line l2) {
        double len1 = l1.getLength();
        double len2 = l2.getLength();

        if (len1 == len2) {
            System.out.println("Result: Both lines are equal in length");
        } else if (len1 > len2) {
            System.out.println("Result: First line is longer");
        } else {
            System.out.println("Result: Second line is longer");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Line[]> comparisons = new ArrayList<>();

        System.out.print("Enter number of line comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nComparison " + i);

            System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Line line1 = new Line(x1, y1, x2, y2);

            System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
            double a1 = sc.nextDouble();
            double b1 = sc.nextDouble();
            double a2 = sc.nextDouble();
            double b2 = sc.nextDouble();
            Line line2 = new Line(a1, b1, a2, b2);

            comparisons.add(new Line[]{line1, line2});
        }

        System.out.println("\nComparison Results:");
        for (Line[] pair : comparisons) {
            compareLines(pair[0], pair[1]);
        }

        sc.close();
    }
}
