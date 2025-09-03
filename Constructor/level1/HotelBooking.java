package Constructor.level1;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = (guestName != null) ? guestName : "Unknown";
        this.roomType = (roomType != null) ? roomType : "Standard";
        this.nights = (nights > 0) ? nights : 1;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayDetails();

        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("\nParameterized Booking:");
        booking2.displayDetails();

        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nCopy Booking:");
        booking3.displayDetails();
    }
}
