import java.lang.*;
class A{
int x;
void setA ( int x1) {
x = x1;
}
}
class B extends A{
int y;
void setB( int b) {
y = b;
}
void show(){
System.out.println("y = "+ y + "x ="+ x);
}
}
class C extends A{
int z;
void setC(int c) {
z = c;
}
void show(){
System.out.println("z = "+ z + " x = " + x);
}
}
public class pr{
public static void main(String[] args) {
C ob = new C();
B ob1 = new B();
ob1.setA(10);
ob1.setB(20);
ob1.show();
ob.setA(200);
ob.setC(100);
ob.show();
}
}
