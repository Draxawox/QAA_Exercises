package exercises;

public class Exercise13NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        return (year >= 1 && year <= 9999) && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else {
            if (isLeapYear(year)) {
                if (month == 2) {
                    return 29;
                }
            } else {
                if (month == 2) {
                    return 28;
                }
            }
            if (month % 2 == 1 && month < 9) {
                return 31;
            } else if (month % 2 == 0 && month >= 8) {
                return 31;
            } else {
                return 30;
            }
        }
    }
}