import java.util.*;

	abstract class shape{
		abstract double recarea(double d1,double d2);
		abstract double squarearea(double a);
		abstract double cirarea(double rad);
		}

 class area extends shape{
	 public double recarea(double d1,double d2)
	 {
		 System.out.println("area is"+(d1*d2));
	 }
	  public double squarearea(double a)
	 {
		 System.out.println("area is"+(a*a));
	 }
	  public double cirarea(double rad)
	 {
		 System.out.println("area is"+(3.14*rad*rad));
	 }
 
 }
 class a6_3
 {
	 public static void main(String args[])
	 {
		 shape s=new area();
		 s.recarea(3,2);
		 s.squarearea(4);
		 s.cirarea(9);
	 }
	 
 }
