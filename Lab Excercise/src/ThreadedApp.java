import javax.swing.*;
import java.awt.*;

class IncrementNumbersTask implements Runnable {
	private JTextArea textArea;

	IncrementNumbersTask(JTextArea textArea) {
		this.textArea = textArea;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			textArea.append(String.valueOf(i) + "\n");
		}
	}
}

class SquareNumbersTask implements Runnable {
	private JTextArea textArea;

	SquareNumbersTask(JTextArea textArea) {
		this.textArea = textArea;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			textArea.append(String.valueOf(i * i) + "\n");
		}
	}
}

public class ThreadedApp extends JFrame {
	private JTextArea textArea1;
	private JTextArea textArea2;

	public ThreadedApp() {
		setTitle("Threaded Application");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		textArea1 = new JTextArea(10, 10);
		container.add(new JScrollPane(textArea1));
		textArea2 = new JTextArea(10, 10);
		container.add(new JScrollPane(textArea2));
		setVisible(true);
	}

	public static void main(String[] args) {
		ThreadedApp app = new ThreadedApp();
		Thread thread1 = new Thread(new IncrementNumbersTask(app.textArea1));
		Thread thread2 = new Thread(new SquareNumbersTask(app.textArea2));
		thread1.start();
		thread2.start();
	}
}