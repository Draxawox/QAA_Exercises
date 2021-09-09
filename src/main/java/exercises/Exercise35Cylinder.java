package exercises;

public class Exercise35Cylinder {
    public static void start() {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}

class Circle {
    private double radius;

    public double getRadius() {
        if (radius < 0) {
            radius = 0;
        }
        return radius;
    }

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
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
