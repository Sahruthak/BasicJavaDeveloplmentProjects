import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int minRange = 1; // Minimum number in the range
        int maxRange = 100; // Maximum number in the range
        int maxAttempts = 10; // Maximum number of attempts allowed

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (between " + minRange + " and " + maxRange + "): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasWon = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Number is Higher!");
            } else {
                System.out.println("Number is Lower!");
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
        } else {
            System.out.println("Game over! You have exceeded the maximum number of attempts.");
            System.out.println("The number was: " + randomNumber);
        }

        scanner.close();
    }
}
