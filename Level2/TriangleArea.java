import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();

      
        double areaSqCm = 0.5 * base * height;

  
        double cmToInch = 2.54; 
        double areaSqInch = areaSqCm / (cmToInch * cmToInch);

    
        System.out.println("\nThe Area of the triangle in sq in is " 
                + areaSqInch + " and sq cm is " + areaSqCm);

        scanner.close();
    }
    
}