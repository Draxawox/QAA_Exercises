package challenges.section5;

import java.util.Scanner;

public class Challenge5 {
    public static void scan() {
        Scanner sc = new Scanner(System.in);
        boolean yes = true;
        int sum = 0;
        int counter = 0;
        while (yes) {
            System.out.println("give me a number");
            boolean isNumber= sc.hasNextInt();
            if (isNumber) {
                sum += sc.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            if (counter == 10) {
                yes = false;
                System.out.println(sum);
            }
            sc.nextLine();
        }
        sc.close();
    }
}
