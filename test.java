import btech.*;
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		student s1=new student("arya",26);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of subject");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nexxtInt();
		s1.calculator(n1,n2,n3);
		s1.display();
	}
}