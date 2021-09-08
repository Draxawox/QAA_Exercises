package exercises;

public class Exercise24FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        do {
            if (5 <= goal && bigCount != 0) {
                goal -= 5;
                bigCount--;
            } else if (smallCount >= goal && smallCount != 0) {
                goal--;
                smallCount--;
            } else {
                return false;
            }
            if (goal == 0) {
                return true;
            }
        } while(true);
    }
}
