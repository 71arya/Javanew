import java.util.*;
import java.lang.*;
class a2_10                     
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("num of elements in an array");
int n=sc.nextInt();
int a[]=new int[n];
int max=0;
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{

a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println("max element is "+max);
}
}