import java.util.*;
class emloyee
{
private String empName;
private String empNo;
private int dependentCnt; 
Employee(String name, String eno, int depcnt)
{
	empName=name;
	empNo=eno;
	dependentCnt=depcnt;
}
void showEmpDetails()
{
	System.out.println("emp name is "+empName+"emp no is"+empNo);
}
intdepCount()
{
System.out.println(dependentCnt);
}
}
class EmpTest 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the num of employees");
	n=sc.nextInt();
	int i;
	for(i=0;i<n;i++)
	
	}
}