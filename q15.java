import java.lang.*;
import java.util.*;
class q15
{
public static void main(String args[])
{
int a,b,c,d,num;
System.out.println("enter  a 4 digit num");
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
if (num >= 1000 && num <= 9999) {
a = num / 1000;
b = (num % 1000) / 100;
c= (num% 100) / 10;
d= num % 10;
}
int sum =a+b+c+d;
System.outr.println("the sum of num of digits"+sum);
}
}
