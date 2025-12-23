import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    static Scanner sc = new Scanner(System.in);

    public static void numberGuessingGame() {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
        int userGuess;

        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess > numberToGuess) {
                System.out.println("Too HIGH! Try again.");
            } 
            else if (userGuess < numberToGuess) {
                System.out.println("Too LOW! Try again.");
            } 
            else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }
    }

    public static void main(String args[]) {
        numberGuessingGame();
    }
}
