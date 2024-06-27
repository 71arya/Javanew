import java.lang.*;
import java.util.*;
class qus13
{
public static void main(String args[])
{
int a,b,c;
System.out.println("enter elements");
Scanner sc=new Scanner(System.in);

a= sc.nextInt();
b= sc.nextInt();
c=(a>b ? a:b);
System.out.println("largest element is"+c);
}
}