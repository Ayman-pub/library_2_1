import java.util.Scanner;
public class Library {
    static int pchoice=1;
    static int issuedBooks = 0;
    public static void main(String[] args) {
        Person person = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("---Library Management System---\n You are a: \n1. Student \n2. Faculty");
        do{
        pchoice = sc.nextInt();
        } while(pchoice!=1 && pchoice!=2);
        sc.nextLine();

        String name, email;
        if(pchoice==1){
            name=sc.nextLine();
            email=sc.nextLine();
            person = new Student(name, email);
        }
        else if(pchoice==2){
            name=sc.nextLine();
            email=sc.nextLine();
             person = new Faculty(name, email);
        }
        System.out.println("Borrow Books or enter 0 to exit system: ");
        Book book= new Book(null, null, null, 0);
        book.title=sc.nextLine();
        if ("0".equals(book.title.trim())) {
            System.out.println("Exiting system. Goodbye!");
            return;
        }
        else{
            book.author=sc.nextLine();
            book.isbn=sc.nextLine();
            book.price=sc.nextDouble();
            sc.nextLine();
            if(pchoice==1){
                ((Student) person).Borrowedbooks.add(book) ;
            }
            else if(pchoice==2){
                ((Faculty) person).BorrowedBooks.add(book);
            }
            issuedBooks++;
        }
        printPersonDetails(person);


        //scanner for user input
        //instantiate objects with samples and test functionality here
        //choose s/f
        //inputs

        //operations-add books then show details of person

    }
    static void printPersonDetails(Person p) {
        p.displayDetails();
    }
}
