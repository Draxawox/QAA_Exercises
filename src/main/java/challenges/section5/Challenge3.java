package challenges.section5;

public class Challenge3 {
    public static void addingNumbersDivisibleBy3And5() {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                counter++;
                sum += i;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
}
