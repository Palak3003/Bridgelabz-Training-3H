package Constructor.level1;
public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            return true;
        }
        return false;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Book2 book1 = new Book2("1984", "George Orwell", 12.99);
        System.out.println("Initial Book Details:");
        book1.displayDetails();

        if (book1.borrowBook()) {
            System.out.println("\nBook borrowed successfully.");
        } else {
            System.out.println("\nBook is not available for borrowing.");
        }
        System.out.println("Updated Book Details:");
        book1.displayDetails();
    }
}