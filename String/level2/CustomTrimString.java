package String.Level2;
import java.util.Scanner;

public class CustomTrimString {

    public static int[] findTrimIndexes(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        int start = 0, end = length - 1;

        while (start < length && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String customTrimmed = customSubstring(input, indexes[0], indexes[1]);
        String builtinTrimmed = input.trim();

        System.out.println("Custom Trimmed String: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed String: [" + builtinTrimmed + "]");
        System.out.println("Are both equal? " + compareStrings(customTrimmed, builtinTrimmed));

        sc.close();
    }
}

