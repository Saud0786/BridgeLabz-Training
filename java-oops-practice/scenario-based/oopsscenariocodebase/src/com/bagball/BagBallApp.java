package com.bagball;
import java.util.*;

public class BagBallApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Bag> bags = new HashMap<>();

        System.out.print("Enter number of bags: ");
        int bagCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < bagCount; i++) {
            System.out.print("Bag ID: ");
            String id = sc.nextLine();

            System.out.print("Bag Color: ");
            String color = sc.nextLine();

            System.out.print("Bag Capacity: ");
            int capacity = sc.nextInt();
            sc.nextLine();

            bags.put(id, new Bag(id, color, capacity));
        }

        boolean running = true;
        while (running) {
            System.out.println("\n1.Add Ball 2.Remove Ball 3.Show Balls 4.Show Bags 5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.nextLine();
                    Bag bag = bags.get(bagId);

                    if (bag == null) {
                        System.out.println("Bag not found");
                        break;
                    }

                    System.out.print("Ball ID: ");
                    String ballId = sc.nextLine();
                    System.out.print("Ball Color: ");
                    String ballColor = sc.nextLine();
                    System.out.print("Ball Size (small/medium/large): ");
                    String size = sc.nextLine();

                    if (!bag.addBall(new Ball(ballId, ballColor, size))) {
                        System.out.println("Bag is full");
                    }
                    break;

                case 2:
                    System.out.print("Enter Bag ID: ");
                    bagId = sc.nextLine();
                    bag = bags.get(bagId);

                    if (bag == null) {
                        System.out.println("Bag not found");
                        break;
                    }

                    System.out.print("Enter Ball ID to remove: ");
                    String removeId = sc.nextLine();
                    bag.removeBall(removeId);
                    break;

                case 3:
                    System.out.print("Enter Bag ID: ");
                    bagId = sc.nextLine();
                    bag = bags.get(bagId);

                    if (bag != null) {
                        bag.displayBalls();
                    } else {
                        System.out.println("Bag not found");
                    }
                    break;

                case 4:
                    for (Bag b : bags.values()) {
                        System.out.println(b);
                    }
                    break;

                case 5:
                	System.out.println("App closed....");
                    running = false;
                    break;
            }
        }
        sc.close();
    }
}
