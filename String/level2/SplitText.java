package String.Level2;
import java.util.Scanner;

public class SplitText {

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

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        String[] customResult = customSplit(input);
        String[] builtinResult = input.split(" ");
        boolean isEqual = compareArrays(customResult, builtinResult);

        System.out.println("Custom Split:");
        for (String word : customResult) System.out.println(word);

        System.out.println("Built-in Split:");
        for (String word : builtinResult) System.out.println(word);

        System.out.println("Both results are equal: " + isEqual);
    }
}

