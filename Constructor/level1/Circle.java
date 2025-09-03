package Constructor.level1;
public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = (radius >= 0) ? radius : 0.0;
    }

    public void displayDetails() {
        System.out.printf("Radius: %.2f%n", radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Default Circle:");
        circle1.displayDetails();

        Circle circle2 = new Circle(5.5);
        System.out.println("\nUser-provided Circle:");
        circle2.displayDetails();
    }
}