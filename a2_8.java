import java.util.*;
import java.lang.*;
class a2_8
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter a num");
int n;
int count=0;
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}

}
if(count==2)
System.out.println("num is prime");
else
System.out.println("num is not prime");
}
}