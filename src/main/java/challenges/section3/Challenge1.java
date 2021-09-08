package challenges.section3;

public class Challenge1 {
    public static void print() {
        byte numByte = 1;
        short numShort = 2;
        int numInt = 3;
        long numLong = 50000 + (numByte + numShort + numInt) * 10;
        System.out.println(numLong);
    }

}
