package com.browserbuddy;
import java.util.Scanner;

public class BrowserApp {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            BrowserBuddy browser = new BrowserBuddy();

            int choice;

            while (true) {

                  System.out.println("\n----- BROWSER BUDDY MENU -----");
                  System.out.println("1. Visit Page");
                  System.out.println("2. Back");
                  System.out.println("3. Forward");
                  System.out.println("4. Close Tab");
                  System.out.println("5. Reopen Last Closed Tab");
                  System.out.println("6. Show Current Page");
                  System.out.println("7. Exit");
                  System.out.print("Enter your choice: ");

                  choice = sc.nextInt();
                  sc.nextLine();

                  switch (choice) {

                  case 1:
                        System.out.print("Enter URL: ");
                        String url = sc.nextLine();
                        browser.getCurrentTab().visitPage(url);
                        break;

                  case 2:
                        browser.getCurrentTab().back();
                        break;

                  case 3:
                        browser.getCurrentTab().forward();
                        break;

                  case 4:
                        browser.closeTab();
                        break;

                  case 5:
                        browser.reopenTab();
                        break;

                  case 6:
                        System.out.println("Current Page: " +
                              browser.getCurrentTab().getCurrentPage());
                        break;

                  case 7:
                        System.out.println("Exiting BrowserBuddy...");
                        sc.close();
                        return;

                  default:
                        System.out.println("Invalid choice!");
                  }
            }
      }
}
