package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberMain {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        GuessTheNumber guessTheNumber = new GuessTheNumber(random);
        int upperBoundOfAttempts = 6;
        boolean isGuessed = false;

        for (int i = 1; i <= upperBoundOfAttempts; i++) {
            if (guessTheNumber.askForGuess(scanner, i)) {
                isGuessed = true;
                break;
            }
        }
        if (!isGuessed) {
            System.out.println("The number to guess was " + guessTheNumber.getRandomNumber() + ".");
        }
    }
}