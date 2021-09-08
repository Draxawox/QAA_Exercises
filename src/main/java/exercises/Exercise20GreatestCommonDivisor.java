package exercises;

public class Exercise20GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int smaller;
        int div = 1;
        if (first < 10) {
            return -1;
        } else if (second < 10) {
            return -1;
        }
        smaller = Math.min(first, second);
        for (int i = 1; i <= smaller; i++) {
            if (first % i == 0 && second % i == 0) {
                div = i;
            }
        }
        return div;
    }
}
