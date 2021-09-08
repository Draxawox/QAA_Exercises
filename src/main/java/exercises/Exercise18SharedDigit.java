package exercises;

public class Exercise18SharedDigit {
    public static boolean hasSharedDigit(int start, int end) {
        if (start < 10 || end > 99 || end < 10 || start > 99) {
            return false;
        }
        int startLen = String.valueOf(start).length();
        int endLen = String.valueOf(end).length();
        for (int i = 0; i < startLen; i++) {
            for (int j = 0; j < endLen; j++) {
                System.out.println("start: " + String.valueOf(start).charAt(i));
                System.out.println("end: " + String.valueOf(end).charAt(j));
                if (String.valueOf(start).charAt(i) == String.valueOf(end).charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
