package challenges.section5;

public class Challenge4 {
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        int numberToAdd;
        while (number > 0) {
            numberToAdd = number % 10;
            sum += numberToAdd;
            number /= 10;
        }
        return sum;
    }
}
