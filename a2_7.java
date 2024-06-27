import java.util.*;
import java.lang.*;
class a2_7
{
public static void main(String args[])
{
int f=1,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num which u want to find fact");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
f=f*i;

}
System.out.println("factorial of a given num is"+f);
}
}