import java.util.ArrayList;

public class PatientListExample {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();

        patients.add("Alice");
        patients.add("Tushar");
        patients.add("Carol");
        patients.add("David");
        patients.add("Amy");

        System.out.println("Patients starting with 'A':");

        for (String patient : patients) {
            if (patient.startsWith("A")) {
                System.out.println(patient);
            }
        }
    }
}

import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener {
	Frame f = new Frame();
	Label l1 = new Label("First Number ");
	Label l2 = new Label("Second Number ");
	Label l3 = new Label("Result ");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	Button Add = new Button("Add");
	Button Sub = new Button("Sub");
	Button Mul = new Button("Mul");
	Button Div = new Button("Div");
	Button Clear = new Button("Clear");

	Calculator() {
		l1.setBounds(50, 100, 100, 20);
		l2.setBounds(50, 140, 100, 20);
		l3.setBounds(50, 180, 100, 20);
		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		t3.setBounds(200, 180, 150, 20);
		Add.setBounds(50, 250, 50, 20);
		Sub.setBounds(110, 250, 50, 20);
		Mul.setBounds(170, 250, 50, 20);
		Div.setBounds(230, 250, 50, 20);
		Clear.setBounds(290, 250, 50, 20);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(Add);
		f.add(Sub);
		f.add(Mul);
		f.add(Div);
		f.add(Clear);
		Add.addActionListener(this);
		Sub.addActionListener(this);
		Mul.addActionListener(this);
		Div.addActionListener(this);
		Clear.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 350);
		f.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		int result;
		if (str.equals("Add")) {
			result = n1 + n2;
			t3.setText("" + result);
		}
		if (str.equals("Sub")) {
			result = n1 - n2;
			t3.setText("" + result);
		}
		if (str.equals("Mul")) {
			result = n1 * n2;
			t3.setText("" + result);
		}
		if (str.equals("Div")) {
			if (n2 == 0)
				t3.setText("Not divisible by zero");
			else {
				result = n1 / n2;
				t3.setText("" + result);
			}
		}
		if (str.equals("Clear")) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}

	public static void main(String args[]) {
		new Calculator();
	}
}
