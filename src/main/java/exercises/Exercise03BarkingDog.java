package exercises;

public class Exercise03BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hour) {
        return hour >= 0 && hour <= 23 && ((hour < 8 || hour >= 23) && barking);
    }
}
