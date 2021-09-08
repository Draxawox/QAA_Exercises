package exercises;

public class Exercise09MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        System.out.println(minutes < 0 ? "Invalid Value" :
                minutes + " min = " +
                ((minutes / 60) / 24) / 365 + " y and " +
                ((minutes /60) / 24) % 365 + " d");
    }
}


