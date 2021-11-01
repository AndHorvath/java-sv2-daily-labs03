package day01;

import java.util.Random;

public class School {

    public static void main(String[] args) {
        Students students = new Students();
        Random random = new Random();
        int groupSize = 5 + random.nextInt(6);

        for (int i = 0; i < groupSize; i++) {
            students.addHeight(160 + random.nextInt(41));
        }
        System.out.println("The body heights are: " + students.getBodyHeights());
        System.out.println("Their order is" + (students.isHeightsIncreasing() ? "" : " not") + " increasing.");
    }
}
