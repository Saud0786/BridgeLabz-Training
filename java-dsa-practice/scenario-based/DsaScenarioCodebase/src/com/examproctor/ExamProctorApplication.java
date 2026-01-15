package com.examproctor;
import java.util.Scanner;

public class ExamProctorApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();
        int choice;

        do {
            System.out.println("\n------- ONLINE EXAM MENU -------");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. View Last Visited Question");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter question ID: ");
                    int qId = scanner.nextInt();
                    exam.visitQuestion(qId);
                    break;

                case 2:
                    System.out.print("Enter question ID: ");
                    int answerQId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter your answer: ");
                    String answer = scanner.nextLine();
                    exam.submitAnswer(answerQId, answer);
                    break;

                case 3:
                    exam.viewLastVisitedQuestion();
                    break;

                case 4:
                    int score = exam.evaluateScore();
                    System.out.println("Exam submitted successfully.");
                    System.out.println("Final Score: " + score);
                    break;

                case 5:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
