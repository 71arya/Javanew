import java.lang.*;
import java.util.*;
class q10
{
public static void main(String args[])
{
float cel,far;
System.out.println("enter temp in far");
Scanner sc=new Scanner(System.in);
far=sc.nextFloat();
cel=(far-32)*5/9;
System.out.println("tem in cel is" +cel);
}
}