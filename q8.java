import java.lang.*;
import java.util.*;
class q8
{
public static void main(String args[])
{
int m1,m2,m3,m4,m5,avg;
System.out.println("enter mark of each sub");
Scanner sc=new Scanner(System.in);
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
avg=(m1+m2+m3+m4+m5)/5;
System.out.println("avg mark is"+avg);
}
}