package ArrayProblems.level1;
import java.util.*;
public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11]; 
        double sum = 0.0;
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / 11;
        System.out.println("The mean height of the football team = " + mean);
    }
}