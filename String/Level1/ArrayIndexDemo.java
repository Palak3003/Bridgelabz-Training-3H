package String.Level1;
import java.util.Scanner;

class ArrayIndexDemo {
    static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
        generateException(names);
        handleException(names);
    }
}

