package String.Level1;
import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            manualArray[i] = text.charAt(i);
        }

        char[] builtInArray = text.toCharArray();

        boolean areEqual = true;
        if (manualArray.length != builtInArray.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < manualArray.length; i++) {
                if (manualArray[i] != builtInArray[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.print("Manual char array: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in toCharArray: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + areEqual);

        sc.close();
    }
}

