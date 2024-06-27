import java.util.Scanner;

class Point2D {
    protected double x, y;
    Point2D() {
        this.x = 0;
        this.y = 0;
    }
Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void getCoord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("2D Coordinates:" + x + ", " + y);
    }
}
class Point3D extends Point2D {
    private double z;

    
    Point3D() {
        super(); 
        this.z = 0;
    }

        Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    void getInput(double x, double y, double z) {
        getCoord(x, y);
        this.z = z;
    }

    void show() {
        System.out.println("3D Coordinates:" + x + ", " + y + ", " + z);
    }
}

class a5_3 {
    public static void main(String[] args) {
        Point2D point2DDefault = new Point2D(); 
        point2DDefault.display();

        Point2D point2DParam = new Point2D(4, 3); 
        point2DParam.display();

        Point3D point3DDefault = new Point3D();
        point3DDefault.show();

        Point3D point3DParam = new Point3D(1, 9, 5); 
        point3DParam.show();
    }
}
