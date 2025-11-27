import java.util.ArrayList;

public class Student extends Person {

    ArrayList<Book> Borrowedbooks;

    public  void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Borrowed Books: ");
        for (Book book : Borrowedbooks) {
            book.displayInfo();
            System.out.println("-----");
        }
    }
    public Student(String name, String email) {
        super(name, email);
        Borrowedbooks = new ArrayList<Book>();
    }
}
