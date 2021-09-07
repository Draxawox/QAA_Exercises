package exercises;

public class Exercise10IntEqualityPrinter {
    public static void printEqual(int a, int b, int c) {
        System.out.println(
                (a < 0 || b < 0 || c < 0) ? "Invalid Value" :
                        (a == b && b == c) ? "All numbers are equal" :
                                (a != b && b != c && a != c) ? "All numbers are different" :
                                        "Neither all are equal or different"
        );
    }
}


