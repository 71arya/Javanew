import java.lang.*;
import java.util.*;
class a2_19
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the num of elements in an array");

int n;
n=sc.nextInt();
System.out.println("enter the array elements");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
{
int temp;
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
