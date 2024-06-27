package btech;
public class student
{
String name;
int rollNo;
public student(String name,int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
}
public void calculator(int m1,int m2,int m3)
{
	int total=m1+m2+m3;
	int percentage=(m1+m2+m3)/3;
	System.out.println("percentage is:"+percentage);
}
	
	public void display()
	{
		System.out.println("name is"+rollNo+"Rollno is:"+name);
	}
}
