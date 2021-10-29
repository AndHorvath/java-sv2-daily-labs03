package day02;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mayBePrime = true;
        int integer;

        System.out.println("Please, enter a number!");
        integer = scanner.nextInt();

        for (int i = 2; i < integer && mayBePrime; i++) {
            mayBePrime = integer % i != 0;
        }
        System.out.println("The number you have given is" + (!mayBePrime || integer == 1 ? " not" : "") + " a prime.");
    }
}