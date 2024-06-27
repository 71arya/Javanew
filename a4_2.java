import java.util.*;
class complexnum
{
int realnum;
int img;
 void complexnum(int r,int i)
{
	realnum=r;
	img=i;
}
void display()
{
	System.out.println("real is"+realnum+"img part is"+img);
}
 void addcomplex(complexnum c1,complexnum c2)
{
	this.realnum=c1.realnum+c2.realnum;
	this.img=c1.img+c2.img;

}
}
class a4_2
{
	public static void main(String args[])
	{
	
		complexnum c1=new complexnum(9,8);
		complexnum c2=new complexnum(7,6);
		complexnum c3=new complexnum(0,0);
		c1.display();
		c2.display();
		c3.addcomplex(c1,c2);
		c3.display();
		
	}
}

