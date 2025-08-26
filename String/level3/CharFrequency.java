package String.level3;
import java.util.Scanner;

public class CharFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);
            if (freq[ascii] < 0) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(-freq[ascii]);
                freq[ascii] = 0;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freqData = findFrequency(text);

        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : freqData) {
            System.out.printf("%-9s | %s\n", row[0], row[1]);
        }

        sc.close();
    }
}

