import java.lang.*;
import java.util.*;
class a2_18
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the num of elements in an array");
int n;
n=sc.nextInt();
System.out.println("enter the array elements");
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the elements you want to search");
int num,x=0;
num=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==num)
{
x=a[i];
System.out.println("element is"+x);
break;
}
}
if(x==0)
	System.out.println("element not found");
}
}