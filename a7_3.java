import java.util.*;
public class a7_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n =sc.nextInt();
		int [] a=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<=n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the index position");
		int x=sc.nextInt();
		try
		
		{
			System.out.println(a[x]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print(e);
		}
		
	}
}