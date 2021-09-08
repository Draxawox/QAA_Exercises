package exercises;

public class Exercise15NumberPalindrome {
    public static boolean isPalindrome(int number) {
        StringBuilder reversed = new StringBuilder();
        number = Math.abs(number);
        for (int i = String.valueOf(number).length() - 1; i >= 0; i--) {
            reversed.append(String.valueOf(number).charAt(i));
        }
        return String.valueOf(reversed).equals(String.valueOf(number));
    }
}
