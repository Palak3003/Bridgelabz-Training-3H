package OOPs.level1;
import java.text.DecimalFormat;

public class Item {
    private String itemCode;
    private String itemName;
    private double price;
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void displayDetails() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: $" + df.format(price));
    }
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        Item item = new Item("I001", "Laptop", 999.99);

        System.out.println("Item Details:");
        item.displayDetails();
        int quantity = 2;
        double totalCost = item.calculateTotalCost(quantity);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("\nTotal Cost for " + quantity + " units: $" + df.format(totalCost));
    }
}
