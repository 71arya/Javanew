import java.awt.*;
import java.awt.event.*;
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class First extends Frame{
	First(){
	
        Button b=new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
       setSize(30,300);
        setLayout(null);
        setVisible(true);
		addWindowListener(new MyClass());
}
}
class awt_1
{
	public static void main(String args[])
	{
		First f=new First();
		f.setTitle("my awt program");
	}
}