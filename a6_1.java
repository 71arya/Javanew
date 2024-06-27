import java.util.*;
abstract class  bank{
	abstract double getroi();
}
class sbi extends bank{
	public double getroi(){
		return 3.0;
		
	}
}

class pnb extends bank
{
	public double getroi(){
		return 4.5;
	}
}
class boi extends bank{
	public double getroi(){
		return 3.2;
	}
}
class a6_1{
	public static void main(String args[])
	{
		double i;
		bank a=new sbi();
		i=a.getroi();
		System.out.println("rate of interest of sbi is"+i);
		bank b=new pnb();

		i=b.getroi();
		System.out.println("rate of interest of pnb is"+i);
		bank c=new boi();
		
		i=c.getroi();
		System.out.println("rate of interest is"+i);
	}
}

