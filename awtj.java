import java.awt.*;
import java.awt.event.*;
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class First extends Frame implements ActionListener{
	First(){
	
        Button b=new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
       setSize(30,300);
        setLayout(null);
        setVisible(true);
		addWindowListener(new MyClass());
	
}

public void paint(Graphics g)
	{
	this.setBackground(new color(140,50,50));
	}
	public void actionPerformed(ActionEvent ae)
	{
	String str=ae.getActionCommand();
	if(str.equals("Yellow"))this.setBackground(color.yellow);
	}
}
class awtj
{
	public static void main(String args[])
	{
		First f=new First();
		f.setTitle("my awt program");
	}
}