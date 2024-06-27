import java.lang.*;
import java.util.*;
class a2_4
{
public static void main(String args[])
{
double mark;
System.out.println("enter mark");
Scanner sc= new Scanner(System.in);
mark=sc.nextDouble();
if(mark>90)
{
System.out.println("grade is o");
}
else if(mark<90 && mark>=80)
{

System.out.println("grade is E");

}
else if(mark<80 && mark>=70)
{
System.out.println("grade is A");

}
else if(mark<70 && mark >=60)
{
System.out.println("grade is B");

}
else if(mark<60 && mark >=50)
{
System.out.println("grade is C");
}
else if(mark<50)
{
System.out.println("grade is F");

}
}
}
