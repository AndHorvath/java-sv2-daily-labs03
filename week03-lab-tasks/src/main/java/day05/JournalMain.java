package day05;

public class JournalMain {

    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println("Successful added: " + journal.addStudent("Kiss Ibolya"));
        System.out.println("Successful added: " + journal.addStudent("Kovács Béla"));
        System.out.println("Successful added: " + journal.addStudent("Tomi"));

        System.out.println("Student list: " + journal.getNameList());
    }
}
