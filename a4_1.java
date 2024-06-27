import java.util.*;
class box{
int width;
int height;
int depth;
 void box(int a,int b,int c){
this.width=a;
this.height=b;
this.depth=c;
}
void volume()
{
int vol;
vol=width*height*depth;
System.out.println("vol is "+vol);
}
}
   class a4_1
   {
   public static void main(String args[])
   {
 box x=new box();
 int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of width height and breath");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt(); 
x.box(a,b,c);
x.volume();

}
   }