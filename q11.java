import java.lang.*;
import java.util.*;
class q11
{
public static void main(String args[])
{
int sec,hour,min,a,b;
System.out.println("entertime in sec");
Scanner sc=new Scanner(System.in);
sec = sc.nextInt();
hour=sec/3600;
b=sec%3600;
min=b/60;
a=b%60;
System.out.println("time in hh:mm:ss" +hour +min +a);
}
}

