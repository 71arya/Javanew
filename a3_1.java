import java.util.*;
class average
{
int i,j,k;
void initialize(int a,int b,int c)
{
i=a;
j=b;
k=c;
}
void cal()
{
double avg;
avg=(j+k+i)/3;
System.out.println(avg);
}
}
class a3_1
{
 public static void main(String args[])
{
average a=new average();
System.out.println("enter num u want to find the avg");
int x,y,z;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
a.initialize(x,y,z);
a.cal();
}
}
