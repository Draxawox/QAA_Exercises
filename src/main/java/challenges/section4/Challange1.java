package challenges.section4;

public class Challange1 {
    public static String getDurationString(int minutes, int seconds) {
        if((minutes <= 0) || (seconds <= 0) || (seconds >= 59)) {
            return "Invalid value";
        } else {
            return minutes / 60 + "h " + minutes % 60 +"m " + seconds;
        }
    }
    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            return "Invalid value";
        } else {
            return getDurationString(seconds / 60, seconds % 60);
        }
    }
}
