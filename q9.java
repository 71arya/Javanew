import java.lang.*;
import java.util.*;
class q9
{
public static void main(String args[])
{
float principal_amt,rate_of_interest,time,simple_interest;
System.out.println("enter principle amount");
Scanner sc=new Scanner(System.in);
principal_amt=sc.nextFloat();
System.out.println("enter rate of interest");
rate_of_interest=sc.nextFloat();
System.out.println("enter principle amount");
time=sc.nextFloat();
simple_interest=(principal_amt*rate_of_interest*time)/100;
System.out.println("simplle interest is"+simple_interest);
}
}

