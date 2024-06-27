import java.util.*;
class employee
{
int noh;
float salary;
void getInfo()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter salary in dollar");
 salary=sc.nextFloat();
 System.out.println("enter no of hours working in a day");
 
 
 noh=sc.nextInt();
}
void addSal()
{
if(salary<500)
salary=10+salary;
System.out.println("salary is "+salary);
}
void addWork()
{
if(noh>6)
salary=5+salary;
System.out.println("salary is "+salary);
}
}
class a3_7
{
public static void main(String args[])
{
employee e=new employee();
e.getInfo();
e.addSal();
e.addWork();

}
}