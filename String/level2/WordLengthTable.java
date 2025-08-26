package String.Level2;
import java.util.Scanner;

public class WordLengthTable {

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] customSplit(String str) {
        int length = getStringLength(str);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = str.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = str.substring(start, length);
        return words;
    }

    public static String[][] getWordLengthTable(String[] words) {
        int n = words.length;
        String[][] table = new String[n][2];
        for (int i = 0; i < n; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] result = getWordLengthTable(words);

        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }

        sc.close();
    }
}

