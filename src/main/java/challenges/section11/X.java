package challenges.section11;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 1; x <13; x++) {
            System.out.println(x + " " + this.x + " " + x * this.x);
        }
    }

    public static void main(String[] args) {

        X x = new X(new Scanner(System.in));
        x.x();
    }
}


