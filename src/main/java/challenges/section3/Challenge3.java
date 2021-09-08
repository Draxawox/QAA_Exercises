package challenges.section3;

public class Challenge3 {
    public static void operators() {
        double num1 = 20.00;
        double num2 = 80.00;
        boolean bool = (num1 + num2) * 100 % 40.00 == 0;
        if (!bool) {
            System.out.println("Got some remainder");
        }
    }
}
