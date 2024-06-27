import java.lang.*;
import java.util.*;
class q5
{
public static void main(String args[])
{
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("enter two values you want to swap");
a=sc.nextInt();
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("1 st num" +a);
System.out.println("2 ndnum" +b);
}
}