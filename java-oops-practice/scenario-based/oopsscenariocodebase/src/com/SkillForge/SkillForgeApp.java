package com.SkillForge;
import java.util.Scanner;
import java.util.ArrayList;

public class SkillForgeApp {

      public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      ArrayList<Course> courses = new ArrayList<>();

      while (true) {

            System.out.println("\n------ SKILLFORGE MENU -------");
            System.out.println("1. Instructor");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            // INSTRUCTOR 
            case 1:

                  System.out.print("Enter Instructor Name: ");
                  String instName = sc.nextLine();

                  System.out.print("Enter Instructor Email: ");
                  String instEmail = sc.nextLine();

                  Instructor inst = new Instructor(instName, instEmail);

                  char more;

                  do {

                        System.out.print("Enter Course Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Course Level (Beginner/Advanced): ");
                        String level = sc.nextLine();

                        System.out.print("Enter number of modules: ");
                        int n = sc.nextInt();
                        sc.nextLine();

                        String[] modules = new String[n];

                        for (int i = 0; i < n; i++) {
                              System.out.print("Enter module " + (i + 1) + ": ");
                              modules[i] = sc.nextLine();
                        }

                        Course course = new Course(title, inst, level, modules);
                        courses.add(course);
                        inst.uploadCourse(course);

                        System.out.print("Add another course? (y/n): ");
                        more = sc.next().charAt(0);
                        sc.nextLine();

                  } while (more == 'y' || more == 'Y');

                  break;

            // Student
            case 2:

                  if (courses.isEmpty()) {
                        System.out.println("No courses available!");
                        break;
                  }

                  System.out.print("Enter Student Name: ");
                  String sName = sc.nextLine();

                  System.out.print("Enter Student Email: ");
                  String sEmail = sc.nextLine();

                  System.out.println("Available Courses:");

                  for (int i = 0; i < courses.size(); i++) {
                        System.out.println((i + 1) + ". " + courses.get(i).getTitle());
                  }

                  System.out.print("Select course number: ");
                  int c = sc.nextInt() - 1;
                  sc.nextLine();

                  Course selectedCourse = courses.get(c);
                  Student student = new Student(sName, sEmail, selectedCourse);

                  for (int i = 0; i < selectedCourse.getTotalModules(); i++) {
                        System.out.print("Complete module " + (i + 1) + "? (yes/no): ");
                        String ans = sc.nextLine();
                        if (ans.equalsIgnoreCase("yes")) {
                              student.completeModule();
                        }
                  }

                  System.out.println("Progress: " + student.getProgress() + "%");
                  student.generateCertificate();

                  System.out.print("Give course rating (1-5): ");
                  int stars = sc.nextInt();
                  sc.nextLine();

                  selectedCourse.addReview(stars);
                  System.out.println("Current Course Rating: " + selectedCourse.getRating());

                  break;

            // Exit
            case 3:

                  System.out.println("Thank you for using SkillForge!");
                  sc.close();
                  return;

            default:
                  System.out.println("Invalid choice!");
            }
      }
      }
}
