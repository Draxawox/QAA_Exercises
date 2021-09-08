package exercises;

public class Exercise17EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = 0; i < String.valueOf(number).length(); i++) {
                if (Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i))) % 2 == 0) {
                    sum += Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i)));
                }
            }
            return sum;
        }
    }
}

