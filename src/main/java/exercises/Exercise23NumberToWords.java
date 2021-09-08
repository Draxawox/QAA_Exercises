package exercises;

import java.util.ArrayList;

public class Exercise23NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");

        } else {
            int count = getDigitCount(number);
            number = reverse(number);
            int num;
            do {
                num = number % 10;
                number /= 10;
                switch (num) {
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    case 0 -> System.out.println("Zero");
                }
                count--;
            } while (count != 0);
        }
    }

    public static int reverse(int number) {
        StringBuilder sb = new StringBuilder();
        int cut = 1;
        if (String.valueOf(number).charAt(0) == '-') {
            sb.append(String.valueOf(number).charAt(0));
            cut += 1;
        }
        for (int i = String.valueOf(number).length() - cut; i >=0 ; i--) {
            sb.append(String.valueOf(Math.abs(number)).charAt(i));
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }
}
