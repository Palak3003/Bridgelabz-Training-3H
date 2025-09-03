package OOPs.level1;
import java.text.DecimalFormat;

public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        DecimalFormat df = new DecimalFormat("#.##");
        double area = calculateArea();
        double circumference = calculateCircumference();
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + df.format(area) + " square units");
        System.out.println("Circumference of Circle: " + df.format(circumference) + " units");
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Details:");
        circle.displayDetails();
    }
}
