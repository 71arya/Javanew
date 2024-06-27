import java.util.*;

class Point2D {
    protected double x, y;

    void getCoord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("2D Coordinates:" + x + ", " + y);
    }
}

class Circle extends Point2D {
     double radius;
    Circle(double x, double y, double radius) {
        getCoord(x, y);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;
    Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    double volume() {
        return area() * height;
    }
}

class a5_4 {
    public static void main(String[] args) {
        Circle circle = new Circle(12,5, 9);
        System.out.println("Area of Circle: " + circle.area());

        Cylinder cylinder = new Cylinder(1, 20, 31, 6);
        System.out.println("Volume of Cylinder: " + cylinder.volume());
    }
}
