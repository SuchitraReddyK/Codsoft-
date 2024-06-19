import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int generatedNumber = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I have generated a number between 1 and 100. Can you guess it?");
            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    hasGuessedCorrectly = true;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The correct number was " + generatedNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
