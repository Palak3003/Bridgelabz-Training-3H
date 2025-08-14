import java.util.Scanner;
public class SideOfSquare{
      public static void sideOfSquare() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
    public static void main(String[] args){
       sideOfSquare();
    }
}