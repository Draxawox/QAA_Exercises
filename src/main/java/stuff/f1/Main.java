package stuff.f1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = new int[900000000];
        for (int i = 0; i < 900000000; i++) {
            arr1[i] = i;
        }
        int t = 899999999;
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.equals(arr, arr1));


        long startTime = System.nanoTime();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == t) {
                break;
            }
        }
        long finish = System.nanoTime() - startTime;
//        System.out.println(t);
        long start = System.nanoTime();
//        int r = Arrays.binarySearch(arr1, t);
        System.out.println("Looking for: " + Arrays.binarySearch(arr1, t));
        long finish2 = System.nanoTime() - start;
        System.out.println("linear search: " + finish);
        System.out.println("binary search: " + finish2);
        System.out.println("it's " + finish / finish2 + " times faster");
//
//        Integer[] arr2 = new Integer[4000];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = (int) (Math.random() * 10000);
//        }
//
//        quickSort(arr2);
//
//        System.out.println(Arrays.asList(arr2));
//        System.out.println(LocalDate.of(2029, Month.JANUARY, 1).isLeapYear());

    }

    public static Integer[] quickSort(Integer[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();
            int pivot = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (pivot < arr[i]) {
                    less.add(arr[i]);
                } else {
                    greater.add(arr[i]);
                }
            }
            Object[] newLessMore = mergeArray(less.toArray(Integer[]::new), pivot, greater.toArray(Integer[]::new));

            return (Integer[]) newLessMore;
        }

    }

    public static <T> Object[] mergeArray(T[] arr1, int pivot, T[] arr2) {
        return Stream.of(arr1, pivot, arr2).toArray();
    }

//    str 102
}
