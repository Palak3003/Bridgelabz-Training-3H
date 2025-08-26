package String.Level1;
import java.util.Scanner;

class IllegalArgumentDemo {
    static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        generateException(text);
        handleException(text);
    }
}

