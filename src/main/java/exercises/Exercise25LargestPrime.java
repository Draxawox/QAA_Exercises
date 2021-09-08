package exercises;

public class Exercise25LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int count = 0;
        int largest = 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    largest = i;
                }
                count = 0;
            }
        }
        return largest;
    }
}
