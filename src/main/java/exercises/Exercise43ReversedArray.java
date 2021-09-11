package exercises;

import java.util.Arrays;

public class Exercise43ReversedArray {
}

class ReverseArray {

    public void reverse(int[] tab) {
        int temp;
        System.out.println("Array = " + Arrays.toString(tab));
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            }
        }
        System.out.println("Reversed array = " + Arrays.toString(tab));
    }
}