package com.callcenter;
import java.util.Scanner;

public class CallCenterMain {
    public static void main(String[] args) {

        CallCenterManager manager = new CallCenterManager();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of incoming calls: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("\nCall " + i);

            System.out.print("Enter Customer ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Is VIP customer? (true/false): ");
            boolean isVIP = sc.nextBoolean();
            sc.nextLine();

            manager.receiveCall(new Customer(id, name, isVIP));
        }

        System.out.println("\n--- Serving Calls ---");
        System.out.print("Enter number of calls to serve: ");
        int serveCount = sc.nextInt();

        for (int i = 0; i < serveCount; i++) {
            manager.serveNextCall();
        }

        System.out.print("\nEnter Customer ID to check call count: ");
        sc.nextLine(); 
        String searchId = sc.nextLine();

        System.out.println("Total calls this month: " +
                manager.getCallCount(searchId));

        sc.close();
    }
}
