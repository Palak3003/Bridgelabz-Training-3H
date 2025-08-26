package String.Level1;
import java.util.Scanner;

class NumberFormatDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        generateException(text);
        handleException(text);
    }
}

