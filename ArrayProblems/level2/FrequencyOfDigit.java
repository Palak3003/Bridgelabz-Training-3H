package ArrayProblems.level2;
import java.util.*;
public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        String numStr = String.valueOf(number);
        int count = numStr.length();
        int[] digits = new int[count];
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}