import java.util.*;
import java.lang.*;
class a2_6
{
public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
System.out.println("enter num for which u want to display the day");
int n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("monday");
break;
case 2:
System.out.println("tuesday");
break;
case 3:
System.out.println("thursday");
break;
case 4:
System.out.println("friday");
break;
case 5:
System.out.println("saturday");
case 6:
System.out.println("sunday");
}
}
}