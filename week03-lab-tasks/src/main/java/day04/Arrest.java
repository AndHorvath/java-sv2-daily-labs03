package day04;

public class Arrest {

    private  boolean[] cellsAndAcquittals = new boolean[100];

    public boolean[] getCellsAndAcquittals() { return cellsAndAcquittals; }

    public void openFreeCells(boolean[] cellsAndAcquittals) {
        for (int i = 1; i <= cellsAndAcquittals.length; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cellsAndAcquittals[i - 1] = !cellsAndAcquittals[i - 1];
                }
            }
        }
    }
}