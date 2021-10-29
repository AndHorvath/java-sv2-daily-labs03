package day02;

import java.util.Scanner;

public class MathematicsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mathematics mathematics = new Mathematics();
        int integer;
        boolean isPrime;

        System.out.println("Please, enter a number!");
        integer = scanner.nextInt();

        isPrime = mathematics.isPrime(integer);

        System.out.println("The number you have given is" + (!isPrime ? " not" : "") + " a prime.");
    }
}