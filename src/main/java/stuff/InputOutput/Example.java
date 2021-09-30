package stuff.InputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        return x / y;
    }

    private static int getInt() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("digits 0 - 9");
            }
        }
    }
}
