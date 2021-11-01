package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private final List<Integer> bodyHeights;

    public Students() { bodyHeights = new ArrayList<>(); }

    public List<Integer> getBodyHeights() { return bodyHeights; }

    public void addHeight(int height) {
        bodyHeights.add(height);
    }

    public boolean isHeightsIncreasing() {
        boolean isIncreasing = true;

        for (int i = 1; i < bodyHeights.size(); i++) {
            isIncreasing &= bodyHeights.get(i - 1) <= bodyHeights.get(i);
        }
        return isIncreasing;
    }
}