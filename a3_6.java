import java.util.*;
class Area
{
int breath;
int length;
 void setDim()
{
System.out.println("enter length and breath of the rectangle");
Scanner sc =new Scanner(System.in);
breath=sc.nextInt();
length=sc.nextInt();

}
void getArea()
{
int a;
a=length*breath;
System.out.println("area is"+a);
}
}
class a3_6
{
public static void main(String args[])
{
Area  x=new Area();
x.setDim();
x.getArea();

}
}
