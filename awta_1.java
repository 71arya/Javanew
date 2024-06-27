import java.awt.event.*;
class MyClass extends WindowAdapter{
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class AddDemo extends Frame implements ActionListener{
	TextField t1,t2,t3;
	Button b;
	AddDemo(){
		Frame f=new Frame();
		t1=new TextField("enter the 1st num");
		t1.setBounds(50,50,100,30);
		t2=new TextField("enter the 1st num");
		t2.setBounds(50,50,100,30);
		t3=new TextField("enter the 1st num");
		t3.setBounds(50,50,100,30);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		b=new Button("Add");
		b.setBounds(50,200,100,30);
		f.add(b);
		b.addActionListener(this);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		addWindowListener(new MyClass());
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=t1.getText();
		String s2=t2.getText();
	}
}
class AWTAdd
{
	public static void main(String args[])
	{
		AddDemo ad=new AddDemo();
		ad.setTitle("add 2 nos ");
		ad.setResizable(false);
	}
}