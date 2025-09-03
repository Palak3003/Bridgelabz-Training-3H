package Constructor.level1;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = (customerName != null) ? customerName : "Unknown";
        this.carModel = (carModel != null) ? carModel : "Standard";
        this.rentalDays = (rentalDays > 0) ? rentalDays : 1;
    }

    public double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Total Cost: $%.2f%n", calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental:");
        rental1.displayDetails();

        CarRental rental2 = new CarRental("Alice Smith", "SUV", 3);
        System.out.println("\nParameterized Rental:");
        rental2.displayDetails();
    }
}
