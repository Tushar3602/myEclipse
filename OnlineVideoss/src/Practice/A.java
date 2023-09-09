package Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A extends JFrame{

	JLabel label1,label2;
	JTextField field1,field2;
	JButton button1,button2,button3;
	JFrame jf;
	A()
	{
		jf=new JFrame("FlowLayout Example");
		jf.setSize(400, 150);
		label1 = new JLabel("Enter your name");
		label2 = new JLabel("Enter your city");
		field1 = new JTextField(15);
		field2 = new JTextField(15);
		button1 = new JButton("Clear");
		button2 = new JButton("Submit");
		button3 = new JButton("Exit");
		jf.setLayout(new FlowLayout());
		jf.add(label1);
		jf.add(field1);
		jf.add(label2);
		jf.add(field2);
		jf.add(button1);
		jf.add(button2);
		jf.add(button3);
		jf.setSize(300,200);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new A();
	}

}
