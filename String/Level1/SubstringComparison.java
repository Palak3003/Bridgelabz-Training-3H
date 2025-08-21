package String.Level1;
import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSubstring = "";
        for (int i = start; i < end; i++) {
            manualSubstring += text.charAt(i);
        }

        String builtInSubstring = text.substring(start, end);

        boolean areEqual = true;
        if (manualSubstring.length() != builtInSubstring.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < manualSubstring.length(); i++) {
                if (manualSubstring.charAt(i) != builtInSubstring.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Substring (manual charAt): " + manualSubstring);
        System.out.println("Substring (built-in substring()): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);

    }
}

