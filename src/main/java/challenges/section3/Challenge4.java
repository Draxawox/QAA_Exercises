package challenges.section3;

public class Challenge4 {
    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position +
                 " on the high score table");
    }
    public static int calculateHighScorePosition(int score) {
        return score > 1000 ? 1 : (score <1000 && score > 500) ? 2 :
                (score < 500 && score > 100) ? 3 : 4;
    }
}
