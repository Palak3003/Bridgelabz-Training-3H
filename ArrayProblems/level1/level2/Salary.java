package ArrayProblems.level2;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Salary: ");
            double s = sc.nextDouble();
            System.out.print("Years of Service: ");
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; 
                continue;
            }
            salary[i] = s;
            years[i] = y;
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i]; 
            } else {
                bonus[i] = 0.02 * salary[i]; 
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }
        System.out.println("\n--- Totals ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}