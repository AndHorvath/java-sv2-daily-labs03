package day02;

public class Mathematics {

    public boolean isPrime(int integer) {
        boolean mayBePrime = true;

        for (int i = 2; i < integer && mayBePrime; i++) {
            mayBePrime = integer % i != 0;
        }
        mayBePrime &= integer != 1;

        return mayBePrime;
    }
}