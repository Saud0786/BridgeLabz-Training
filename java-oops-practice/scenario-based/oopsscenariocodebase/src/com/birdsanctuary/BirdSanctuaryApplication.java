package com.birdsanctuary;

import java.util.*;

public class BirdSanctuaryApplication {

    static ArrayList<Bird> birds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---------Welcome to EcoWing Bird Sanctuary-----------");

        int choice;
        do {
            System.out.println("\n1.Add Bird");
            System.out.println("2.Display All Birds");
            System.out.println("3.Display Flying Birds");
            System.out.println("4.Display Swimming Birds");
            System.out.println("5.Delete Bird by ID");
            System.out.println("6.Report");
            System.out.println("7.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addBird();
                case 2 -> displayAll();
                case 3 -> displayFlying();
                case 4 -> displaySwimming();
                case 5 -> deleteBird();
                case 6 -> report();
            }

        } while (choice != 7);
    }

    static void addBird() {

        System.out.println("1.Eagle 2.Duck 3.Penguin 4.Kiwi");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Species: ");
        String species = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine();

        Bird b = switch (type) {
            case 1 -> new Eagle(name, species, id);
            case 2 -> new Duck(name, species, id);
            case 3 -> new Penguin(name, species, id);
            default -> new Kiwi(name, species, id);
        };

        birds.add(b);
    }

    // display all
    static void displayAll() {
        for (Bird b : birds) {
            b.display();
        }
    }

    // flying
    static void displayFlying() {
        for (Bird b : birds) {
            if (b.canFly()) {
                b.fly();
            }
        }
    }

    // swimming
    static void displaySwimming() {
        for (Bird b : birds) {
            if (b.canSwim()) {
                b.swim();
            }
        }
    }

    // delete bird
    static void deleteBird() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        birds.removeIf(b -> b.getId().equals(id));
        System.out.println(id+ "bird deleted");
    }

    //Report
    static void report() {
        int fly = 0, swim = 0, both = 0, none = 0;

        for (Bird b : birds) {
            boolean f = b.canFly();
            boolean s = b.canSwim();

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else none++;
        }

        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + none);
    }
}
