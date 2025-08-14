import java.util.Scanner;
public class AreaOfTriangle{
     public static void areaOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 2.54 * 2.54;
        System.out.println("The area of triangle is " + areaInches + " square inches and " + areaCm + " square cm");
    }
    public static void main(String[] args){
       areaOfTriangle();
    }
}