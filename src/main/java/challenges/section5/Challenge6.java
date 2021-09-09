package challenges.section5;

import java.util.Scanner;

public class Challenge6 {
    public static void minAndMaxInputChallenge() {
        Scanner sc = new Scanner(System.in);
        boolean stillPlaying = true;
        int count = 0;
        int min = 0;
        int max = 0;
        int temp = 0;
        while (stillPlaying) {
            System.out.println("Give me a number: ");
            stillPlaying = sc.hasNextInt();
            if (stillPlaying) {
                temp = sc.nextInt();
                if (count == 0) {
                    count++;
                    max = temp;
                    min = temp;
                } else if (temp > max) {
                    max = temp;
                } else if (temp < min) {
                    min = temp;
                }
            }
            System.out.println("min: " + min + " max: " + max);
        }
    }
}
