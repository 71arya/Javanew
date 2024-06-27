import java.util.*;
public class a7_4
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the num of elements");
			int n = sc.nextInt();
			int a[] = new int[n];
			System.out.print("Enter the elements ");
			for(int i=0;i<=n; i++)
			{
				a[i] = sc.nextInt();
			}
			System.out.println("enter the index position of the array");
			int x = sc.nextInt();
			System.out.println(1/a[x]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error"+e);
		}
	}
}