abstract public class Person {
    String name;
    String email;

    abstract void displayDetails();

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
