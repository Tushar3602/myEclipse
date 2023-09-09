package Practice;
import javax.swing.*;
import java.awt.*;
public class B extends JFrame {
	
	JLabel l1,l2,l3,l4,l5;
	JTextField f1,f2,f3,f4;
	JButton b1,b2;
	JCheckBox cb1,cb2;
	JFrame jf;
	B()
	{
		jf= new JFrame("Example");
		jf.setSize(500, 200);
		l1=new JLabel("Name:");
		l2=new JLabel("Address:");
		l3=new JLabel("Mobile:");
		l4=new JLabel("Gender:");
		l5=new JLabel("Blood Group:");
		f1=new JTextField(15);
		f2=new JTextField(15);
		f3=new JTextField(15);
		f4=new JTextField(10);
		b1=new JButton("Submit");
		b2=new JButton("Clear");
		cb1=new JCheckBox("Male");
		cb2=new JCheckBox("Female");
		jf.setLayout(new FlowLayout());
		jf.add(l1);
		jf.add(f1);
		jf.add(l2);
		jf.add(f2);
		jf.add(l3);
		jf.add(f3);
		jf.add(l4);
		jf.add(cb1);
		jf.add(cb2);
		jf.add(l5);
		jf.add(f4);
		jf.add(b1);
		jf.add(b2);
		jf.setSize(300, 200);
		jf.setVisible(true);
		}
	public static void main(String[] args) {
		new B();
	}
	

}
