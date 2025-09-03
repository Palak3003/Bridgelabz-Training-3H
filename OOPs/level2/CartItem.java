package OOPs.level2;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class CartItem {
    private Map<String, Double> items; 
    private Map<String, Integer> quantities; 

    public CartItem() {
        items = new HashMap<>();
        quantities = new HashMap<>();
    }

    public boolean addItem(String itemName, double price, int quantity) {
        if (itemName != null && !itemName.isEmpty() && price > 0 && quantity > 0) {
            items.put(itemName, price);
            quantities.put(itemName, quantities.getOrDefault(itemName, 0) + quantity);
            return true;
        }
        return false;
    }

    public boolean removeItem(String itemName) {
        if (items.containsKey(itemName)) {
            items.remove(itemName);
            quantities.remove(itemName);
            return true;
        }
        return false;
    }

    public void displayTotalCost() {
        double total = 0.0;
        DecimalFormat df = new DecimalFormat("#.##");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            String itemName = entry.getKey();
            double price = entry.getValue();
            int quantity = quantities.get(itemName);
            double itemTotal = price * quantity;
            total += itemTotal;
            System.out.println(itemName + " - Quantity: " + quantity + ", Price per unit: $" + df.format(price) + ", Subtotal: $" + df.format(itemTotal));
        }
        System.out.println("Total Cost: $" + df.format(total));
        if (total == 0) {
            System.out.println("Cart is empty.");
        }
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();

        cart.addItem("Laptop", 999.99, 1);
        cart.addItem("Mouse", 29.99, 2);
        System.out.println("Cart after adding items:");
        cart.displayTotalCost();

        cart.removeItem("Mouse");
        System.out.println("\nCart after removing Mouse:");
        cart.displayTotalCost();

        cart.removeItem("Laptop");
        System.out.println("\nCart after removing all items:");
        cart.displayTotalCost();
    }
}
