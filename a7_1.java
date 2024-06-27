import java.util.Scanner;

public class a7_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2,c;

        System.out.print("Enter the 1st num ");
        n1 = scanner.nextInt();
		  System.out.print("Enter the 2nd ");
                n2 = scanner.nextInt();

            try {
          
                c=n1/n2;
                }

            catch (ArithmeticException e) {
                System.out.println("again enter the value of b");
				n2=scanner.nextInt();
				c=n1/n2;
				System.out.println(c);
            }
        }
    }

