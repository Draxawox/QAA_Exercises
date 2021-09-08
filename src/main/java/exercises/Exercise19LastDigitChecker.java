package exercises;

public class Exercise19LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!(isValid(a) && isValid(b) && isValid(c))) {
            return false;
        }

        a = Integer.parseInt(String.valueOf(String.valueOf(a).charAt(String.valueOf(a).length() -1)));
        b = Integer.parseInt(String.valueOf(String.valueOf(b).charAt(String.valueOf(b).length() -1)));
        c = Integer.parseInt(String.valueOf(String.valueOf(c).charAt(String.valueOf(c).length() -1)));

        return (a == b) ||
                (a == c) ||
                (c == b);
    }
    public static boolean isValid(int num) {
        return num <= 1000 && num >= 10;
    }
}