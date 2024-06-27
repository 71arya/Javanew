import java.util.*;
class employee
{
String name;
int year_of_joining;
float salary;
String address;
void input()
{
Scanner sc =new Scanner(System.in);
name=sc.next();
year_of_joining=sc.nextInt();
salary=sc.nextFloat();
address=sc.next();
}
void display()
{
	System.out.println("name is"+name);
	System.out.println("year of joining"+year_of_joining);
	System.out.println("salary"+salary);
	System.out.println("address"+address);
}
}
class a3_5
{
public static void main(String args[])
{
employee [] e=new employee[3];
int i;
for(i=0;i<3;i++)
e[i]=new employee(); 
for(i=0;i<3;i++)
{
e[i].input();
}
for(i=0;i<3;i++)
{
e[i].display();
}
}
}