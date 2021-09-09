package exercises;

import java.util.Scanner;

public class Exercise27InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        boolean isGoing = true;
        int counter = 0;
        int sum = 0;
        int num = 0;
        while (isGoing) {
            isGoing = sc.hasNextInt();
            if (isGoing) {
                num = sc.nextInt();
                counter++;
                sum += num;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + (int)Math.round((double) sum / counter));
    }
}
