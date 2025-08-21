package ArrayProblems.level2;
import java.util.*;
public class BMIin2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3]; // 0 -> height, 1 -> weight, 2 -> BMI
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            double height;
            do {
                System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
            } while (height <= 0);

            double weight;
            do {
                System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
            if (bmi < 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
            (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}