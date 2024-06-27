import java.lang.*;
import java.util.*;
class a2_5
{
public static void main(String args[])
{
double a,b,c,temp,d,root=0;
System.out.println("enter the coefficients of quadretic equation");
Scanner sc= new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
temp=(b*b)-4*a*c;
d=Math.sqrt(temp);
if(d>0)

{
root=((-b)/2*a)+d;
System.out.println("root is "+root);
}
else if(d<0)

{
System.out.println("root is imaginary");
}
else if(d==0)
{
root=((-b)/2*a);
System.out.println("root is "+root);
}
System.out.println("root is "+root);
}
}
