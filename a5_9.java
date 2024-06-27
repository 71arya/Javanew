import java.lang.*;
class figure
{
	double dim1;
	double dim2;
	public figure(double dim1,double dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	public double area()
	{
		System.out.println("area is");
		return 0;
	}
}
class Rectangle extends figure{
	public Rectangle(double length,double width)
	{
	super(length,width);
	}
	public double area(){
		System.out.println("area is");
		return dim1*dim2;
	}
	class Triangle extends figure{
	public Triangle(double base,double height)
	{
	super(base,height);
	}
	public double area(){
		System.out.println("area is");
		return 0.5*dim1*dim2;
	}
	}
	class Square extends figure{
	public Square(double side)
	{
	super(side,side);
	}
	public double area(){
		System.out.println("area is");
		return dim1*dim1;
	}
	}
}
	public class a5_9
{
	public static void main(String args[]){
	Rectangle rectangle=new Rectangle(8,9);
	Triangle triangle=new Triangle(3,6);
	Square square=new Square(7);
	figure figure1=rectangle;
	figure figure2=triangle;
    figure figure3=square;
	System.out.println("arae of triangle is"+figure1.area());
	System.out.println("arae of rectangle is"+figure2.area());
	System.out.println("arae of square is"+figure3.area());
	}
}
