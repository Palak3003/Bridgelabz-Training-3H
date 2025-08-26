package String.level3;
import java.util.Scanner;

public class BmiCalculator {

    // Method to calculate BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm → m
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.1f", heightCm),
                            String.format("%.1f", weight),
                            String.format("%.2f", bmi),
                            status};
    }

    // Method to compute BMI for all persons
    public static String[][] computeAllBMI(double[][] hwData) {
        String[][] result = new String[hwData.length][4];

        for (int i = 0; i < hwData.length; i++) {
            result[i] = calculateBMI(hwData[i][0], hwData[i][1]);
        }
        return result;
    }

    // Method to display results in tabular form
    public static void display(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (String[] row : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hwData = new double[10][2]; // 10 rows, 2 columns

        System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            hwData[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            hwData[i][1] = sc.nextDouble();
        }

        String[][] bmiData = computeAllBMI(hwData);
        display(bmiData);
    }
}
