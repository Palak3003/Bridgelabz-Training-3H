package OOPs.level1;
import java.text.DecimalFormat;

public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    public void displayDetails() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + df.format(price));
    }

    public static void main(String[] args) {
 
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 999.99);

      
        System.out.println("Mobile Phone 1 Details:");
        phone1.displayDetails();
        System.out.println("\nMobile Phone 2 Details:");
        phone2.displayDetails();
    }
}
