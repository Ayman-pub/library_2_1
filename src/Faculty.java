import java.util.ArrayList;

public class Faculty extends Person {
    ArrayList<Book> BorrowedBooks;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Borrowed Books: ");
        for (Book book : BorrowedBooks) {
            book.displayInfo();
            System.out.println("-----");
        }
    }
    public Faculty(String name, String email) {
        super(name, email);
        BorrowedBooks = new ArrayList<Book>();
    }
}
