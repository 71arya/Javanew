import java.lang.*;
class person
{
	String name;
	public person(String name1)
	{
		this.name=name1;
	}
	void display()
	{
		System.out.println("name is "+name);
	}
	
}
class employee extends person{
	int empid;
	employee(int empid)
	{
		this.empid=empid;
	}
	public void display()
	{
		System.out.println("empid is"+empid);
	}
}
class hourlyemployee extends employee{
	private int hourlyrate;
	private int hourlyworked;
	hourlyemployee(int hourlyrate,int hourlyworked)
	{
		this.hourlyrate=hourlyrate;
		this.hourlyworked=hourlyworked;
	}
	double getgrosspay()
	{
		return hourlyrate*hourlyworked;
	}
	public void display()
	{
		super.display();
		System.out.println("hourly rate"+hourlyrate);
		System.out.println("hourly worked"+hourlyworked);
		System.out.println("grosspay"+getgrosspay());
	}
}
public class a5_6
{
	public static void main(String args[])
	{
		hourlyemployee emp=new hourlyemployee("Arya",75,100,3000);
		emp.display();
	}
}