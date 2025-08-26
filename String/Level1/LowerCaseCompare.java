package String.Level1;
import java.util.Scanner;

class LowerCaseCompare {
    static String convertToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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
        String builtInLower = text.toLowerCase();
        String customLower = convertToLower(text);
        boolean isEqual = compareStrings(builtInLower, customLower);
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Custom convertToLower(): " + customLower);
        System.out.println("Comparison result: " + isEqual);
    }
}

