package String.Level1;
import java.util.Scanner;

class UpperCaseCompare {
    static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String builtInUpper = text.toUpperCase();
        String customUpper = convertToUpper(text);
        boolean isEqual = compareStrings(builtInUpper, customUpper);
        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("Custom convertToUpper(): " + customUpper);
        System.out.println("Comparison result: " + isEqual);
    }
}

