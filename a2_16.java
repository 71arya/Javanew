import java.lang.*;
import java.util.*;
class a2_16
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the 1st elements");
int a;
a=sc.nextInt();
System.out.println("enter the 2nd element");
int b;
b=sc.nextInt();
int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
           if(a%i == 0 && b%i == 0)
           {
            gcd = i;
           } 
        }
        System.out.print("gcd is "+gcd);
}
}
       