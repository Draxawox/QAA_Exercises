package exercises;

import java.awt.*;

public class Exercise32Point {
    private int x;
    private int y;

    public Exercise32Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Exercise32Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }
    public double distance(int x, int y) {
        return Math.sqrt(-x * -x) + (-y * -y);
    }
    public double distance(Point first) {
        return Math.sqrt((getX() - first.getX()) * (getX() - first.getX()) + (getY() - first.getY()) * (getY() - first.getY()));
    }
}
