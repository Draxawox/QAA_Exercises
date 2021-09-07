package exercises;

public class Exercise1SpeedConverter {

    public static long toMilesPerHour(double kilometers) {
        return kilometers >= 0 ? Math.round(kilometers / 1.609) : -1;
    }

    public static void printConversion (double kilometersPerHour) {
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" :
                (kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / 1.609) + " mi/h"));
    }
}
