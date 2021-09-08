package exercises;

public class Exercise04LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        return (year >= 1 && year <= 9999) && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}

/*
To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step
2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.

The following years are leap years:
1600, 2000, 2400
This is because they are evenly divisible by both 100 and 400.

Examples of input/output:

* isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

* isLeapYear(1600); → should return true since 1600 is a leap year

* isLeapYear(2017); → should return false since 2017 is not a leap year

* isLeapYear(2000);  → should return true because 2000 is a leap year

NOTE: The method isLeapYear needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */
