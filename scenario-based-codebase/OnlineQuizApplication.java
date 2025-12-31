import java.util.*;

public class OnlineQuizApplication{
  
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 
	 // Questions
        String[] questions = {
            "1. Which keyword is used to inherit a class in Java?",
            "2. Which method is the entry point of Java program?",
            "3. Which data type is used to store decimal values?",
            "4. Which concept allows multiple forms in Java?",
            "5. Which operator is used to compare values?"
        };

        // Options
        String[][] options = {
            {"a) this", "b) super", "c) extends", "d) implements"},
            {"a) start()", "b) main()", "c) run()", "d) init()"},
            {"a) int", "b) float", "c) char", "d) boolean"},
            {"a) Inheritance", "b) Encapsulation", "c) Polymorphism", "d) Abstraction"},
            {"a) =", "b) !=", "c) ==", "d) >"}
        };

        // Correct answers
        char[] answers = {'c', 'b', 'b', 'c', 'c'};

        int score = 0;

        // Quiz Loop
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            // Answer checking using switch
            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } else {
                        System.out.println("Wrong Answer!");
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        // Final Score
        System.out.println("\n-------------------------");
        System.out.println("Quiz Completed");
        System.out.println("Your Score: " + score + " / " + questions.length);
        System.out.println("-------------------------");  
  }
}
