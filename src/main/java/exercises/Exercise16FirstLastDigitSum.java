package exercises;

public class Exercise16FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        return number < 0 ? -1 :
                Integer.parseInt(String.valueOf(String.valueOf(number).charAt(0))) +
                        Integer.parseInt(String.valueOf(String.valueOf(number)
                                .charAt(String.valueOf(number).length() - 1)));
    }
}
