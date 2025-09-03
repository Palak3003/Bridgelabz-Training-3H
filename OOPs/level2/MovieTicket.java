package OOPs.level2;
import java.text.DecimalFormat;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
    }

    public boolean bookTicket(String seatNumber, double price) {
        if (seatNumber != null && !seatNumber.isEmpty() && this.seatNumber == null && price > 0) {
            this.seatNumber = seatNumber;
            this.price = price;
            return true;
        }
        return false;
    }

    public void displayDetails() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Movie Name: " + movieName);
        if (seatNumber != null) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + df.format(price));
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception");
        MovieTicket ticket2 = new MovieTicket("The Dark Knight");

        System.out.println("Initial Details for Ticket 1:");
        ticket1.displayDetails();

        ticket1.bookTicket("A12", 15.50);
        System.out.println("\nAfter Booking Ticket 1:");
        ticket1.displayDetails();

        ticket2.bookTicket("B5", 12.75);
        System.out.println("\nTicket 2 Details:");
        ticket2.displayDetails();
    }
}