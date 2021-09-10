package exercises;

import java.util.Scanner;

public class Exercise42SortedArray {
}

class SortedArray {
    public int[] getIntegers(int width) {
        int [] tab = new int[width];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (sc.nextInt());
        }
        return tab;
    }
    public int[] sortIntegers(int[] tab) {
        int num;
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] < tab[j]) {
                    num = tab[i];
                    tab[i] = tab[j];
                    tab[j] = num;
                }
            }
        }
        return tab;
    }

    public void printArray(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Element " + i + " contents " + tab[i]);
        }
    }
}
