import java.lang.*;
import java.util.*;
class a2_3
{
public static void main(String args[])
{
double sal,tax;
System.out.println("enter salary");
Scanner sc= new Scanner(System.in);
sal=sc.nextDouble();
if(sal<150000)
{
System.out.println("no tax");
}
else if(sal>150000 && sal<=300000)
{
tax=0.1*sal;
System.out.println("tax is" +tax);

}
else if(sal>300000 && sal<=500000)
{
tax=0.2*sal;
System.out.println("tax is" +tax);

}
else if(sal>500000)
{
tax=0.3*sal;
System.out.println("tax is" +tax);

}
else{
System.out.println("no tax");
}

}
}