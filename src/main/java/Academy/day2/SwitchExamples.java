package Academy.day2;

import java.util.Scanner;

public class SwitchExamples {
    public SwitchExamples() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        String message = switch (num) {
            case 11 -> "11";
            case 7 -> "7";
            default -> "no";
        };
        System.out.println(message);
    }
}
