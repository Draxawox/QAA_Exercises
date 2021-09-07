package exercises;

public class Exercise11PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return !summer && (temperature >= 25 && temperature <= 35) || (summer && (temperature >= 25 && temperature <= 45));
    }
}
