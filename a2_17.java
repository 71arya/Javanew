import java.lang.*;
import java.util.*;
class a2_17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the num of elements in an array");
int n,l=0,s=0;
n=sc.nextInt();
System.out.println("enter the array elements");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]<a[i])
s=a[i];
else if(a[i]>l)
l=a[i];
}
System.out.println("largest element is"+l+" the smallest element is"+s);
}
}