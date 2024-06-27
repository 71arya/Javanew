class  TestThread implements Runnable{
Thread t;
TestThread()
{
t=new Thread(this,"Num Thread");
System.out.println("child Thread"+t);
}
public void run()
{
int m,n;
Scanner sc= new Scanner(System.in);
System.out.println("Enter thge num");
n=sc.nextInt();
try
{
int rev=0,t,d;
t=n;
while(n!=0)
{
d=n%10;
rev=rev*10+d;
n=n/10;
}
if(rev==t)
System.out.println("palindrome");
else
System.out.println("not a palindrome");
Thread.sleep(1);
}
catch(InterruptedException e)
{
System.out.println("Interrupted Exception");
}
System.out.priontln("Exiting child thread");
}
}
class NumThread
{
public static void main(String args[])
{
TestThread nt=new ThreadThread();
n1.t.start();
try
{
Thread.sleep(10000);
int num=13;
boolean f=false;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
f=true;
break;
}
}
if(f==false)
System.out.println("false");
}
}