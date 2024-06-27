import java.util.*;
interface calculator
{
	
	void add(int a,int b);
	void subtract(int a,int b);
	void mul(int a,int b);
	void div(int a,int b);
	
}
class res implements calculator
{
	public void add(int a,int b)
	{
		
		System.out.println("sum is"+(a+b));
	}
	public void subtract(int a,int b)
	{
		
		System.out.println("subtraction is"+(a-b));
	}
	public void mul(int a,int b)
	{
		
		System.out.println("multiplication is"+(a*b));
	}
	
	public void div(int a,int b)
	{
		
		System.out.println("div is"+(a/b));
	}
	}
	class a6_2
	{
		public static void main(String args[])
		{
			calculator c = new res();
			c.add(33,2);
			c.subtract(11,2);
			c.mul(8,9);
			c.div(10,2);
		}
	}
