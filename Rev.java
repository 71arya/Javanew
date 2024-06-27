import java.util.*;
class Rev
{
	public static void main(String args[]){
		int i=0,j=0,n=0,x=0,y=0,z=0,temp=0,rev=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of elements in an array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		z=n;
		for(i=0;i<z;i++)
		{
			for(j=i+1;j<z;j++)
			{
				if(a[i]==a[j]);
				{
					for(int k=j;k<z-1;k++)
					{
						a[k]=a[k+1];
					}
					z=z-1;
				}
			}
		}
		System.out.println("the array:");
		for(i=0;i<z;i++)
		{
			System.out.println(a[i]);
		}
	}
}