import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleMover extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x, y; // The current position of the circle

	public CircleMover() {
		setBackground(Color.WHITE);
		// Add a mouse motion listener to track mouse movement
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				// Update the position of the circle
				x = e.getX();
				y = e.getY();
				repaint(); // Redraw the panel with the new position
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(x - 10, y - 10, 20, 20);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Circle Mover");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 400);
		CircleMover panel = new CircleMover();
		frame.add(panel);
		frame.setVisible(true);
	}
}