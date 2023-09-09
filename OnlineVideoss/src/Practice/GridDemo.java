package Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridDemo extends JFrame 
{
	JFrame jf;
	GridDemo(){
		jf=new JFrame ("GridLayout Example");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("X");
		
		JButton button5 = new JButton("4");
		JButton button6 = new JButton("5");
		JButton button7 = new JButton("6");
		JButton button8 = new JButton("-");
		
		JButton button9 = new JButton("7");
		JButton button10 = new JButton("8");
		JButton button11 = new JButton("9");
		JButton button12 = new JButton("+");
		
		JButton button13 = new JButton("0");
		JButton button14 = new JButton(".");
		JButton button15 = new JButton("=");
		JButton button16 = new JButton("Result");
		
		jf.setLayout(new GridLayout(4,4));
		
		jf.add(button1);
		jf.add(button2);
		jf.add(button3);
		jf.add(button4);
		
		jf.add(button5);
		jf.add(button6);
		jf.add(button7);
		jf.add(button8);
		
		jf.add(button9);
		jf.add(button10);
		jf.add(button11);
		jf.add(button12);
		
		jf.add(button13);
		jf.add(button14);
		jf.add(button15);
		jf.add(button16);
		
		jf.setSize(300,200);
		jf.setVisible(true);
	}
	

	public static void main(String[] args) {
		new GridDemo();
		
	}

}
