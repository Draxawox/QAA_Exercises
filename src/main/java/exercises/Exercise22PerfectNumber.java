package exercises;

import java.util.ArrayList;

public class Exercise22PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 6) {
            return false;
        }
        ArrayList<Integer> divs = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divs.add(i);
            }
        }
        int sum = divs.stream().mapToInt(Integer::intValue).sum();
        return sum == number;
    }
}
