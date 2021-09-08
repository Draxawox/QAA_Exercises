package exercises;

public class Exercise05DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        return ((a < 0 && b < 0) || (a >= 0 && b >= 0)) && Math.floor(Math.abs(a) * 1000) / 1000 == Math.floor(Math.abs(b) * 1000) / 1000;
    }
}