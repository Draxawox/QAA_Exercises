package challenges.section7;

public class Challenge2 {
    public static void start() {

    }
}

class Printer {
    private int tonerLevel ;
    private int numberOfPagesPrinted;
    private boolean canPrintOnBothSides;

    public Printer(boolean canPrintOnBothSides) {
        this.tonerLevel = 100;
        this.numberOfPagesPrinted = 0;
        this.canPrintOnBothSides = canPrintOnBothSides;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isCanPrintOnBothSides() {
        return canPrintOnBothSides;
    }

    public void print() {
        if (getTonerLevel() > 0) {
            System.out.println("Printing");
            numberOfPagesPrinted++;
            tonerLevel--;
        } else {
            System.out.println("Fill up toner");
        }
    }

    public void fillUpToner(int num) {
        if (getTonerLevel() + num > 100) {
            tonerLevel = 100;
        } else {
            tonerLevel += num;
        }
    }

    public void checkTonerLevel() {
        System.out.println("Toner left: " + getTonerLevel() + "%");
    }
}
