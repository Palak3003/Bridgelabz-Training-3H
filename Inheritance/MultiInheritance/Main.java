package Inheritance.MultiInheritance;
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Shipped (Tracking: " + trackingNumber + ")";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("ORD001", "2025-09-13");
        ShippedOrder o2 = new ShippedOrder("ORD002", "2025-09-12", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder("ORD003", "2025-09-10", "TRK67890", "2025-09-13");

        System.out.println(o1.orderId + ": " + o1.getOrderStatus());
        System.out.println(o2.orderId + ": " + o2.getOrderStatus());
        System.out.println(o3.orderId + ": " + o3.getOrderStatus());
    }
}

