package Constructor.thisAndFinal;
public class Product {
    private static double discount;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            double discountedPrice = price * (1 - discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price after " + discount + "% discount: " + discountedPrice);
            System.out.println("Quantity: " + quantity);
        } else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }
}

