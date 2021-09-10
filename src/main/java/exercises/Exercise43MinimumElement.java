package exercises;

import java.util.Scanner;

public class Exercise43MinimumElement {
}

class MinimumElement {


    private int readInteger() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private int[] readElements(int len) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[len];
        for (int i = 0; i < len; i++) {
            tab[i] = sc.nextInt();
        }
        return tab;
    }

    private int findMin(int[] tab) {
        int min = tab[0];
        for (int j : tab) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
