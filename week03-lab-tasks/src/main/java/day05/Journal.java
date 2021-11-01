package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> nameList;

    public Journal() { nameList = new ArrayList<>(); }

    public List<String> getNameList() { return nameList; }

    public boolean addStudent(String studentName) {
        if (studentName.indexOf(" ") > 0 && studentName.indexOf(" ") != studentName.length() - 1) {
            return nameList.add(studentName);
        }
        return false;
    }
}