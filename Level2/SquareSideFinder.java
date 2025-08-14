import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4;
        System.out.println("The side of the square is " + side);
        scanner.close();
    }
    
}