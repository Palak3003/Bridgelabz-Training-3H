import java.util.Scanner;
public class MultipleValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];  
        double total = 0.0;             
        int index = 0;                  
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;  
            }
            if (index == 10) {
                System.out.println("Array is full (max 10 numbers).");
                break; 
            }
            arr[index] = num; 
            index++;          
        }
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }
        System.out.println("\nTotal Sum = " + total);
    }
}