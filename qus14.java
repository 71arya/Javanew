import java.lang.*;
import java.util.*;
class qus14
{
public static void main(String args[])
{
int a,b,c,largest;
System.out.println("enter elements");
Scanner sc=new Scanner(System.in);

a= sc.nextInt();
b= sc.nextInt();
c= sc.nextInt();
largest = (a >b) ? ((a > c) ? a :c) : ((b >c) ? b : c);
System.out.println("largest ele is"+largest);
}
}