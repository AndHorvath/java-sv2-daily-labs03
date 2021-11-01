package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // --- attributes ---------------------------------------------------------

    private final int randomNumber;

    // --- constructors -------------------------------------------------------

    public GuessTheNumber(Random random) {
        randomNumber = 1 + random.nextInt(100);
    }

    // --- getters and setters ------------------------------------------------

    public int getRandomNumber() { return randomNumber; }

    // --- public methods -----------------------------------------------------

    public boolean askForGuess(Scanner scanner, int attemptNumber) {
        int guessedNumber;

        System.out.println("Your " + attemptNumber + ". guess?");
        guessedNumber = scanner.nextInt();

        if (randomNumber == guessedNumber) {
            System.out.println("You have guessed the number.");
            return true;
        } else if (randomNumber < guessedNumber) {
            System.out.println("The number to guess is less then your guess.");
        } else {
            System.out.println("The number to guess is greater then your guess.");
        }
        return false;
    }
}