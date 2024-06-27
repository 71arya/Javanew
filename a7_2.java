import java.util.Scanner;

public class a7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  x value ");
        double x = sc.nextDouble();

        System.out.print("Enter y value ");
        double y = sc.nextDouble();

        try {
            if (x - y == 0) {
                throw new ArithmeticException("Division not allowed");
            }else {
                double r = x / (x - y);
                System.out.println("Result of x / (x - y) = " +r);
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
    }
}
