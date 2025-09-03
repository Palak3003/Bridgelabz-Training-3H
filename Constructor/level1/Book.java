package Constructor.level1;
public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Details using default constructor:");
        book1.displayDetails();

        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        System.out.println("\nDetails using parameterized constructor:");
        book2.displayDetails();
    }
}
