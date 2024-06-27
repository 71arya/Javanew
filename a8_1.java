class MyThread extends Thread{
public void run()
{
System.out.println("in side thread"+this.getName());
System.out.println("in side thread"+this.getId());
}
}
class a8_1
{
public static void main(String args[])
{
MyThread t1=new MyThread();
System.out.println("Name of t1"+t1.getName());
System.out.println("id of thread"+t1.getId());
t1.setName("hello");
t1.start();
System.out.println("After setting the name of t1"+t1.getName());
}
}

