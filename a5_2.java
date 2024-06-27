import java.util.Scanner;
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
class Point3D extends Point2D {
    private double z;
     void getInput(double x, double y, double z) {
        getCoord(x, y); 
        this.z = z;
    }
    void show() {
        System.out.println("3D Coordinates:"+ x + ", " + y + ", " + z );
    }
}
class a5_2{
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.getCoord(4,3);
        point2D.display();
        Point3D point3D = new Point3D();
        point3D.getInput(1, 9, 5);
        point3D.show();
    }
}