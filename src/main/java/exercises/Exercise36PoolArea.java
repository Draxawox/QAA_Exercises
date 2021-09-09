package exercises;

public class Exercise36PoolArea {
    public static void start(){
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            width = 0;
        } else if (length < 0) {
            length = 0;
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        if (width < 0) {
            width = 0;
        }
        return width;
    }

    public double getLength() {
        if (length < 0) {
            length = 0;
        }
        return length;
    }

    public double getArea() {
        return width * length;
    }
}

class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        if (height < 0) {
            height = 0;
        }
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
