package day04;

public class Sultan {

    public static void main(String[] args) {
        Arrest arrest = new Arrest();
        boolean[] cellsAndAcquittals = arrest.getCellsAndAcquittals();
        String resultString = "";

        arrest.openFreeCells(cellsAndAcquittals);

        for (int i = 1; i <= cellsAndAcquittals.length; i++) {
            resultString += cellsAndAcquittals[i - 1] ? i + ", " : "";
        }
        if (!"".equals(resultString)){
            resultString = resultString.substring(0, resultString.length() - 2);
        }

        System.out.println(resultString);
    }
}